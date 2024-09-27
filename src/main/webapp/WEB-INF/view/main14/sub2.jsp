<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        table , td , th{
            border: 1px solid black;
            border-collapse: collapse;
        }
        table{
            width: 100%;
        }

        ul + li {

        }

    </style>

</head>
<body>

<p>${actor.name}</p>
<p>${actor.agency}</p>
<p>${actor.birth}</p>
<p>${actor.mbti}</p>

  작품
<c:forEach items="${actor.works}" var="work">
  ${work}
</c:forEach>
<br>

<hr>


    <table>
        <thead>
        <tr>
            <th>이름</th>
            <th> 회사</th>
            <th>생일</th>
            <th> mbti</th>
            <th>작품</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items ="${actorList}" var ="actor1">
            <tr>
                   <td> ${actor1.name}</td>
                    <td> ${actor1.agency}</td>
                    <td> ${actor1.birth}</td>
                    <td> ${actor1.mbti}</td>
                <td>
                <ul>
                <c:forEach items="${actor1.works}" var="work1">
                <li>${work1}</li>
                </c:forEach>
                </ul>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>



</body>
</html>
