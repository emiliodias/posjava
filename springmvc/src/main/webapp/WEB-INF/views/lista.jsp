<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<h2>Lista - Pós Java Unitri!!!</h2>
	
	<table>
		<tr>
			<th>Id</th>
			<th>Valor</th>
		</tr>
		<c:forEach var="i" items="${teste}" varStatus="status">
			<tr>
				<td> <c:out value = "${status.getIndex()}"/><p> </td>
				<td> <c:out value = "${i}"/><p> </td>
			</tr>
	         
	    </c:forEach>
	</table>
	
</body>
</html>
