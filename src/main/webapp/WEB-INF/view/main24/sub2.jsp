<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <style>
    td, th{
      boder:1px solid black
    }
  </style>
</head>
<body>

<table style="border-collapse: collapse" width="100%">
  <thead>
  <tr>
    <th></th>
    <th></th>
    <th></th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${customerList}" var="n">
    <tr>
      <td> ${n.name} </td>
      <td> ${n.contactName}</td>
      <td>${n.address}</td>
    </tr>
  </c:forEach>

  </tbody>
</table>

</body>
</html>
