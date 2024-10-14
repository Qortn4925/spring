<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3> 책 테이블 추가하기</h3>

<form action="/main29/sub9" method="post">
    <div>
      책  번호
      <input type="number" step="1" name="isbn">
    </div>
  <div>
    제목
    <input type="text" name="title">
  </div>
  <div>
    저자
    <input type="text" name="autohr">
  </div>
  <div>
    가격
    <input type="number"  name="price">
  </div>
  <div>
    출판일
    <input type="date" name="val4" value="1999-12-17">
  </div>

  <button> 데이터 입력!</button>
</form>

<c:if test="${count}">
  입력하신 정보가 맞는지 확인해주세요
  <div>
     ${param.isbn}
    </div>
</c:if>

</body>
</html>
