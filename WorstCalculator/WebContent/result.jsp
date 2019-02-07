<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results</title>
</head>
<body>
<p>Result: ${userResult.getNum1()} + ${userResult.getNum2()} =  ${userResult.getResult()}<br />
</p>

<a href="index.jsp">Calculate another set of numbers</a>
</body>
</html>