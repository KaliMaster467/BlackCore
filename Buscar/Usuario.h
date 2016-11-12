#include <iostream>

class ns__Usuario
{
public:
	ns__Usuario();
	~ns__Usuario();
	void setId(int Id);
	void setDate(const char *Date);
	void setFLastName(char *fname);
	void setSLastName(char *sname);
	void setName(char *nombre);
	void setTel(int tel);
	void setMail(char *mail);
	void setDel(char *del);
	void setPass(char *pass);
	void setDir(char *dir);
	void setStatus(bool *status);
private:
	const int Id;
	const char *Date;
	char *FLastName;
	char *SLastName;
	char *Name;
	int Telephone;
	char *Email;
	char *Delegation;
	char *passw;
	char *Direction;
	bool *status;
};
