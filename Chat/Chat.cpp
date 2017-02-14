#include "soapH.h"
#include "Chat.nsmap"
#include <iostream>
#include <stdlib.h>
#include <exception>
#define PATH "/var/log/Chat/"
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
int ns__getInfo(struct soap *soap, struct Input *msg, struct ns__getInfoResponse *result_soap){
	try{
		system("sublime");
	
	}catch(std::exception &e){
		return soap_sender_fault(soap, "Error -1", "ERROR mensaje");
	}
	result_soap->rec="ok";
	return SOAP_OK;
}
