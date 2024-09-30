<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:set var="attr1" value="value1" scope="page"/>
<c:set var="attr2" value="value2" scope="request"/>
<c:set var="attr3" value="value3" scope="session"/>
<c:set var="attr4" value="value4" scope="application"/>

<p>${attr1}</p>
<p>${attr2}</p>
<p>${attr3}</p>
<p>${attr4}</p>
<c:set var="attr5" value="value5 page" scope="page"/>
<c:set var="attr5" value="value5 session" scope="session"/>
<c:set var="attr5" value="value5 application" scope="application"/>
<c:set var="attr5" value="value5 request" scope="request"/>


<c:set var="attr6" value="value6 session" scope="session"/>
<c:set var="attr6" value="value6 application" scope="application"/>
<c:set var="attr6" value="value6 request" scope="request"/>




<c:set var="attr7" value="value7 application" scope="application"/>
<c:set var="attr7" value="value7 request" scope="request"/>

<c:set var="att8" value="value8 request" scope="request"/>
<
<p> ${attr5}</p>
<p> ${attr6}</p>
<p> ${attr7}</p>
<p> ${attr8}</p>
<%-- 가장 좁은 영역에 있는 attribute가 출력--%>

<%--el impllicit objects
pagescope, requestscope, sessionscope, applicationscope
 > map 객체
--%>

<p> ${attr5}</p>
<p> ${pageScope.attr5}</p>
<p> ${pageScope.["attr5"]}</p>

<p> ${requestScope.attr5}</p>
<p> ${requestScope.["attr5"]}</p>

</body>
</html>
