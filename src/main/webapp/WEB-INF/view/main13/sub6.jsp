<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<p>${products[0]}</p>
<p>${products[1]}</p>
<p>${products[2]}</p>

<hr>

<c:forEach begin="0" end="2"  var="1">
    <p> ${products[i]}</p>
</c:forEach>

<hr>

<c:forEach begin="0" end="${prodcuts.size()}" var="i">
  <p> ${products[i]}</p>
</c:forEach>

<hr>
<%--  items : 반복할 attribute --%>
<%-- var: 각 아이템이 들어갈 attribute 명 --%>
<c:forEach items="${products}" var="product" >
  <p> ${product}</p>
</c:forEach>


<%-- 오타니 ,  흥민 , 범근 , 케인 ,지성--%>
<c:forEach items="${players}" var ="player">
  <p> ${player}</p>
</c:forEach>


<ul>
  <c:forEach items="${cityList}" var ="city">
    <li><p> ${city}</p></li>
  </c:forEach>
</ul>
</body>
</html>
