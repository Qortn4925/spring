<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3> 가격으로 상품 검색</h3>
<form>
    <input type="number" step="1.01" placeholder="부터" name="start">
    <input type="number" step="1.01" placeholder="까지" name="end">
    <br>
    <button>검색</button>

</form>

<table>
    <thead>
    <tr>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${productList}" var="product">
        <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
            <td>${product.supplierId}</td>
            <td>${product.categoryId}</td>
            <td>${product.unit}</td>
            <td>${product.price}</td>
    </tr>
    </c:forEach>
    <tr>
    </tbody>
</table>



</body>
</html>
