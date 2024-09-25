<%@ page import="org.springframework.ui.Model" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
       <p>${countries[0]}</p>
       <p>${countries[1]}</p>
       <p>${countries[2]}</p>
       <p>${islands[0]}</p>
       <p>${islands[1]}</p>
       <p>${islands[2]}</p>
        <p>${points[0]}</p>
        <p>${points[1]}</p>
        <p>${points[2]}</p>

       <%--  jsp 주석   응답에 포함 x--%>
       <!-- html 주석: 응답에 포함 -->

<%--       ctrl +/  --%>
       <p>${countries["0"]}</p>
       <p>${countries['1']}</p>

</body>
</html>
