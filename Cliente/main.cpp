#include "soapCrearAlumnoProxy.h"
#include "CrearAlumno.nsmap"
struct Input{
	char *nombre;
};
int main()
{
   CrearAlumnoProxy service;
   ns1__Input *in = new ns1__Input();
   in->nombre = "Bob";
   ns1__getInfoResponse *result= new ns1__getInfoResponse();
   _ns1__getInfo *info = new _ns1__getInfo();
   info->insert = in;
   

   
   service.getInfo(in, result);
   service.destroy(); // delete data and release memory
} 