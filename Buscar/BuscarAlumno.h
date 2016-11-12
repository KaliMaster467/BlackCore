//gsoap ns service name: BuscarAlumno
//gsoap ns service namespace: urn:BuscarAlumno
//gsoap ns service location: http://localhost/cgi-bin/BuscarAlumno.cgi
//gsoap ns schema namespace: urn:BuscarAlumno

#import "Usuario.h"

int ns__getInfo(char *user, char * pass, ns__Usuario *result_soap);
