 <?php
define("path_wsdl", "http://localhost/BuscarAlumno.wsdl");
define("metodo", "getInfo");
define("location", "http://localhost/cgi-bin/BuscarAlumno.cgi");
define("trace",1);

/**
* 
*/
class ns__Usuario
{
	public $id;
	public $nombre;
	function __construct($id, $nombre)
	{
		$this->id = $id;
		$this->nombre = $nombre;
	}
	function getId()
	{
		return $id;
	}
	function getNombre()
	{
		return $nombre;
	}
}


Alumno $alum = new Alumno();


function BuscarAlumno($id)
{

$metodoIdentificacion = metodo;
$servicio=path_wsdl;
$parametros=array();
$parametros['location']=location;
$parametros['trace']=trace;
//$datos['id'] = $id;

$parametros['busqueda']= $id;
try {
$client = new SoapClient($servicio, );
$result = $client->$metodoIdentificacion( array('classmap' => array('busqueda' => 2, 'result_soap' => "Alumnos")));
$salida = "REQUEST:\n" . $client->__getLastRequest() . "\n";
$salida .= "REQUEST HEADERS:\n" . $client->__getLastRequestHeaders() . "\n";
$salida .= "Response:\n" . $client->__getLastResponse() . "\n";
$salida .= "Response:\n" . $client->__getLastResponseHeaders() . "\n";
return $salida;
}
catch (SoapFault $fault) {
$error = "REQUEST:\n" . $client->__getLastRequest() . "\n";
$error .= "REQUEST HEADERS:\n" . $client->__getLastRequestHeaders() . "\n";
$error .= "Response:\n" . $client->__getLastResponse() . "\n";
$error .= "Response:\n" . $client->__getLastResponseHeaders() . "\n";
return $error;
}
}

print(BuscarAlumno('2'));
echo $alum->getNombre();
?>