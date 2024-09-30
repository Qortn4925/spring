<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:import url="sub3.jsp"/>

${sessionScope.userid}로그인 화면

<form>
  <input type="text" name="id" placeholder="아이디"/>
  <br>
  <button>로그인</button>
</form>

</body>
</html>
