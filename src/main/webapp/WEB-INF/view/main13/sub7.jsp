<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<c:forEach items="=${people}" var="person">

    <p> ${person}</p>
</c:forEach>

<c:forEach items="${people}" var ="person">
    <p> ${person.key}: ${person.value}}</p>
</c:forEach>

<c:forEach items="${player}" var ="player" >
    <div>
    <p> 이름 :${player.key}</p>
    <p>  소속 :${player.value}</p>
    </div>
</c:forEach>

    <c:forEach items="${food}" var="food">
        <p> ${food.key}</p>
        <p> ${food.value}</p>
    </c:forEach>

</body>
</html>
