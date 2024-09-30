<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
  <a href="/main17/sub2"> 블로그</a>
</div>


<c:if test="${not empty sessionScope.userid}" var="loggedIn">
  <div>
    <a href ="/main17/sub4"> 로그아웃</a>
  </div>
</c:if>

<c:if test ="${not loggedIn}">
  <div>
    <a href="/main17/sub1"> 로그인</a>
  </div>


</c:if>