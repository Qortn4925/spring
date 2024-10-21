<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/main38/sub10" method="post">
  <c:if test="${empty employee}">
    <h5> id 부터 입력</h5>
  </c:if>
  <c:if test="${not empty employee}">

    <div>
      직원 번호
      <input type="text" name="id" value="${employee.id}">
    </div>
    <div>
      이름
      <input type="text" name="lastName" value="${employee.lastName}">

    </div>
    <div>
      성
      <input type="text" name="firstName" value="${employee.firstName}">
    </div>
    <div>
      생일
      <input type="text" name="birthDate" value="${employee.birthDate}">

    </div>
    <div>
      사진
      <input type="text" name="photo" value="${employee.photo}">

    </div>
    <div>
      노트
      <input type="text" name="notes" value="${employee.notes}">
    </div>
  </c:if>

  <button> 저장</button>

  


</form>

</body>
</html>
