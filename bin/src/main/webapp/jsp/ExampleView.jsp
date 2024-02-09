<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>My Page</title>
</head>
<body>
    <h1>Hello from JSP using JSTL</h1>

    <c:set var="message" value="Welcome to Spring Boot with JSTL" />
    <c:out value="${message}" />

    <c:if test="${5 > 3}">
        <p>5 is greater than 3.</p>
    </c:if>
</body>
</html>
