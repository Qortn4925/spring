<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>  sub 9</h1>

<p>${param.price}</p>

<%--포함되는 (sub10) jsp에 값을 전달 하는 방법  (reques 통해 정보 전달방법)--%>
<%-- 1. request parameter 이용 --%>
<%--2. request(model) attribute 이용 --%>
<c:import url="sub10.jsp?name=son&age=55&address=서울"/>

<c:import url="sub10.jsp">
  <c:param name="name" value="흥민"/>
  <c:param name="age" value="66"/>
  <c:param name="address" value="제주"/>
</c:import>
</body>
</html>
