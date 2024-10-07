<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3> 국가명으로 고객 조회</h3>

<form>
     국가명
      <input type="text" name="country">
<br>

<button> 검색</button>
    <h3> ${param.country}</h3>
    <ul>
        <c:if test="${not empty nameList}" >
        <c:forEach items="${nameList}" var="item">
            <li> ${item}</li>
        </c:forEach>
    </c:if>
        <c:if test="${empty nameList}" >
            <strong> 국가명을 정확히 입력하라</strong>
        </c:if>

    </ul>
</form>
</body>
</html>
