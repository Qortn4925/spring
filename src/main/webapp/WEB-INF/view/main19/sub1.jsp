<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1> sub1. jsp</h1>

<%--  action: request parameter가 전달 되는 위치
      , 생략하면 주소창에 작성된 주소로 > 현재 주소로 ㅇㅇ --%>

<form>
  <input type="text" name="address" value="서울">
  <br>
  <input type="text" name="nick" value="수도">
  <br>

<%--  submit 버튼 --%>
<%--  submit 버튼 클릭시
     : action  속성(attribute)에 명시된 위치로
     method 속성(attribute) 방식으로
      form 요소들의 name=value 쌍이 전달 됨 --%>
  <button>제출</button>
</form>

<form action="/main19/sub2">
  <input type="text" name="name" value="value">

  <br>
  <input type="text" name="age" value="44">
  <br>
  <button>제출</button>
</form>


<form action="/main19/sub3">
  <input type="text" name="food" value="피자">
  <br>
  <input type="text" name="email" value="yahoo">
  <br>
  <input type="text" name="city" value="인천">
  <br>

  <button> 제출</button>
</form>

<form action="/main19/sub4">

  <input type="text" name="name" value="흥민">

  <select name="food" id="">
    <option value="pizza">val1</option>
    <option value="coffee">val2</option>
    <option value="burger">val3</option>
  </select>
  <br>

  <textarea name="memo" id="" cols="30" rows="10">  sdfdsfsdfsd </textarea>
  <br>
  <button>제출</button>
</form>


<form action="sub5">
  <input type="checkbox" name="city" id="" value="seoul">
  Lorem.
  <br>
  <input type="checkbox" name="city" id="" value="busan">
  Corporis?
  <br>
  <input type="checkbox" name="city" id="" value="jeju">
  Voluptate?
  <br>
  <button>전송</button>
</form>

<%-- 체크 박스에 value가 없는 경우--%>
<form action="/main19/sub6">
  <input type="checkbox" name="accept" value="check">
   동의 합니다
  <br>

  <button>전송</button>
</form>

<form action="/main19/sub7">
  <input type="radio" name="location" id="" value="gangnam">
  Lorem.
  <br>
  <input type="radio" name="location" id="" value="shinchon">
  Sunt!
  <br>
  <input type="radio" name="location" id="" value="hongdae">
  Iusto!
  <br>
<button>전송</button>
</form>


<form action="/main19/sub8">
  <input type="date" name="birth" id="">
  <br>
  <input type="datetime-local" name="now" id="">
  <br>
  <input type="hidden" name="some" id="" value="some value">
  <br>
  <button>전송</button>
</form>

<form action="/main19/sub10">
  <input type="text" name="text" value="">
  <br>
  <input type="checkbox" name="foods" id="" value="coffee">커피
  <br>
  <input type="checkbox" name="foods" id="" value="water"> 물
  <br>
  <input type="checkbox" name="foods" id="" value="tea"> 차
  <br>
  <input type="radio" name="choice" value="sel1"> 1번
  <br>
  <input type="radio" name="choice" value="sel2"> 2번
  <br>
  <input type="radio" name="choice" value="sel3"> 3번
  <br>
  <input type="date" name="birthDate" id="">
  <br>
  <input type="datetime-local" name="startDateTime">
  <br>
  <select name="check" id="">
    <option value="some1"> 1</option>
    <option value="some2"> 2</option>
    <option value="some3"> 3</option>
  </select>
  <br>
  <textarea name="memo" id="" cols="30" rows="10">Lorem ipsum dolor.</textarea>
  <br>

  <button>전송</button>


</form>
</body>
</html>
