

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                   <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
                   <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
                   <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
                   <script src="js/jquery-1.11.2.min.js" type="text/javascript"></script>
                   <script src="js/bootstrap.min.js" type="text/javascript"></script>
                   
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
                  
        <title>JSP Page</title>
        
                <script>
                    
         var expr = /^[a-zA-Z0-9_\.\-]+@[a-zA-Z0-9\-]+\.[a-zA-Z0-9\-\.]+$/;
        $(document).ready(function(){
            
            $("#bEnviar").click(function(){              
               var nombre = $("#Suministro").val();
                var paterno = $("#Cliente").val();
               
              
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
                       
                    }
                }
 
            });//click
        });//ready
    
    </script>
    </head>
    <body>
        <h1>  </h1>
      <form action="BaseDatosSuministro" method="POST">             
        
         <div class="container">
                     <div class="row">
                                 <div class="col-xs-6 col-md-6">
                                     <h1 class="titulo"></h1>
                                        <h1>Agregar nuevo suministro </h1>
                                 </div>                        
                     </div>
                     
				
						
						<div class="row">
                                 <div class="col-xs-6 col-md-2">
                                 <div class="form-group">
                                  <label for="exampleInputEmail1">Suministro</label>
                                  <input type="text" name="n1" class="form-control" id="Suministro" placeholder="">
                                  <div  id="mensaje1" class="errores col-xs-10 col-md-8"> Ingresar el suministro </div>
                                  </div>
                                  </div>
                                  
                                    <div class="col-xs-6 col-md-2">
                                 <div class="form-group">
                                  <label for="exampleInputEmail1">Cliente</label>
                                  <input type="text" name="n2" class="form-control" id="Cliente" placeholder="">
                                  <div  id="mensaje2" class="errores col-xs-10 col-md-8"> Ingresar el cliente válido </div>
		                                  		<%if(request.getAttribute("errorfailCliente")!=null){%>
									            <div>el Cliente no existe!</div>
									             <% }	%>
                                  
                                  </div>
                                  </div>
                                  
                                  
                                    <div class="col-xs-6 col-md-2">
                                 <div class="form-group">
                                  <label for="exampleInputEmail1">Direccion</label>
                                  <input type="text" name="n3" class="form-control" id="exampleInputEmail1" placeholder="">
                                  </div>
                                  </div>
                        
                                    
                        </div>  
						
						<div class="row">
                                 <div class="col-xs-6 col-md-2">
                                 <div class="form-group">
                                  <label for="exampleInputEmail1">Tipo de casa</label>
                                  <input type="text" name="n4" class="form-control" id="exampleInputEmail1" placeholder="">
                                  </div>
                                  </div>
                                  
                                    <div class="col-xs-6 col-md-2">
                                 <div class="form-group">
                                  <label for="exampleInputEmail1">Distrito</label>
                                  <input type="text" name="n5" class="form-control" id="exampleInputEmail1" placeholder="">
                                  </div>
                                  </div>
                           
                        </div> 
	
						

                      <div class="row">                         

                              
                                                                           
                                                <button type="submit"  id="bEnviar"class="boton btn btn-primary">Guardar Cambios</button>
                                                <button type="reset" class="boton btn btn-success">Limpiar</button>
                                  
                    </div>
                      
                                   
      </div>   

      </form>
        
        
    </body>
</html>
