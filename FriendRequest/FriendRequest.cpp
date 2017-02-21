#include "soapH.h"
#include "FriendRequest.nsmap"
#include <iostream>
#include "mysql_connection.h"
#include <cppconn/driver.h>
#include <cppconn/exception.h>
#include <cppconn/resultset.h>
#include <cppconn/statement.h>
#include <cppconn/prepared_statement.h>
#define PATH "/var/log/FriendRequest/"
#define server "localhost"
#define user "root"
#define pass ""
#define database "NovaConnect"


int main(){
	struct soap soap;
	soap_init(&soap);
	time_t tiempo = time(0);
	struct tm *tlocal = localtime(&tiempo);
	char fechaActual[128];
	strftime(fechaActual,128,"%Y%m%d",tlocal);

	char fechaHora[128];
	strftime(fechaHora,128,"%Y%m%d%H%M%S",tlocal);

	char logf1[1000000];
	char logf2[1000000];
	char logf3[1000000];

	sprintf(logf1,"%s%s%s",PATH,fechaActual,"_entrada.log");
	sprintf(logf2,"%s%s%s",PATH,fechaActual,"_salida.log");
	sprintf(logf3,"%s%s%s",PATH,fechaHora,"_fordebug.log");
	soap_set_recv_logfile(&soap, logf1);
	soap_set_sent_logfile(&soap, logf2);
	soap_set_test_logfile(&soap, logf3);
	soap_serve(&soap);
}
int ns__getInfo(struct soap *soap, struct Input *fr, struct ns__getInfoResponse *result_soap)
{
	sql::Driver *driver;
	sql::Connection *con;
	sql::Statement *stmt;
	sql::ResultSet *res;
	sql::PreparedStatement *pstmt;
	int user1 = fr->Id_sender;
	int user2 = fr->Id_receiver;

	try{
		driver = get_driver_instance();
		con = driver->connect(server, user, pass);
		con->setSchema(database);	
	}catch(sql::SQLException &e){
		return soap_sender_fault(soap, "Error -1", "Error al conectar");
	}

	try{
		pstmt = con->prepareStatement("CALL sp_addFriend(?, ?)");
		pstmt->setInt(1, user1);
		pstmt->setInt(2, user2);

		pstmt->executeUpdate();
	}catch(sql::SQLException &e){
			  std::cout << "# ERR: SQLException in " << __FILE__;
	  std::cout << "(" << __FUNCTION__ << ") on line "
	     << __LINE__ << std::endl;
	  std::cout << "# ERR: " << e.what();
	  std::cout << " (MySQL error code: " << e.getErrorCode();
	  std::cout << ", SQLState: " << e.getSQLState() <<
	     " )" << std::endl;
			 return soap_sender_fault(soap, "Error 3", "Registro No Ingresado");
	
		result_soap->response="OK";

		return SOAP_OK;
		delete pstmt;
	}
}
