<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
index
<br>
<sf:form action="/save" method="post" modelAttribute="user">
    <sf:input path="name"/>
    <sf:input path="age"/>
    <sf:input path="product"/>
    <input type="submit" value="save">
</sf:form>
<br>
<a href="/userPage">go to users page</a>
</body>
</html>
