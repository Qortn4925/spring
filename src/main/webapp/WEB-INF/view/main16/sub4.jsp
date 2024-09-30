<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:import url="sub8.jsp"/>
<h1>${sessionScope.userid}카페</h1>
<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aut commodi cupiditate dicta, laudantium recusandae sed
    tempore ullam? Alias consectetur consequatur dolor doloribus magni optio perferendis quasi, repudiandae soluta ullam
    velit.</p>


<p>${param.id}</p>
</body>
</html>
