<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:if test="${not empty message}">
     ${message}
</c:if>
<h3> 고객 번호 </h3>
<form action="">
    <input type="number" name="id" value="${param.id}">
    <button>조회</button>
</form>

<hr>

<form action="/main28/sub9" method="post">

<c:if test="${not empty customer}">
    <div><input type="text" name="id" value="${customer.id}"></div>
    <div><input type="text"  name="name" value="${customer.name}"></div>
    <div><input type="text"  name="contactName" value="${customer.contactName}"></div>
    <div><input type="text" name="address" value="${customer.address}"></div>
    <div><input type="text" name="postalCode" value="${customer.postalCode}"></div>
    <div><input type="text" name="city" value="${customer.city}"></div>
    <div><input type="text"  name="country" value="${customer.country}"></div>
    <button> 저장</button>
</c:if>
</form>
${customer}
</body>
</html>
