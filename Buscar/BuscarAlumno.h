//gsoap ns service name: BuscarAlumno
//gsoap ns service namespace: urn:BuscarAlumno
//gsoap ns service location: http://192.168.1.69/cgi-bin/BuscarAlumno.cgi
//gsoap ns schema namespace: urn:BuscarAlumno

#import "Usuario.h"
struct Input{
  char *user;
  char *pass;
};
int ns__getInfo(struct Input *search, ns__Usuario *result_soap);
