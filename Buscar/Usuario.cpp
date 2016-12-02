#include "Usuario.h"

ns__Usuario::ns__Usuario(){

}
ns__Usuario::~ns__Usuario(){

}
void ns__Usuario::setId(const int Id){
	this->Id = Id;
}
void ns__Usuario::setDate(const char *Date){
	this->Date = Date;
}
void ns__Usuario::setFLastName(char *fname){
	this->FLastName = fname;
}
void ns__Usuario::setSLastName(char *sname)
{
	this->SLastName = sname;
}
void ns__Usuario::setName(char *nombre)
{
	this->Name = nombre;
}
void ns__Usuario::setTel(int tel)
{
	this->Telephone = tel;
}
void ns__Usuario::setMail(char *mail)
{
	this->Email = mail;
}
void ns__Usuario::setDel(char *del)
{
	this->Delegation = del;
}
void ns__Usuario::setPass(char *pass)
{
	this->passw = pass;
}
void ns__Usuario::setDir(char *dir)
{
	this->Direction = dir;
}
void ns__Usuario::setStatus(bool status)
{
	this->status = status;
}
const int ns__Usuario::getId()
{
	return Id;
}
const char *ns__Usuario::getDate()
{
	return Date;
}
const char *ns__Usuario::getFLastName()
{
	return FLastName;
}
const char *ns__Usuario::getSLastName()
{
	return SLastName;
}
const char *ns__Usuario::getName()
{
	return Name;
}
int ns__Usuario::getTelephone()
{
	return Telephone;
}
const char *ns__Usuario::getEmail()
{
	return Email;
}
const char *ns__Usuario::getDel()
{
	return Delegation;
}
const char *ns__Usuario::getPass()
{
	return passw;
}
const char *ns__Usuario::getDir()
{
	return Direction;
}
bool ns__Usuario::status()
{
	return status
}