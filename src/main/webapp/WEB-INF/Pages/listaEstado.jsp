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
</head>
<body>
	<h1>Lista de Estados</h1>
	
	<fieldset>
		<legend>Filtro</legend>
		
		<form action="ListaEstado" method="post">
			Nome: <input type="text" name="nomeEstadoPesquisa" value="${nomeEstadoPesquisa}" />
			
			<input type="submit" value="Pesquisar" />
		</form>
	</fieldset>
	<br />

	<table width="100%" border="1 px">
		<tr>
			<td width="33%" align="center">Nome</td>
			<td width="33%" align="center">Sigla</td>
			<td width="34%" align="center">C&oacute;digo IBGE</td>
		</tr>

		<c:forEach var="meuEstado" items="${estados}"> <!-- estados surge do controller, método listaEstado -->
			<tr>
				<td>
					<c:url var="minhaUrl" value="/CadastroEstado">
						<c:param name="idEstado">${meuEstado.idEstado}</c:param> <!-- /projweb/CadastroEstado?idEstado=13 -->
					</c:url>				

					<a href="${minhaUrl}">${meuEstado.nome}</a>
				</td>
				<td>${meuEstado.sigla}</td>
				<td>${meuEstado.codigoIbge}</td>
			</tr>
		</c:forEach>
	</table>
	
	<br />
	<br />

	<form action="CadastroEstado" method="get">
		<input type="submit" value="Novo Estado" />
	</form>

</body>
</html>