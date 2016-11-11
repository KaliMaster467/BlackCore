#include <iostream>
#include "mysql_connection.h"
#include <cppconn/driver.h>
#include <cppconn/exception.h>
#include <cppconn/resultset.h>
#include <cppconn/statement.h>
#include <cppconn/prepared_statement.h>


/*Database creator: Definicion de la Base de datos.*/

class Database{
public:
    Database();
    ~Database();
    void connect();
    void Insert();
    void Retreive();
private:
      sql::Connection *con;
      sql::Driver *driver;
      sql::Statement *stmt;
      sql::ResultSet *res;
      sql::PerparedStatement *pstmt;
}
