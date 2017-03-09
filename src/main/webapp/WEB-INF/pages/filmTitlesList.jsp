<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Hello World</title>
</head>
<body>
	<c:forEach items="${message}" var="item">
		<a href=${item.id}>${item.title}</a>
		<br>
	</c:forEach>
</body>
</html>
