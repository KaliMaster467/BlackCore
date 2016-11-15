package CrearAlumno_pkg;
public class CrearAlumnoClient
{

public static void main(String args[]) throws Exception
{
Input in = new Input("aasdf", "sdf", "msdf", 234, "arro", "mi", "pa", "ya");
CrearAlumnoLocator serviceLocator = new CrearAlumnoLocator();

CrearAlumnoSoap service = serviceLocator.getCrearAlumnoSoap(); 
int results= service.getInfo(in);
}
