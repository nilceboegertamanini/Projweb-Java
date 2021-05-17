<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	
	<style type="text/css">
	  .error {color:red};
	</style>
	
	<script type="text/javascript">
		function validar()
		{
/*
			var cpf = document.getElementById("cpf").value;
			//cpf, cnpj, numero telefone, conta bancário, ...

			alert(cpf);

			//lógica de validação de validação CPF
			//111.111.111-11*/

			return true;	
		}
		
		function excluirEstado()
		{
			if(confirm("Deseja excluir o estado?"))
			{
				document.getElementById("RemoveEstadoForm").submit();
			}
		}

	</script>
</head>
<body>
	<h1>Cadastro de Estado</h1>

	<form:form method="POST" action="/projweb/addEstado"> <!-- return true submete o form, return false não submetee-->
		<form:hidden path="idEstado" />

		Nome: <form:input path="nome" /> <form:errors path="nome" cssClass="error" /><br /> 
		Sigla: <form:input path="sigla" /> <form:errors path="sigla" cssClass="error" /> <br />
		Codigo IBGE: <form:input path="codigoIbge" /> <form:errors path="codigoIbge" cssClass="error" /> <br />
		
		<input type="submit" /> <input type="button" value="Excluir" onclick="excluirEstado();" />
	</form:form>
	
	<form id="RemoveEstadoForm" action="RemoveEstado" method="post">
		<input type="hidden" name="idEstado" value="${command.idEstado}" /> 
	</form>

</body>
</html>