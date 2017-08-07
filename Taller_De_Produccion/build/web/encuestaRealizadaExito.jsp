<%-- 
    Document   : encuestaRealizadaExito
    Created on : 22/05/2015, 04:47:36 PM
    Author     : JORDI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
        <link type="text/css" rel="stylesheet" href="css/bootstrap-theme.css">
        <link type="text/css" rel="stylesheet" href="css/bootstrap.css">
        <link type="text/css" rel="stylesheet" href="css/estilo.css">
        <script type="text/javascript" src="js/bootstrap.min.js" ></script>
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
    </head>
    <body background="imagenes/Wallpaper1--1024x768.jpg">
        
        <header>
            <nav>
                <a class="a espacio-derecha1 re "> </a>   

                <img class="a espacio-derecha re" src="imagenes/logo2.png" alt=""/>


            </nav>
            <br>
            <br>
            <br>
            <br>
            <br>
            
 <HR width=100% align="left">
         <p>
         <h5 class="titulo">Su encuesta ha sido realizado con éxito</h5>
         <h1 class="titulo">${sessionScope.fh}</h1>
        
         <a href="realizarEncuesta.jsp"><span class="glyphicon glyphicon-menu-hamburger" aria-hidden="true"></span>volver a Encuestas</a>
         <HR width=100% align="left">
         </p>


        </header>
        
        
    
  
    </body>
</html>
