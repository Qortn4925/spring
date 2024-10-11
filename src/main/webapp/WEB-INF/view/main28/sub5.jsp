<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>

  <h3> 고객 조회</h3>

  <form action="">
    <input type="number" placeholder="고객번호" name="id" value="${param.id}">
    <button>조회</button>
  </form>
  <hr>

  <c:if test="${not empty customer}">
    <div>
      <input type="text" readonly="" value="${customer.id}">
    </div>
    <div>
      <input type="text" readonly="" value="${customer.name}">
    </div>
    <div>
      <input type="text" readonly="" value="${customer.contactName}">
    </div>
    <div>
      <input type="text" readonly="" value="${customer.address}">
    </div>
    <div>
      <input type="text" readonly="" value="${customer.city}">
    </div>
    <div>
      <input type="text" readonly="" value="${customer.postalCode}">
    </div>
    <div>
      <input type="text" readonly="" value="${customer.country}">
    </div>
    <div>
      <form action="/main28/sub6" method="post">
        <input type="hidden" name="id" value="${customer.id}">
      <button style="background-color: darkred; color:white"> 삭제</button>
      </form>
    </div>
  </c:if>


      <c:if test="${empty customer}">
        <h3> 해당 번호의 고객 존재 x</h3>
      </c:if>




  </body>

<c:if test="${not empty message}">
  <h5 style="background-color: skyblue">${message}</h5>
</c:if>

</html>
