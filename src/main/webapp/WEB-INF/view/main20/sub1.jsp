<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--method : 전송 방식 default > get--%>
<%-- get 방식: 주소에 쿼리스트링()으로 붙음
        주소란에 노ㅜㄹ되고 , 길이의 제한이 있음
--%>
<%--
post 방식 : 요청 메시지 본문(body)에 붙음
            주소란에 노출x 길이제한 x
--%>
<form action="/main20/sub2" method="post">
    <input type="text" name="name">
    <br>
<%--    노출되기 싫은 정보가 넘어감--%>
    <input type="password" name="pw">
    <br>
<%--     주소란에 작성될 수 잇는 문자열의 길이는 제한> 정보가 짤릴수도 있음--%>
    <textarea name="note" id="" cols="30" rows="10">
     매우 긴 글
    </textarea>
    <button>전송</button>
</form>



<form action="/main20/sub3" method="post" >
    <select name="sel" id="">
        <option value="val1">val1</option>
        <option value="val2">val2</option>
        <option value="val3">val3</option>

    </select>
    <br>
    <input type="date" name="birth">
    <br>
    <input type="text" name="age"  value="30">
    <br>
    <button>전송</button>

</form>
</body>
</html>
