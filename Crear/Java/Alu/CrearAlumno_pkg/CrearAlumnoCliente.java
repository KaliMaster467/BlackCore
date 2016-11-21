package CrearAlumno_pkg;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;

public class CrearAlumnoCliente{

  public static void main(String[] args)
  {

    Input in = new Input("asdf", "adgfsdf", "asdg", 453, "asdf", "asdfasdf", "pasdfsd", "asdfsd");

    try{
    CrearAlumno service = new CrearAlumnoLocator();
    CrearAlumnoPortType port = service.getCrearAlumno();
    String response = port.getInfo(in);
    }catch(RemoteException e){
      e.printStackTrace();
    }catch(ServiceException e){
    e.printStackTrace();
    }

  }
}
