<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${data}" var ="entry">
  <p>${entry.key}</p>
  <ul>
     <c:forEach items ="${entry.value}" var="id">
       <p> ${id} </p>
     </c:forEach>
  </ul>
</c:forEach>







<c:forEach items="${movies}" var ="entry">
  <p>${entry.key}</p>
  <ul>
    <c:forEach items ="${entry.value}" var="id">
      <p> ${id} </p>
    </c:forEach>
  </ul>
</c:forEach>


</body>
</html>
