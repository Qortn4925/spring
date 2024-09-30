<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>


  <table>
    <thead>
    <tr>
      <th>번호</th>
      <th>상품명</th>
      <th>가격</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items ="${productList}" var = "product">
      <c:set var ="product" value ="${product}" scope ="request"></c:set>
  <c:import url="sub15.jsp"></c:import>
    </c:forEach>
    </tbody>
  </table>
  
  </body>
</html>
