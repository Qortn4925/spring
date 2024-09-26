<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--  javaBeans 의 get 메소드 사용시
get 빼고 앞으로 소문자  , () 제거 : property(속성)
--%>

  <p>${student.id}</p>
  <p>${student.name}</p>
  <p>${student.getEmail()}</p>

<p> ${student["id"]}</p>
<p> ${student["name"]}</p>
<p> ${student["email"]}</p>

</body>



</html>
