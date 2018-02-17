<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	<meta charset="UTF-8">
	<style>
		table {
			    border-collapse: collapse;
			    width: 100%;
			}
			
			th, td {
			    text-align: left;
			    padding: 8px;
			}

		tr:nth-child(even) {background-color: #f2f2f2;}
	</style>
</head>
<body>
	<h2>Cadastre um novo aluno - Pós Java Unitri!!!</h2>
	
	<p>
	
		<form:form method="POST" action="/crudmvc/alunos/salvar" modelAttribute="aluno">
	
			<input type="hidden" name="id" value="${aluno.id}" />
			<p>Id: <form:input path="id" disabled="true"/></p>
			<p>Nome: <form:input path="nome"/></p>
			<p>Endereço: <form:input path="endereco"/></p>
			<p>Complemento: <form:input path="complemento"/></p>
			<p>Estado: <form:input path="estado"/></p>
			<p><input type="submit" value="Salvar"></input></p>
		
		</form:form>
		
	</p>
	
	<c:if test = "${not empty erro.titulo}">
	
		<span style="color: red;">Atenção: <c:out value = "${erro.titulo}"/></span>
	
	</c:if>
	
	<hr>
	
	<h3>Listagem</h3>
	
	<table>
		<tr>
			<th>Id</th>
			<th>Nome</th>
			<th>Endereço</th>
			<th>Complemento</th>
			<th>Estado</th>
			<th>Opções</th>
		</tr>
		<c:forEach var="aluno" items="${alunos}">
			<tr>
				<td> <c:out value = "${aluno.id}"/><p> </td>
				<td> <c:out value = "${aluno.nome}"/><p> </td>
				<td> <c:out value = "${aluno.endereco}"/><p> </td>
				<td> <c:out value = "${aluno.complemento}"/><p> </td>
				<td> <c:out value = "${aluno.estado}"/><p> </td>
				<td> 
					<a href="
						<c:url value="/alunos/editar">
							<c:param name="id" value = "${aluno.id}" />
						</c:url>">Editar</a>
						
					<a href="
						<c:url value="/alunos/remover">
							<c:param name="id" value = "${aluno.id}" />
						</c:url>">Remover</a>
				
				</td>
			</tr>
	         
	    </c:forEach>
	</table>
	
</body>
</html>
