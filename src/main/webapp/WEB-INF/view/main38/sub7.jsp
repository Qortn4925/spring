<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3> 고객 정보 수정 </h3>
    <form action="/main38/sub8" method="post">

      <c:if test="${empty customer}">
        <h5> 고객 정보를 먼저 조회하세요</h5>
      </c:if>
      <c:if test="${not empty customer}">
      <div>
        <div>
          아이디
          <input type="text" name="id" value="${customer.id}">
        </div>
        <div>
          이름
          <input type="text" name="name" value="${customer.name}">
        </div>
        <div>
          게약자명
          <input type="text" name="contactName" value="${customer.contactName}">
        </div>

        <div>
          주소
          <input type="text" name="address" value="${customer.address}">
        </div>

        <div>
          도시
          <input type="text" name="city" value="${customer.city}">
        </div>

        <div>
          우편번호
          <input type="text" name="postalCode" value="${customer.postalCode}">
        </div>

        <div>
          국가
          <input type="text" name="country" value="${customer.country}">
        </div>

        </c:if>
        <button>저장</button>
      </div>
</form>
</body>
</html>
