<%-- 
    Document   : editarCliente
    Created on : 19-may-2015, 10:57:01
    Author     : cynthia_
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar cliente</title>
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
        <link type="text/css" rel="stylesheet" href="css/bootstrap-theme.css">
        <link type="text/css" rel="stylesheet" href="css/bootstrap.css">
        <link type="text/css" rel="stylesheet" href="css/estilo.css">
        <script type="text/javascript" src="js/bootstrap.min.js" ></script>
        <link href="css/main.css" rel="stylesheet" type="text/css"/><script src="https://code.jquery.com/jquery-1.10.2.js"></script> 
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
       <link href="css/index.css" rel="stylesheet" type="text/css"/>
  
       
  
        <script src="https://code.jquery.com/jquery-1.10.2.js"></script> 
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
        <!no corre este JS>
        <!script src="js/nuevoCliente.js" type="text/javascript"></script>
        <script>
                    
         var expr = /^[a-zA-Z0-9_\.\-]+@[a-zA-Z0-9\-]+\.[a-zA-Z0-9\-\.]+$/;
        $(document).ready(function(){
            
            $("#bEnviar").click(function(){              
               var nombre = $("#nombre").val();
                var paterno = $("#appaterno").val();
                var materno = $("#apmaterno").val();
                var correo = $("#correo").val();
              
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


                <a class="a espacio-derecha re " href="Login.jsp"> Clientes</a>           


                <a class="a espacio-derecha re " href="Login1.jsp"> Personal</a>

                <a class="a espacio-derecha re " href="ListarEncuesta"> Encuentas </a>
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
           
            
            
            <h1 >Clientes / Ver o Editar</h1>
            <p>


            </p>
        </div>
        <HR width=70% align="left"> 

        <div>
            <h1>Edite los Datos Basicos de un Cliente</h1>
            <p>


            </p>
        </div>
        <div>
            <form  action="Cliente" method="get"  >            

               <div >
                   <p>Nombres :<br> <input type="text" name="nombre" size="50" id="nombre" value="${sessionScope.emp.nombres}">  </p>
                   <div id="mensaje1" class="errores"> Dame tu nombre</div>
                   
               </div>
               <div >
                   <p>Apellido :<br>  <input type="text" name="paterno" size="50"  id="appaterno" value="${sessionScope.emp.paterno}">  </p>
                   <div id="mensaje2" class="errores"> Dame tu apellido paterno</div>
               </div>               
               <div>
                   <p>Materno :<br>  <input type="text" name="materno" size="50"   id="apmaterno" value="${sessionScope.emp.materno}">  </p> 
                   <div id="mensaje3" class="errores"> Dame tu apellido materno</div>
               </div>               
               <div>
                   <p>Correo :<br>  <input type="text" name="correo" size="20"  id="correo" value="${sessionScope.emp.correo}">  </p>   
                   <div id="mensaje4" class="errores"> Dame un mail correcto</div>
               </div>
                   <p>Fecha de Nacimiento: <br>  <input type="text" name="fechanacim" id="fechanacim" value="${sessionScope.emp.fecha_nacimiento}">  </p>
               <div>  
                   <input type="hidden" name="accion"  value="UPDATE">
                   <input type="hidden" name="id"  value="${sessionScope.emp.id}">
            
           </div>
                
                   <input type="submit" value="Guardar"   id="bEnviar" />
                <%--<a href="Cliente?accion=UPDATE&id=${sessionScope.emp.id}"--%>
                <p>
                    <% String mensaje = "";
                        if (request.getSession().getAttribute("Error") != null) {
                            mensaje = request.getSession().getAttribute("Error").toString();
                        }%> <%= mensaje%></p>

                <% request.getSession().removeAttribute("Error");%>

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
        <br><br>

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
</html>


