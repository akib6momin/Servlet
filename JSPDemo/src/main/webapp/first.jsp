<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to the JSP Page</h1>
<%@ page import ="java.util.Date" 

%>

<%!
int age = 10;
%>
<%
String name = request.getParameter("uname");
String city = request.getParameter("ucity");

Date d = new Date();
out.println(name+" : "+city);
%>

<h1><%= d %></h1>
<h1><%= city %></h1>
</body>
</html>