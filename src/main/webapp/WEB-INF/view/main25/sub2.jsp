<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>

<h3> 가격으로 상품명 조회</h3>

<form>
  가격
  <input type="text" name="price">
  <br>

  <button> 검색</button>
  <h3> ${param.price}가격들의 상품들입니다</h3>
  <ul>
    <c:if test="${not empty productList}" >
      <jsp:useBean id="productList" scope="request" type="java.util.List"/>
      <c:forEach items="${productList}" var="item">
<%--        <li> ${item.productName}의 가격은 == ${item.price}<



/li>--%>
        <li>${item.productName} + ${param.price}</li>
      </c:forEach>
    </c:if>
    <c:if test="${empty productList}" >
      <strong> 올바른 가격을 입력하라</strong>
    </c:if>

  </ul>
</form>
</body>
</html>
