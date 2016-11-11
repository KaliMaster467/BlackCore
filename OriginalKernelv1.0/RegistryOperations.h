//gsoap ns service name: RegistryOperations
//gsoap ns service namespace: urn:RegistryOperations
//gsoap ns service location: http://localhost/cgi-bin/RegistryOperations.cgi
//gsoap ns schema namespace: urn:RegistryOperations
#import "Objects/Usuario.h"

int ns__InsertUser(ns__User *userIn, char *result_soap);

int ns__GetUser(char * user, char * pass, ns__User *userGet, char *result_soap);
