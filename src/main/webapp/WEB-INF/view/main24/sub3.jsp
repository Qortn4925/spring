<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee List</title>
    <style>
        td, th {
            border: 1px solid black; /* 오타 수정: boder -> border */
            padding: 8px; /* 패딩 추가 */
        }
        th {
            background-color: #f2f2f2; /* 헤더 배경색 추가 */
        }
        table {
            width: 100%; /* 테이블 넓이 100% */
            border-collapse: collapse; /* 경계 겹치지 않도록 설정 */
        }
    </style>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>Employee ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Birth Date</th> <!-- 열 제목 추가 -->
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${employeeList}" var="n">
        <tr>
            <td>${n.employeeId}</td>
            <td>${n.firstName}</td>
            <td>${n.lastName}</td>
            <td>${n.birthDate}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
