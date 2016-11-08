CC=g++
MYSQLIB = /usr/include/cppconn
all: CrearAlumno
CrearAlumno:
	soapcpp2 -S CrearAlumno.h
	$(CC) -o CrearAlumno.cgi CrearAlumno.cpp soapC.cpp soapServer.cpp -lgsoap++ -I$(MYSQLIB) -L$(MYSQLIB) -lmysqlcppconn -Wno-write-strings
