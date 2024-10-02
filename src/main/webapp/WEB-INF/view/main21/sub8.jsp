<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/main21/sub9" method="post">

  <input type="text" name="userName" value="kim">
  <br>
  <input type="number" name="age" value="33">
  <br>
  <input type="checkbox" name="foodList" value="f1"> f1
  <br>
  <input type="checkbox" name="foodList" value="f2"> f2
  <br>
  <input type="checkbox" name="foodList" value="f3"> f3
  <br>

  <input type="date" name="startDate">
  <br>
  <input type="datetime-local" name="endDateTime">
  <br>

  <input type="checkbox" name="expired" value="true">
   유효여부
  <br>
  <input type="number" name="score" value="3.14" step="0.01">


  <button>전송</button>
</form>
</body>
</html>
