<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${datas}" var="data">

    <c:forEach items="${data}" var="entry">
        <p>${entry.key}</p>
        <p>${entry.value}</p>
    </c:forEach>

</c:forEach>


<c:forEach items="${players}" var="player">

    <c:forEach items="${player}" var="entrys">
        <p>${entrys.value}</p>
        <p>${entrys.key}</p>
    </c:forEach>

</c:forEach>

</body>
</html>
