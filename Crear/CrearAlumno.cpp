#include "soapH.h" /* get the gSOAP-generated definitions */
#include "CrearAlumno.nsmap" /* get the gSOAP-generated namespace bindings */
#include <iostream>
#include <string>
#include "mysql_connection.h"
#include <cppconn/driver.h>
#include <cppconn/exception.h>
#include <cppconn/resultset.h>
#include <cppconn/statement.h>
#include <cppconn/prepared_statement.h>
#include "md5.h"
#define PATH "/var/log/CreaAlumno/"
#define server "localhost"
#define user "root"
#define pass ""
#define database "NovaConnect"
#define table "Users"

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
int ns__getInfo(struct soap *soap, struct Input *insert, struct ns__getInfoResponse *result_soap)
{
	sql::Driver *driver;
	sql::Connection *con;
	sql::Statement *stmt;
	sql::ResultSet *res;
	sql::PreparedStatement *pstmt;

	std::string nombre(insert->Name);
	std::string fname(insert->FLastName);
	std::string sname(insert->SLastName);
	std::string mail(insert->Email);
	std::string del(insert->Delegation);
	std::string passw(insert->passw);
	std::string dir(insert->Direction);

	char query[1000];

	//char nombre[45];

	//sprintf(nombre,insert->nombre);

	try{
		driver = get_driver_instance();
		con = driver->connect(server, user, pass);
		con->setSchema(database);

	}catch(sql::SQLException &e){
		 return soap_sender_fault(soap, "Error -1", "ERROR Conexion con Base de Datos");
	}

	try{

		//sprintf(query, "INSERT INTO %s(UserFirstLastName, UserSecondLastName, UserRealName, UserTelephone, UserEmail, UserDel, UserPass, UserDir) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", table);

		pstmt = con->prepareStatement("CALL sp_registerUser(?, ?, ?, ?, ?, ?, ?, ?)");
		pstmt->setString(1, fname);
		pstmt->setString(2, sname);
		pstmt->setString(3, nombre);
		pstmt->setInt(4, insert->Telephone);
		pstmt->setString(5, mail);
		pstmt->setString(6, del);
		pstmt->setString(7, passw);
		pstmt->setString(8, dir);

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
	}
	result_soap->recepcion="OK";

	return SOAP_OK;
	delete pstmt;
}
