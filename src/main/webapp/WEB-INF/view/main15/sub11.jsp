<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%-- main15/sub11?name=범근--%>

${param.name}

<c:import url="sub12.jsp">

  <c:param name="food" value="피자"></c:param>
  <c:param name="model" value="제네시스"></c:param>
</c:import>

</body>
</html>


