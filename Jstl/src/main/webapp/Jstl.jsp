<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="a" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="s" uri = "http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1 style="text-align: center;background-color: green;">THis is Jstl Demo page</h1>

<a:set var="name" value="vaibhav"></a:set>
<a:out value="${name }"></a:out>

<a:set var="name"></a:set>




</body>
</html>