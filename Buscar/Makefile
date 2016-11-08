CC=g++
MYSQLIB=/usr/include/cppconn
all: BuscarAlumno
BuscarAlumno:
soapcpp2 -S BuscarAlumno.h
$(CC) -o BuscarAlumno.cgi BuscarAlumno.cpp soapC.cpp soapServer.cpp -lgsoap++ -I$(MYSQLIB) -I(MYSQLIB) -lmysqlcppconn 
