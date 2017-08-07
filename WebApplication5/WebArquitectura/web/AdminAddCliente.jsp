<%-- 
    Document   : AdminAddCliente
    Created on : 12/11/2015, 04:39:10 PM
    Author     : LuiS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <meta name="viewport" content="width=device-width, initial-scale=1.0">
       <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
       <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
       <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
       <script src="js/jquery-1.11.2.min.js" type="text/javascript"></script>
       <script src="js/bootstrap.min.js" type="text/javascript"></script>
       <script src="js/jquery.ui.js" type="text/javascript"></script>
       <script src="js/jquery.datepicker.js" type="text/javascript"></script>
       <script src="js/index.js" type="text/javascript"></script>
       <link href="css/jquery.ui.css" rel="stylesheet" type="text/css"/>
       <link href="css/jquery.datepicker.css" rel="stylesheet" type="text/css"/>
                   
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
        <link rel="stylesheet"  href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
                   
        <title>JSP Page</title>
        
         <script>
                    
         var expr = /^[a-zA-Z0-9_\.\-]+@[a-zA-Z0-9\-]+\.[a-zA-Z0-9\-\.]+$/;
        $(document).ready(function(){
            
            $("#bEnviar").click(function(){              
               var nombre = $("#Nombre").val();
                var paterno = $("#Usuario").val();
                var materno = $("#Clave").val();
                
              
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
 
                           
                        }
                    }
                }
 
            });//click
        });//ready
    
    </script>
        
        
        
        
    </head>
    <body background="">
      <form action="BaseDatosCliente" method="post">             
         
         <div class="container">
                     <div class="row">
                                 <div class="col-xs-6 col-md-6">
                                     <h1 class="titulo"></h1>
                                        <h1>Crear Cliente</h1>
                                 </div>                        
                     </div>
                     <div class="row">
                                 <div class="col-xs-10 col-md-4">
                                 <div class="form-group">
                                  <label for="exampleInputEmail1">Nombre</label>
                                  <input type="text" name="nombre" class="form-control" id="Nombre" placeholder="">
                                  <div  id="mensaje1" class="errores col-xs-10 col-md-8"> Ingresar el nombre </div>
                                  </div>
                                  </div>
                                    
                     </div>   
                     <div class="row">
                                 <div class="col-xs-10 col-md-4">
                                 <div class="form-group">
                                  
                                  <label for="exampleInputEmail1">Usuario </label>
                                   <input type="text" name="usuario" class="form-control" id="Usuario" placeholder="">
                                    <div id="mensaje2" class="errores"> Ingrese usuario del cliente</div>
                                   </div>
                                </div>                         
                                 
                     </div>    
                     
                     
                     <div class="row">
                                                       
                                 <div class="col-xs-10 col-md-4">
                                  <div class="form-group">
                                  <label for="exampleInputEmail1">Clave</label>
                                   <input type="text" name="clave" class="form-control" id="Clave" placeholder="">
                                   <div id="mensaje3" class="errores"> Ingresar clave</div>
                                   </div>
                                  </div>  
                     </div>  
                             
             
             
                     <div class="row">                         

                                 <div class="col-xs-6 col-md-3">
                                            <div class="form-group">                               
                                                <button type="submit" id="bEnviar"  class="boton btn btn-primary">Guardar Cambios</button>
                                                <button type="reset" class="boton btn btn-success">Limpiar</button>
                                             </div>
                                 </div>
                    </div>
             
             
             
         </div>          

      </form>
    </body>
</html>
