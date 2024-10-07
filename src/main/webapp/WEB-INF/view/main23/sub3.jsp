<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>   제품 명</h3>

<ul>
  <c:forEach items="${nameList}" var="name">
    <li> ${name}</li>
  </c:forEach>
</ul>

</body>
</html>
