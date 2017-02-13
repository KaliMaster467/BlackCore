//gsoap ns service name: Chat
//gsoap ns service namespace: urn:Chat
//gsoap ns service location: http://192.168.1.69/cgi-bin/Chat.cgi
//gsoap ns schema namespace: urn:Chat
struct Input{
	char *Msg;
	int id;
};
struct ns__getInfoResponse
{
	char *rec;
};
int ns__getInfo(struct Input *msg, struct ns__getInfoResponse *result_soap);
