<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
	<meta charset="UTF-8">
</head>
<body>
	<h2>Formuário!!!</h2>
	
	<form:form method="POST" action="salvar" modelAttribute="aluno" >
             <table>
                <tr>
                    <td><form:label path="nome">Nome</form:label></td>
                    <td><form:input path="nome"/></td>
                </tr>
                <tr>
                    <td><form:label path="endereco">Endereco</form:label></td>
                    <td><form:input path="endereco"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
	
</body>
</html>
