<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ERROR</title>
</head>
<body>
<h2>ERROR</h2>
<% response.setStatus(200); %>
예외발생 : <%= exception %>
</body>
</html>