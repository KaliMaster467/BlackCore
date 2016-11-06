//gsoap ns service name: CrearAlumno
//gsoap ns service namespace: urn:CrearAlumno
//gsoap ns service location: http://localhost/cgi-bin/CrearAlumno.cgi
//gsoap ns schema namespace: urn:CrearAlumno 
struct Input{
	char *nombre;
};
struct ns__getInfoResponse
{
	char *recepcion;
};

int ns__getInfo(struct Input *insert, struct ns__getInfoResponse *result_soap);