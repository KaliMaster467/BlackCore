#include "Database.h"

#define server "localhost"
#define user "root"
#define pass ""
#define database "NovaConnect"
#define table "Users"

Database::Database()
{
  this->connect();
}
Database::~Database()
{

}
bool Database::connect()
{
  try{

    //Se crea la conexión

    driver = get_driver_instance();
    con = driver->connect(server, user, pass);
    con->setSchema(database);

  }catch(sql::SQLException &e){

    std::cout << "# ERR: SQLException in " << __FILE__;
    std::cout << "(" << __FUNCTION__ << ") on line "
       << __LINE__ << std::endl;
    std::cout << "# ERR: " << e.what();
    std::cout << " (MySQL error code: " << e.getErrorCode();
    std::cout << ", SQLState: " << e.getSQLState() <<
       " )" << std::endl;

  }
}
