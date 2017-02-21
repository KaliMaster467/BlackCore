//gsoap ns service name: FriendRequest
//gsoap ns service namespace: urn:FriendRequest
//gsoap ns service location: http://192.168.1.69/cgi-bin/FriendRequest.cgi
//gsoap ns schema namespace: urn:FriendRequest
struct Input{
	int Id_sender;
	int Id_receiver;
};
struct ns__getInfoResponse{
	char *response;
};
int ns__getInfo(struct Input *fr, struct ns__getInfoResponse *result_soap);
