<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3> 데이터 타입멸 입력</h3>
<form action="/main29/sub4" method="post">
  <div>
    <input type="text" name="val1">
  </div>
  <div>
    <input type="number" name="val2" step="1">
  </div>
  <div>
    <input type="number" name="val3"step="0.01">
  </div>
  <div>
    <input type="date" name="val4">
  </div>
  <div>
    <input type="datetime-local" name="val5">
  </div>

  <button>전송</button>

</form>

</body>
</html>
