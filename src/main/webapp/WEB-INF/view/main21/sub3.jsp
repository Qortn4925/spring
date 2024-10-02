<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post">
  <input type="text" name="lunch" value="돈까스">
  <br>

  <button>전송</button>
    <hr>

<%--     Controller21.sub5 메소드 작성, request parameter가 객체의 property에 반영되어 콘솔에 출력하는 코드--%>
</form>
    <form action="/main21/sub4" method="get">
        <input type="text" name="address" value="seoul">
        <br>
        <input type="number" name="age" value="33">
        <br>
        <input type="date" name="birth" value="2002-02-02">
        <br>
        <button>전송</button>
    </form>

<form action="/main21/sub5" method="post">
    <input type="radio" name="select" id="" value="pizza"> 피자
    <br>
    <input type="radio" name="select" id="" value="burger">버거
    <br>
    <input type="radio" name="select" id="" value="coffee">커피
    <br>

    <input type="datetime-local" name="now">
    <button>전송</button>
</form>

<form action="/main21/sub6">
    <input type="text" nane="title" value="자바">
    <br>
    <input type="text" name="autohr" value="shin">
    <br>
    <input type="text" name="price" value="5000">
    <br>
    <button>전송</button>
    
</form>


<form action="/main21/sub7">
    <input type="text" nane="title" value="자바">
    <br>
    <input type="text" name="autohr" value="shin">
    <br>
    <input type="text" name="price" value="5000">
    <br>
    <button>전송</button>

</form>
</body>
</html>
