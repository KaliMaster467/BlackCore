CC=g++

all: Chat
Chat:
	soapcpp2 -S Chat.h
	$(CC) -o Chat.cgi Chat.cpp soapC.cpp soapServer.cpp -lgsoap++ -Wno-write-strings
	cp Chat.cgi /usr/lib/cgi-bin/
	cp Chat.wsdl /var/www/html
