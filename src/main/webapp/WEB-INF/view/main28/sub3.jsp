<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3> 상품입력 </h3>


<c:if test ="${not empty message}">
    <h3 style="background-color:skyblue"> ${message}</h3>
</c:if>
<form action="/main28/sub4" method="post">

    상품명
    <input type="text" name="name">
    <br>
    가격:
    <input type="text" name="price">
    <br>
    <button>조회
    </button>
</form>
</body>
</html>
