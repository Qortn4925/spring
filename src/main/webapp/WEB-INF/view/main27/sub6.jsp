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
       .arrow{
         display: inline;
       }

      .number{
         display: inline-block;
      }
    </style>
  </head>
  <body>

  <h3> 최신 주문 목록 페이지</h3>

  <form action="">
  <input type="text" name="page"  placeholder="페이지수" value="${param.page}">
  <br>
  <input type="text" name="page_count"  placeholder="몇개씩" value="${param.page_count}">
    <button>검색 </button>
  </form>
  
  <table>
    <thead>
    <tr>
      <th>주문번호</th>
      <th>고객번호</th>
      <th>고용번호</th>
      <th>주문날짜</th>
      <th>운송장번호</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${List}" var="order">
      <tr>
        <td>${order.id}</td>
        <td>${order.customerId}</td>
        <td>${order.employeeId}</td>
        <td>${order.orderDate}</td>
        <td>${order.shipperId}</td>
      </tr>
    </c:forEach>
    </tbody>

  </table>


  <c:url value="/main27/sub6" var="pageLinkPrev">
    <c:param name="page" value="${startPageNumber-1}"/>
  </c:url>

  <c:if test="${startPageNumber!=1}">
    <a href ="${pageLinkPrev}"class="arrow"> 이전 </a>
  </c:if>


  <div style="margin:10px" class="number">
    <c:forEach begin="${startPageNumber}" end="${endPageNumber<count?endPageNumber:count}" var="pageNumber">

      <c:url value="/main27/sub6" var="pageLink">
        <c:param name="page" value="${pageNumber}"/>
      </c:url>
      <span class="${currentPageNumber==pageNumber?'active':''}">
      <a href="${pageLink}"> ${pageNumber} </a>
        </span>
    </c:forEach>
  </div>

  <c:url value="/main27/sub6" var="pageLinkNext">
    <c:param name="page" value="${endPageNumber+1}"/>
  </c:url>

  <c:if test="${(endPageNumber/20)!=(/20)}" >
    <a href="${pageLinkNext}" class="arrow">이후</a>
  </c:if>


<%--  몫, 나머지 ,   count 를 > --%>

  </body>
</html>
