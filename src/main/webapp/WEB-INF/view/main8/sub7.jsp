<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<html>
<head>
    <title>Title</title>
</head>
<body>


<p> ${jobs}</p>
<p> ${jobs[0]}</p>
<p> ${jobs[1]}</p>
<p> ${jobs[2]}</p>

<p> ${points}</p>
<p> ${points[0]}</p>
<p> ${points[1]}</p>
<p> ${points[2]}</p>

<c:forEach items="${jobs}" var="job">
  <p>${job} </p>
</c:forEach>

</body>
</html>