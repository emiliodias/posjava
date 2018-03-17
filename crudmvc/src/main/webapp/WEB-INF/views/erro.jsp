<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
	<meta charset="UTF-8">
</head>
<body>

	
	<c:if test = "${not empty erro.titulo}">
	
		<span style="color: red;">Atenção: <c:out value = "${erro.titulo}"/></span>
	
	</c:if>
	

	
</body>
</html>
