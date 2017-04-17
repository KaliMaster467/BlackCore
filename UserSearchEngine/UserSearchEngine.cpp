#include <soapH.h>
#include <UserSearchEngine.nsmap>
#include <iostream>
#include "mysql_connection.h"
#include <cppconn/driver.h>
#include <cppconn/exception.h>
#include <cppconn/resultset.h>
#include <cppconn/statement.h>
#include <cppconn/prepared_statement.h>

//Inicializamos el arreglo de usuarios.
std::string users[5];
int id[5];
int cont;

int main()
{
    struct soap soap;
    soap_init(&soap);
    soap_serve(&soap);
}
int ns_getInfo(struct soap *soap, struct Input *users, struct ns_getInfoResponse *result_soap)
{
    sql::Driver *driver;
    sql::Connection *con;
    sql::Statement * stmt;
    sql::ResultSet *res;
    sql::PreparedStatement *pstmt;
}