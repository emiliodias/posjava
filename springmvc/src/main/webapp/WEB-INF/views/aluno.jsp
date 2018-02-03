<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<meta charset="UTF-8">
</head>
<body>
	<h2>Aluno - Pós Java Unitri!!!</h2>
	
	<p>Nome: <c:out value = "${aluno.nome}"/></p>
	<p>Endereco: <c:out value = "${aluno.endereco}"/></p>
	
</body>
</html>
