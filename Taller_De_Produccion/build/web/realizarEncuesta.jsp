
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
    <body background="imagenes/wallpaper-naturaleza-1366x768-4199-27324552[1].jpg">
        <header>
            <nav>
                <a class="a espacio-derecha1 re "> </a>   

                <img class="a espacio-derecha re  "src="imagenes/logo2.png" alt=""/>


                <a class="a espacio-derecha re " href="Login.jsp"> Cliente</a>           


                <a class="a espacio-derecha re " href="Login1.jsp"> Personal</a>

                <a class="a espacio-derecha re " href="listaEncuestas.jsp"> Encuentas </a>
                
                <div class="container">
                    <div>

                        <p id="iconos" style="float:right; width: 20%; display: inline-block;">
                            <img src="imagenes/jobs_icon[1].png" style="float: right; width: 15% " onmouseout="this.style.opacity = 1;
                                    this.filters.alpha.opacity = '100';" onmouseover="this.style.opacity = 0.2;
                                            this.filters.alpha.opacity = '20';" onclick="location.href = 'Login.jsp'" title="Ingreso Empleado">
                            <img src="imagenes/icon_clientes[1].png" style="float: right;width: 15%" onmouseout="this.style.opacity = 1;
                                    this.filters.alpha.opacity = '100';" onmouseover="this.style.opacity = 0.2;
                                            this.filters.alpha.opacity = '20';" onclick="location.href = 'Login.jsp'" title="Ingreso Clientes">
                            <img src="imagenes/icono_18[1].png" style="float: right;width: 15%" onmouseout="this.style.opacity = 1;
                                    this.filters.alpha.opacity = '100';" onmouseover="this.style.opacity = 0.2;
                                            this.filters.alpha.opacity = '20';" onclick="location.href = 'registroo.jsp'" title="Registro">
                            <img src="imagenes/images[11].jpg" style="float: right; width: 15% " onmouseout="this.style.opacity = 1;
                                    this.filters.alpha.opacity = '100';" onmouseover="this.style.opacity = 0.2;
                                            this.filters.alpha.opacity = '20';" onclick="location.href = 'index.html'" title="ir pagina de inicio">
                            
 
   
                            <a href="https://www.facebook.com" target="_blank"><img alt="ir a facebook" height="40" 
                           src="http://3.bp.blogspot.com/-MQuocq7OzfU/UiXwUY81yQI/AAAAAAAAB0Q/h6-R_R2-buI/s1600/face.png" title="siguenos en facebook" width="30" /></a>
                            <a href="https://twitter.com/" target="_blank"><img alt="siguenos en Twitter" height="40" 
                             src="http://2.bp.blogspot.com/-B0wCtNXYV3U/UiX1VnAQSrI/AAAAAAAAB6Q/ILY3m0NJVE8/s1600/Twitter+NEW.png" title=" ir a Twitter" width="30" /></a>
                            <a href="https://www.youtube.com" target="_blank"><img alt="Canal de youtube" height="40" 
                             src="http://1.bp.blogspot.com/-NEytJH3mFZ8/UidLG3fePdI/AAAAAAAAB_A/WbH7IJAh1qE/s1600/youtube2.png" title="ir a  youtube" width="30" /></a>

                        </p>
                    </div>
                </div>

            </nav>



        </header>
        <HR width=100% align="left"> 


        <div>
            <h1  class="titulo"  display: inline-block>Encuesta</h1>
            <div>
                
                <input class="boton1" type="text" name="" value="" />
            </div>

            <div>
                
                <input class="boton1" type="text" name="" value="" />
            </div>


        </div>

        <br>
        <br>
        
        <br>
        <br>
        <br>
        
        <form action="s100" method="post" >

            <input class="boton1" type="submit" value="Enviar Encuesta" >
        </form>
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
