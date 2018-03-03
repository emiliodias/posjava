<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Pagina com protecao!!!</p>
	
	<p>Bem-vindo ${usuario}!!!</p>
	
	<p>
	
		Permissoes:
		
		<br>
		
		<c:forEach var="p" items="${permissoes}">
			
			<p><c:out value = "${p.authority}"/></p>
		
		</c:forEach>
	
	</p>
	
</body>
</html>