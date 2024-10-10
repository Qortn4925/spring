<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <style>
    table {
      border-collapse: collapse;
      border:1px solid black;
    }
    tr,td{
      border: 1px solid black;
    }
  </style>
</head>
<body>

<h3> 고객번호로 고객 조회</h3>
<form>
  <input type="text" name="id" placeholder="고객번호">
  <br>
  <button>조회</button>
</form>

<hr>
<table>
  <thead>
  <tr>
    <th>손님 번호</th>
    <th>손님 이름</th>
    <th>계약 명</th>
    <th> 주소</th>
    <th>도시 이름</th>
    <th> 코드</th>
    <th> 나라 </th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${List}" var="item">
    <tr>
      <td>${item.id}</td>
      <td>${item.name}</td>
      <td>${item.contactName}</td>
      <td>${item.address}</td>
      <td>${item.city}</td>
      <td>${item.postalCode}</td>
      <td>${item.country}</td>
    </tr>
  </c:forEach>
  </tbody>
  <c:forEach items="${List}" var="item">
       <p>${item.id}</p>
  </c:forEach>


</table>
${List}
</body>
</html>
