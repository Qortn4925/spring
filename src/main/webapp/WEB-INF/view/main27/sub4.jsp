<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>기간별 주문 조회</h3>

<form action="">
  시작일
  <input type="text" name="date1" value="1996-07-04">
  <br>
  ~
  <br>
  종료일
  <input type="text" name="date2" value="1998-05-06">
  <br>
  <button> 조회</button>
</form>

<table>
  <thead>
  <tr>
    <th>주문번호</th>
    <th>고객번호</th>
    <th>고용번호</th>
    <th>주문날짜</th>
    <th>운송장번호</th>
  </tr>
  </thead>
  <tbody>
   <c:forEach items="${List}" var="order">
<tr>
     <td>${order.id}</td>
     <td>${order.customerId}</td>
     <td>${order.employeeId}</td>
     <td>${order.orderDate}</td>
     <td>${order.shipperId}</td>
</tr>
   </c:forEach>
  </tbody>

</table>



</body>
</html>
