#include "soapCrearAlumnoProxy.h"
#include "CrearAlumno.nsmap"
struct Input{
	char *nombre;
};
int main()
{
   CrearAlumnoProxy service;
   Input *al={
   	"Ayaya"
   };
   char *result;
   if (service.getInfo(al, result) == SOAP_OK)
      std::cout << "VA" << std::endl;
   else
      service.soap_stream_fault(std::cerr);
   service.destroy(); // delete data and release memory
} 