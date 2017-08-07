<%-- 
    Document   : VerEncuestas
    Created on : May 18, 2015, 8:30:00 PM
    Author     : W4125
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrarse al Sistema</title>
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
        <link type="text/css" rel="stylesheet" href="css/bootstrap-theme.css">
        <link type="text/css" rel="stylesheet" href="css/bootstrap.css">
        <link type="text/css" rel="stylesheet" href="css/estilo.css">
        <script type="text/javascript" src="js/bootstrap.min.js" ></script>
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header>
            <nav>
                <a class="a espacio-derecha1 re "> </a>   

                <img class="a espacio-derecha re  " src="imagenes/logo2.png" alt=""/>


                <a class="a espacio-derecha re " href="Login.jsp"> Cliente</a>           


                <a class="a espacio-derecha re " href="Login1.jsp"> Personal</a>

                <a class="a espacio-derecha re " href="listaEncuestas.jsp"> Encuestas </a>

            </nav>



        </header>
        <HR width=100% align="left"> 


        <div>
            <h1>Encuesta</h1>
            <form method="get" action="Encuestas">
                <p><input type="text" name="nombre" id="nombre" value="${sessionScope.emp.nombre}"></p>
                <p><input type="text" name="descripcion" id="descripcion" value="${sessionScope.emp.descripcion}"></p>
           
</form>
        </div>



    </body>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>

    <footer >     

        <div class="a re asd" >
            <a class="a espacio-derecha1 re  "> </a>   
            <img class="imgulima" src="imagenes/logo_footer.png" alt=""/>
        </div>
        <div class="asd">
            <a class="a espacio-derecha1 re "> </a> 
            <strong> Ingeniera de Sistemas </strong>
            <br>
            <a class="a espacio-derecha1 re "> </a> 
            <strong>  Programacion Intener</strong>
            <br>
            <a class="a espacio-derecha1 re "> </a> 
            <strong>  Universidad de lima ,2015</strong> 
            <br>
            <a class="a espacio-derecha1 re "> </a> 
            <strong>  GRUPO XYZ</strong>
        </div>








    </footer>



</html>
