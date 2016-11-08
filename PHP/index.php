
<html>
<head>
	<title>HOla</title>
</head>
<body>
	<h1>Hola</h1>
	<form class="" action="index.php" method="get">
		<input type="text" name="nombre" value="">
		<input type="submit" name="name" value="">
	</form>
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
$parametros['location']=location;
$parametros['trace']=trace;

$datos['nombre'] = $nombre;

$parametros['insert']= $datos;
try {
$client = new SoapClient($servicio, $parametros);
$result = $client->$metodoIdentificacion($parametros);
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

print_r(CrearAlumno($_GET['nombre']));


?>
</body>
</html>
