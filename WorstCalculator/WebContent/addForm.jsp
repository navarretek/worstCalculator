<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator</title>
</head>
<body>

<h1> Adding Calculator</h1>
<form action="getAddNumbersServlet" method="post">
Enter number 1:
<input type="text" name="userNum1" size="10">
Enter number 2:
<input type="text" name="userNum2" size="10">
<input type="submit" value="Add" />
</form>
</body>
</html>