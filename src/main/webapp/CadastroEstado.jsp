<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Cadastro de Estado</h1>

	<%="OI Pessoal" %><br />

	<form name="cadastroEstado" method="post" action="/projweb/GravaEstado" onsubmit="f();">
		
		Nome: <input type="text" name="nome" /> <br />
		Sigla: <input type="text" name="sigla" /> <br />
		Codigo IBGE: <input type="text" name="codigoIbge" /> <br />

		<input type="submit" name="Submit" value="Submit" />
	</form>
	
	<script>
		function f()
		{
		alert("oi");
		}
	</script>
</body>
</html>