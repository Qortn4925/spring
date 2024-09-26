<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

     <p> ${person["name"]}</p>
     <p> ${person["address"]}</p>
     <p> ${person["e mail"]}</p>
<%-- 키가 자바 변무셩 작성 규칙에 맞다면  영문 대소문자에 ,숫자,_ ,$,
 .키    person.name?
--%>

<p> ${person.name}</p>
</body>
</html>
