<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3> 국가별 고객 조회</h3>


<form action="">
  <select name="country" id="">
<option value="0"> 전체</option>
    <c:forEach items="${countryList}"  var="countryname">
      <option value="${countryname}">
        ${countryname}
      </option>
    </c:forEach>
  </select>

  <div>
    <h5>정렬 조건</h5>
    <input type="radio" name="order" value="customername" id="">
    <labe>  고객명</labe>
    <input type="radio" name="order" value="contactname" id="">
    <labe> 계약명</labe>
  </div>
  <button> 조회 </button>
</form>


<hr>
<%-- 조회된 고객 데이터들--%>

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
  <c:forEach items="${customerList}" var="cl">
     <tr>
        <td>${cl.id}</td>
        <td>${cl.name}</td>
        <td>${cl.contactName}</td>
        <td>${cl.address}</td>
        <td>${cl.city}</td>
        <td>${cl.postalCode}</td>
        <td>${cl.country}</td>
      </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
