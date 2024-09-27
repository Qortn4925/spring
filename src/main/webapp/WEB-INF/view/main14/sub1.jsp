<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>

    <style>
    table ,tr,td,th {border-collapse: collapse;
    border: 1px  solid black;
    }

    table{
      width: 100%;
    }


    </style>
  </head>
  <body>
      <p>${book.author}</p>
      <p>${book.publisher}</p>
      <p>${book.pages}</p>
      <p>${book.prices}</p>


  <table>
    <thead>
    <tr>
      <th>제목</th>
      <th>저자</th>
      <th>출판사</th>
      <th>페이지</th>
      <th>가격</th>
    </tr>
    </thead>
    <tbody>
<c:forEach   items="${list}" var ="book">
    <tr>
      <td> ${book.title}</td>
      <td> ${book.author} </td>
      <td>   ${book.publisher}</td>
      <td>   ${book.pages}</td>
      <td> ${book.prices}</td>
    </tr>
    </tbody>
    </c:forEach>

  </table>

      <br> <br>

      <table>
        <thead>
        <tr>
          <th>이름</th>
          <th>키</th>
          <th>몸무게</th>
          <th>생일</th>
          <th>소속</th>
          <th>포지션 </th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${members}" var="mem">
        <tr>
          <td>${mem.name}</td>
          <td>${mem.height}</td>
          <td>${mem.weight}</td>
          <td>${mem.birth}</td>
          <td>${mem.team}</td>
          <td>${mem.position}</td>
        </tr>
        </c:forEach>
        </tbody>
      </table>

  </body>
</html>
