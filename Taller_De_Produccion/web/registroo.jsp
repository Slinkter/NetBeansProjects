<%-- 
    Document   : registro
   

--%>

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
                var paterno = $("#usuario").val();
                var materno = $("#clave").val();
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

            <style>




            body {
                padding-top: 40px;
                padding-bottom: 40px;
                background-color: #eee;
            }
            
              .form-signin .h1{
                max-width: 330px;
                padding: 15px;
                margin: 0 auto;
                color: #eee;
                font-size: 55px !important;

            }
            .form-signin {
                max-width: 330px;
                padding: 15px;
                margin: 0 auto;
                color: #eee;
                

            }
            .form-signin .form-signin-heading, .form-signin .checkbox {
                margin-bottom: 10px;
                color: #eee;
            }
            .form-signin .checkbox {
                font-weight: normal;
            }
            .form-signin .form-control {
                position: relative;
                font-size: 16px;
                height: auto;
                padding: 10px;
                -webkit-box-sizing: border-box;
                -moz-box-sizing: border-box;
                box-sizing: border-box;
            }
            .form-signin .form-control:focus {
                z-index: 2;
            }
            .form-signin input[type="text"] {
                margin-bottom: -1px;
                border-bottom-left-radius: 0;
                border-bottom-right-radius: 0;
            }
            .form-signin input[type="password"] {
                margin-bottom: 10px;
                border-top-left-radius: 0;
                border-top-right-radius: 0;
                
                .form-signin input[type="submit"] {
                    margin-bottom: 10px;
                    border-top-left-radius: 0;
                    border-top-right-radius: 0;
                    color:black !important;
                }
            </style>

        </head>
        <body   background="imagenes/wallpaper-naturaleza-1366x768-3739-82dd82e[1].jpg">
            <h1 class="form-signin">REGISTRO</h1>

            <form method="post" action="RegistroServlet">
                <p class="form-signin">Nombre:</p>
                <p class="form-signin"><input type="text" name="nombre" id="nombre"></p>
                <div id="mensaje1" class="errores"> Ingresa tu nombre</div>
                <p class="form-signin">Usuario:</p>
                <p class="form-signin"><input type="text" name="usuario" id="usuario"></p>
                <div id="mensaje2" class="errores"> Ingresa tu usuario</div>
                <p class="form-signin">Password:</p>
                <p class="form-signin"><input type="password" name="clave" id="clave"></p>
                <div id="mensaje3" class="errores"> Ingresa tu contraseña</div>
                <p class="form-signin"><input type="submit" value="Guardar" id="bEnviar" >
                    <% String mensaje = "";
                        if (request.getSession().getAttribute("Error") != null) {
                            mensaje = request.getSession().getAttribute("Error").toString();
                        }%> <%= mensaje%></p>

                <% request.getSession().removeAttribute("Error");%>

            </form>
        </body>
    </html>
