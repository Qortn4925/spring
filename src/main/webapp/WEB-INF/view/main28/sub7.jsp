<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3> 상품 조회</h3>

<form action="">
  <input type="text" placeholder="상품 번호 입력" name="id" value="${parma.id}">
  <br>
  <button>조회</button>
</form>

<c:if test="${not empty product}">
  <div>
    <input type="text" readonly="" value="${product.id}">
  </div>
  <div>
    <input type="text" readonly="" value="${product.name}">
  </div>
  <div>
    <input type="text" readonly="" value="${product.supplierId}">
  </div>
  <div>
    <input type="text" readonly="" value="${product.categoryId}">
  </div>
  <div>
    <input type="text" readonly="" value="${product.unit}">
  </div>
  <div>
    <input type="text" readonly="" value="${product.price}">
  </div>
  <div>
    <form action="/main28/sub8" method="post">
      <input type="hidden" name="id" value="${produ

      ct.id}">
    <button>삭제 버튼</button>
    </form>
  </div>
</c:if>

<c:if test="${not empty message}">
      ${message}
</c:if>

</body>
</html>
