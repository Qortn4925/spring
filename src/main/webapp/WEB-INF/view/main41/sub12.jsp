<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

</head>
<body>
<%-- bootstrap grid--%>
<%-- css grid 격자 헤헤--%>
<%-- container: 화면크기에 따라 적절한 너비를 갖게됨 --%>
<%-- container 내에 전체 콘텐츠가 배치  --%>

<div class="container bg-success">
    <h1>Lorem ipsum dolor sit amet.</h1>
</div>

<hr>

<div class="container bg-secondary-subtle h-50">
    <div class="row bg-success h-50">
        <div class="col bg-warning h-50">1</div>
        <div class="col bg-info h-50">2</div>
        <div class="col bg-primary h-50">3</div>
    </div>
</div>

<%--row >  12개의 col 이라고 생각    col-숫자는    비율을 의미하는거임  --%>
<div class="container bg-secondary-subtle h-50">
    <div class="row bg-success h-50">
        <div class="col-3 bg-warning h-50">1</div>
        <div class="col-6 bg-info h-50">2</div>
        <div class="col-3 bg-primary h-50">3</div>
    </div>
</div>

<div class="container bg-secondary-subtle h-50">
    <div class="row bg-success h-50">
        <div class="col-3 col-sm-6 col-md-12 bg-warning h-50">1</div>
        <div class="col-6 col-sm-12 col-md-12 bg-info h-50">2</div>
        <div class="col-3 col-sm-6 col-md-12 bg-primary h-50">3</div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
</body>


</html>
