<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>국가명 목록</h3>

<ul>
  <c:forEach items="${countryList}" var="country">
    <li>${country}</li>
  </c:forEach>
</ul>

<h4> 공급자 테이블 </h4>

<ul>
  <c:forEach items="${countryList1}" var="country1">
    <li>${country1}</li>
  </c:forEach>
</ul>

</body>
</html>
