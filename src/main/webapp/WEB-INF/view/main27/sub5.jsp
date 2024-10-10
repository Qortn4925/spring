<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
  <style>

    .active{
      background: yellow;
      color: white;
    }

  </style>
</head>
<body>
<h3> 고객명 검색</h3>
<form>
  <input type="text" placeholder="조회할 이름" name="page">
  <input type="text" placeholder="조회할 이름" name="page_count">
  <button>검섹</button>
</form>

<hr>

<table>
  <thead>
  <tr>
    <th>손님 번호</th>
    <th>손님 이름</th>
    <th>계약 명</th>
    <th> 주소</th>
    <th>도시 이름</th>
    <th> 코드</th>
    <th> 나라 </th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${List}" var="cl">
    <tr>
      <td>${cl.id}</td>
      <td>${cl.name}</td>
      <td>${cl.contactName}</td>
      <td>${cl.address}</td>
      <td>${cl.city}</td>
      <td>${cl.postalCode}</td>
      <td>${cl.country}</td>
    </tr>
  </c:forEach>
  </tbody>

</table>



<div style="margin:10px">

  <c:url value="/main27/sub5" var="pageLink">
    <c:param name="page" value="${prevPageNumber}"/>
  </c:url>
  <c:if test="${startPageNumber!=1}">
    <a href="${pageLink}">  &lt; 이전 </a>
  </c:if>


    <c:forEach begin="${startPageNumber}" end="${endPageNumber<count?endPageNumber:count}" var="pageNumber">
      <c:url value="/main27/sub5" var="pageLink">
        <c:param name="page" value="${pageNumber}"/>
      </c:url>
      <span class="${currentPageNumber==pageNumber?'active':''}">
      <a href="${pageLink}"> ${pageNumber} </a>
        </span>



    </c:forEach>

  <c:url value="/main27/sub5" var="pageLink">
    <c:param name="page" value="${nextPageNumber}"/>
  </c:url>
    <c:if test="${(endPageNumber/param.page_count)!=(count/param.page_count)}" >
      <a href="${pageLink}">다음 &gt; </a>
    </c:if>

</div>
</body>
</html>
