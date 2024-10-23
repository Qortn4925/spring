<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">


    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <style>
        span:nth-child(odd){
            background-color: cadetblue;
        }
        span:nth-child(even){
            background-color: beige;
        } div:nth-child(odd){
            background-color: cadetblue;
        }
        div:nth-child(even){
            background-color: beige;
        }

    </style>
</head>
<body>
<span  class="m-3 p-3">Culpa illo necessitatibus repudiandae! Odit.</span>
    <span class="m-3 p-3">Consectetur dolores enim quo reiciendis!</span>
    <span class="m-3 p-3">Asperiores culpa itaque labore modi.</span>
    <span class="m-3 p-3">Eum explicabo facilis molestias ut.</span>
<hr>
<div class="m-3 p-3">Lorem ipsum dolor.</div>
<div class="m-3 p-3">Aperiam, cumque, dolore?</div>
<div class="m-3 p-3">Doloribus, iste, quis?</div>
<div class="m-3 p-3">Assumenda, cupiditate, placeat?</div>
<div class="m-3 p-3">Consectetur, mollitia, numquam?</div>

<%-- flex container ,  --%>
<div style="display:flex; background-color: crimson;" >
<%-- flex items: 가장 높은 높이 , 오른쪽에 배치 --%>
    <div class="m-3 p-3">1</div>
    <div class="m-3 p-3">2</div>
    <div class="m-3 p-3">3</div>
    <div class="m-3 p-3">4</div>
    <div class="m-3 p-3">5</div>
    <div class="m-3 p-3">6</div>
    <div class="m-3 p-3">7</div>
</div>


<div style="display: flex; justify-content: space-around;" >
    <div>1</div>
    <div>2</div>
    <div>3</div>
</div>

<div style="display: flex; " >
    <div>1</div>
    <div>2</div>
    <div>3</div>
</div>

<div style="display: flex; justify-content:center; align-items: center;" >
    <div>1</div>
    <div>2</div>
    <div>3</div>
</div>

<hr>

<div style="display: flex;  gap:20px" >
    <div>1</div>
    <div>2</div>
    <div>3</div>
</div>


<div style="display: flex;  gap:20px" >
<%--     플렉스 아이템에 지칭 가능한거--%>
<%--     남은 공간 어떻게 차지 할지, 남은공간 계산후 , 애가 다먹고 나머지 배치--%>
<%--    flex : 남은공간 어떻게 차지 할지 (기본공간 ,shirink 조건)--%>
    <div style="flex-grow:1">1</div>
    <div style="flex-grow:1">2</div>
    <div >3</div>
</div>


<div style="display: flex;  " >
    <div style="flex: 1">1</div>
    <div style="flex: 2">2</div>
    <div style="flex: 1">3</div>
</div>






<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
</body>
</html>
