<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach begin="11" end="15" var="idx">
  <p>${idx}</p>
</c:forEach>

<hr>

<c:forEach begin="1" end="9" var="idx">
  <p>5 x ${idx} = ${5* idx}</p>
</c:forEach>

<%--
request parameter 'dan'
?dan=5  : 5단 출력
?dan =7  : 7단 출력 --%>

<hr>

<c:if test="${param.dan>1 &&param.dan <10}" var="validDan">
<c:forEach begin="1" end="9" var="idx">
  <p>${param.dan}x ${idx} = ${param.dan*idx}</p>
</c:forEach>
</c:if>

<c:if test="${not validDan}">
  <p> 유효한 단 수를 입력해주세요</p>
</c:if>

<hr>

<c:forEach begin="2" end="9" var="id">
  <c:forEach begin="1" end="9" var="idx">
  <p>${id}x ${idx} = ${id*idx}</p>

  </c:forEach>
  <hr>
</c:forEach>



</body>
</html>
