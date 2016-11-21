package CrearAlumno;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;

public class CrearAlumnoClient{

  public static void main(String[] args)
  {

    Input in = new Input("asdf", "adgfsdf", "asdg", 453, "asdf", "asdfasdf", "pasdfsd", "asdfsd");

    try{
    CrearAlumno_Service service = new CrearAlumno_ServiceLocator();
    CrearAlumnoPortType port = service.getCrearAlumno();
    String response = port.getInfo(in);
    }catch(RemoteException e){
      e.printStackTrace();
    }catch(ServiceException e){
    e.printStackTrace();
    }

  }
}
