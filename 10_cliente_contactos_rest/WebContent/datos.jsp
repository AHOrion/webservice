<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Contact here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
</head>
<body>
<div class="container">
	<h1>Formulario de autenticación</h1>
	<f:form action="doAlta" method="post" modelAttribute="contacto">
		<div class="form-group">
			<label>Nombre:</label>
			<f:input path="nombre" class="form-control" style="width:30%" placeholder="Usuario" autocomplete="name"/>
		</div>
		<div class="form-group">
			<label>Correo electrónico:</label>
			<f:input path="email" class="form-control" style="width:30%" placeholder="identificador@dominio.es"/>
		</div>
		  <div class="form-group">
		    <label class="control-label col-sm-2" for="age">Edad:</label>
		    <div class="col-sm-10">
		      <f:input path="edad" class="form-control" id="age"  />
		    </div>
		  </div>
		
		<button type="submit" class="btn btn-default">Guardar</button>
		
	</f:form>
</div>
</body>
</html>