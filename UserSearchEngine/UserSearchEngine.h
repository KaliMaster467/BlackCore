//gsoap ns service name: UserSearchEngine
//gsoap ns service namespace: urn:UserSearchEngine
//gsoap ns service location: http://192.168.1.69/cgi-bin/UserSearchEngine.cgi
//gsoap ns schema namespace: urn:UserSearchEngine
#include <string.h>
struct Input{
	char *User;
};
struct ns__getInfoResponse{
	char *response;
	std::string users[5];
	int  id[5];
	int totalres;
};
int ns__getInfo(struct Input *fr, struct ns__getInfoResponse *result_soap);
