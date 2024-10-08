<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3> 고객명 검색</h3>
<form>
    <input type="text" placeholder="조회할 이름" name="keyword">
    <button>검섹</button>
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
