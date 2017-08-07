<%-- 
    Document   : nuevoCliente
    Created on : 20/05/2015, 07:57:31 PM
    Author     : JORDI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar cliente</title>
      
        <link type="text/css" rel="stylesheet" href="css/bootstrap-theme.css">
        <link type="text/css" rel="stylesheet" href="css/bootstrap.css">
        <link type="text/css" rel="stylesheet" href="css/estilo.css">
        <script type="text/javascript" src="js/bootstrap.min.js" ></script>
        <link href="css/main.css" rel="stylesheet" type="text/css"/>       
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
       <link href="css/index.css" rel="stylesheet" type="text/css"/>
       
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
        <!script src="js/nuevoCliente.js" type="text/javascript"></script>

        
         <script>
                    
         var expr = /^[a-zA-Z0-9_\.\-]+@[a-zA-Z0-9\-]+\.[a-zA-Z0-9\-\.]+$/;
        $(document).ready(function(){
            
            $("#bEnviar").click(function(){              
               var nombre = $("#NOMBRE").val();
                var paterno = $("#Paterno").val();
                var materno = $("#Materno").val();
                var correo = $("#Correo").val();
              
                if(nombre == ""){
                    $("#mensaje1").fadeIn("slow");
                    return false;
                }     
                else{
                    $("#mensaje1").fadeOut();
 
                    if(paterno == ""){
                        $("#mensaje2").fadeIn("slow");
                        return false;
                    }
                    else{
                        $("#mensaje2").fadeOut();
 
                        if(materno == ""){
                            $("#mensaje3").fadeIn("slow");
                            return false;
                        }
                        else{
                            $("#mensaje3").fadeOut();
 
                            if(correo == "" || !expr.test(correo)){
                                $("#mensaje4").fadeIn("slow");
                                return false;
                            }
                        }
                    }
                }
 
            });//click
        });//ready
    </script>
  
        
        
      
        
        
    </head>
    
    
    <body background="imagenes/wallpaper-naturaleza-1366x768-4199-27324552[1].jpg">
         <header>
            <nav>
                <a class="a espacio-derecha1 re "> </a>   

                <img class="a espacio-derecha re  "src="imagenes/logo2.png" alt=""/>


                <a class="a espacio-derecha re "> Clientes</a>           


                <a class="a espacio-derecha re "> Personal</a>

                <a class="a espacio-derecha re "> Encuentas </a>
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
            <h1  >Crear cliente</h1>
            <p>


            </p>
        </div>
        
         <HR width=70% align="left"> 
<div>
            <h1 >Edite los Datos Basicos de un Cliente</h1>
            <p>


            </p>
        </div>
         
          <div>
            <form id="myAjaxRequestForm" method="post" action="Cliente">
                <p>Nombres:</p>
                <p><input type="text" name="NOMBRE" id="NOMBRE"></p>
                <div id="mensaje1" class="errores"> Dame tu nombre</div>
                <p>Apellido Paterno:</p>
                <p><input type="text" name="paterno" id="Paterno"></p>
                <div id="mensaje2" class="errores"> Dame tu apellido paterno</div>
                <p>Apellido Materno:</p>
                <p><input type="text" name="materno" id="Materno"></p>
                <div id="mensaje3" class="errores"> Dame tu apellido materno</div>
                <p>Correo:</p>
                <p><input type="text" name="correo" id="Correo"></p>
                <div id="mensaje4" class="errores"> Dame un mail correcto</div>
                <p>Fecha de Nacimiento:</p>
                <p><input  type="date" name="fecha" id="123"></p>
                <p> <input type="hidden" name="accion"  value="NUEVO">  </p>

                <p><input class="boton1" type="submit" id="bEnviar" value="Crear cliente" >
                    
                    <% String mensaje = "";
                        if (request.getSession().getAttribute("Error") != null) {
                            mensaje = request.getSession().getAttribute("Error").toString();
                        }%> <%= mensaje%></p>

                <% request.getSession().removeAttribute("Error");%>

            </form>
        </div>
        <br>
        <br>
        <br>
        <br>
        <br>
    <br>
    <br>
    <br>
      
        <footer>     

            <div class="a re asd" >
                <a class="a espacio-derecha1 re  "> </a>   
                <img class="imgulima" src="imagenes/logo_footer.png" alt=""/>
            </div>
            <div class="asd">
                <a class="a espacio-derecha1 re "> </a> 
                <strong> Ingeniera de Sistemas </strong>
                <br>
                <a class="a espacio-derecha1 re "> </a> 
                <strong>  Programacion Internet</strong>
                <br>
                <a class="a espacio-derecha1 re "> </a> 
                <strong>  Universidad de lima ,2015</strong> 
                <br>
                <a class="a espacio-derecha1 re "> </a> 
                <strong>  GRUPO XYZ</strong>
            </div>

        </footer>
        
    </body>
</html>
