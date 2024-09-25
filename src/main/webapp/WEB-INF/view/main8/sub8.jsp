
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>

  <p>${students[0]}</p>
  <p>${students[1]}</p>
  <p>${students[2]}</p>

  <hr>

  <p>${num}</p>
  <p>${index}</p>
  <p>${point}</p>
  <hr>
<%--   그냥 배열 길이 같은거 정할때 , a.length 넣는거랑 똑같음> 결국 정수라는게 확정이라서--%>
  <p>${students[num]}</p>
  <p>${students[index]}</p>
  <p>${students[point]}</p>


  </body>
</html>
