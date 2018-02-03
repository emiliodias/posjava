<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<meta charset="UTF-8">
</head>
<body>

	<h2>Erro ao acessar página!!!</h2>
	
	<p>Título: <c:out value = "${detalhe.titulo}"/><p>
	
	<p>Status: <c:out value = "${detalhe.status}"/><p>
	
	<p>Hora: <c:out value = "${detalhe.timestamp}"/><p>
	
</body>
</html>
