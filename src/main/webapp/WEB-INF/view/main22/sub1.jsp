<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<form action="/main22/sub2">
  <input type="text" name="name" value="흥민">
  <br>
  <input type="text" name="age" value="44">
  <br>
  <button>전송</button>
</form>
<a href="/main22/sub2?name=흥민&age=44">link(a 태그)는 get 방식</a>

<hr>
<%--&lt;%&ndash; url(경로, 주소) 생성시 jstl url 태그 사용 &ndash;%&gt;--%>
<%--<c:url value="/main22/sub2" var="someUrl">--%>
<%--  <c:param name="name" value="흥민"/>--%>
<%--  <c:param name="age" value="44"/>--%>
<%--</c:url>--%>
<%--<a href="${someUrl}">url 태그로 만든 경로사용</a>--%>

</body>
</html>
