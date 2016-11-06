 <?php
define("path_wsdl", "http://localhost/CrearAlumno.wsdl");
define("metodo", "getInfo");
define("location", "http://localhost/cgi-bin/CrearAlumno.cgi");
define("trace",1);

function CrearAlumno($nombre)
{

$metodoIdentificacion = metodo;
$servicio=path_wsdl;
$parametros=array();
$datos['nombre'] = $nombre;
$parametros['Input']= $datos;
try {
$client = new SoapClient("http://localhost/CrearAlumno.wsdl");
$result = $client->$getInfo($parametros, $va);
$salida = "REQUEST:\n" . $client->__getLastRequest() . "\n";
$salida .= "REQUEST HEADERS:\n" . $client->__getLastRequestHeaders() . "\n";
$salida .= "Response:\n" . $client->__getLastResponse() . "\n";
$salida .= "Response:\n" . $client->__getLastResponseHeaders() . "\n";
return $salida;
}
catch (SoapFault $fault) {
$error = "REQUEST:\n" . $client->__getLastRequest() . "\n";
$error = "REQUEST HEADERS:\n" . $client->__getLastRequestHeaders() . "\n";
$error = "Response:\n" . $client->__getLastResponse() . "\n";
$error = "Response:\n" . $client->__getLastResponseHeaders() . "\n";
return $error;
}
}

print_r(CrearAlumno('felipe'));

?>