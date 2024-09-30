<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:set var="car"  value="테슬라" scope="page"/>
<c:set var="car"  value="기아" scope="request"/>
<c:set var="car"  value="현대" scope="session"/>
<c:set var="car"  value="삼성" scope="application"/>


<hr>

<p> ${car}</p>         <%-- 테슬라 --%>
<p> ${pageScope.car}</p>         <%-- 테슬라 --%>
<p> ${requestScope.car}</p>         <%-- 기아 --%>
<p> ${sessionScope.car}</p>         <%-- 현대 --%>
<p> ${applicationScope.car}</p>         <%-- 삼성 --%>

<hr>
<c:set var="model"  value="아반떼"/>
<c:set var="model"  value="제네시스" scope="request"/>
<c:set var="model"  value="모하비" scope="session"/>
<c:set var="model"  value="모델 y" scope="application"/>


<c:set var="food"  value="피자" scope="request"/>
<c:set var="food"  value="버거" scope="session"/>
<c:set var="food"  value="돈까스" scope="application"/>


<p> ${model}</p>
<p> ${requestScope.model}</p>
<p> ${sessionScope.model}</p>
<p> ${applicationScope.model}</p>

<p> ${requestScope.food}</p>
<p> ${sessionScope.food}</p>
<p> ${applicationScope.food}</p>

<c:if test="true" var="somtTest">
</c:if>

<c:if test="${somtTest}">

</c:if>

<p>${sub19output}</p>
</body>
</html>
