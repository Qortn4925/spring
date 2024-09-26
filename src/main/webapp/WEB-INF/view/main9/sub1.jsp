<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--     엘레멘트 명 + tab >  알아서 닫아줌--%>

<%-- h1+p --%>
<h1></h1>
<p></p>


<%--   >  자식 셀렉터   div안에 p >  div>p--%>

<div>
  <p></p>

</div>

<h1>
  <span></span>
</h1>


<%--  # id 셀렉터--%>

<%-- h1#head1--%>
<h1 id="head1">
<p id="para1"></p>
</h1>


<%--h1#head3+h2#sub1--%>
        <h1 id="head3"></h1>
<h2 id="sub1"></h2>

<%--div#box1--%>
<div id="box1"></div>


<%--  .  클래스 셀렉터--%>

<h1 class="head"> </h1>

<h1 class="headnote"> </h1>

<h1 id="head01" class="error note"> </h1>

<%--[]  --%>

<%--h1[title]--%>

<%-- h1[title="my head"] --%>
<h1 title="my head"></h1>

<input type="text" value="hello" name="message" title="input">

<%-- * --%>

<%-- p*3--%>

<p></p>
<p></p>
<p></p>

<%--table>tr*3>td*4--%>

<table>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
</table>


<%-- ^ --%>

<%--  table>thead>tr>th*4^^tbody>tr*3--%>

<table>
    <thead>
    <tr>
        <th></th>
        <th></th>
        <th></th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    <tr>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
    </tr>
    </tbody>
</table>

<%-- lorem--%>
Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aperiam, asperiores at autem dolore enim fugit in iste iure laborum libero minima nam necessitatibus, odit officiis porro saepe sequi tempore ullam.


<%--lorem3--%>
Lorem ipsum dolor.

<%--lorem 5--%>
Lorem ipsum dolor sit amet.

<%--table>thead>tr>th*4>lorem1^^^tbody>tr*3>th*4>l--%>
<table>
    <thead>
    <tr>
        <th>Lorem.</th>
        <th>Modi.</th>
        <th>Temporibus.</th>
        <th>Culpa.</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th>Lorem.</th>
        <th>Iste.</th>
        <th>Quasi.</th>
        <th>Rerum.</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Ea!</th>
        <th>Asperiores?</th>
        <th>Reprehenderit?</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Placeat!</th>
        <th>Tempore!</th>
        <th>Omnis.</th>
    </tr>
    </tbody>
    <tbody>
    <tr>
        <th>Lorem.</th>
        <th>Dolor!</th>
        <th>Neque.</th>
        <th>Ipsam.</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Ea!</th>
        <th>Eligendi.</th>
        <th>Maiores!</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Possimus!</th>
        <th>Repellat!</th>
        <th>Veritatis!</th>
    </tr>
    </tbody>
    <tbody>
    <tr>
        <th>Lorem.</th>
        <th>Doloremque.</th>
        <th>Totam?</th>
        <th>Fugit!</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Eius.</th>
        <th>Accusamus.</th>
        <th>Ducimus?</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Numquam?</th>
        <th>Quas?</th>
        <th>Voluptatibus!</th>
    </tr>
    </tbody>
    <tbody>
    <tr>
        <th>Lorem.</th>
        <th>Nam!</th>
        <th>Amet.</th>
        <th>Ad!</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Harum.</th>
        <th>Tenetur?</th>
        <th>Aliquam.</th>
    </tr>
    <tr>
        <th>Lorem.</th>
        <th>Quo?</th>
        <th>Excepturi.</th>
        <th>Natus.</th>
    </tr>
    </tbody>
</table>


<%--h1#header$*3--%>

<h1 id="header1"></h1>
<h1 id="header2"></h1>
<h1 id="header3"></h1>


<%-- { } content--%>

<%--h1{hello world}--%>
<h1>hello world</h1>


<%--div{$}*5--%>
<div>1</div>
<div>2</div>
<div>3</div>
<div>4</div>
<div>5</div>

<%--() 그룹--%>

<%-- (h1>p)*3--%>

<h1>
    <p></p>
</h1>
<h1>
    <p></p>
</h1>
<h1>
    <p></p>
</h1>


</body>
</html>

