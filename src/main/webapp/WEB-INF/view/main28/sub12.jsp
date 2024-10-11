<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:if test="${not empty message}">
     <h4 style="background-color: yellow"> ${message}</h4>
</c:if>

<h3> 직원 정보 수정</h3>
<form action="" method="get">
    <input type="text" name="id" value="${param.id}">
    <button>조회</button>
</form>

<hr>
<form action="/main28/sub11" method="post">
    
    <c:if test="${not empty employee}">
        <input type="text" name="employeeId" value="${employee.employeeId}">
        <br>
        <input type="text" name="lastName" value="${employee.lastName}">
        <br>
        <input type="text" name="firstName" value="${employee.firstName}">
        <br>
        <input type="text" name="birthDate" value="${employee.birthDate}">
        <br>
        <input type="text" name="photo" value="${employee.photo}">
        <br>
        <input type="text" name="notes" value="${employee.notes}">
        <br>
    </c:if>

    <c:if test="${empty employee}">
         그런거 없어용
    </c:if>

    <hr>
    <button>수정 버튼</button>
</form>

</body>
</html>
