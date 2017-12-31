
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"  href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet"  href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">
        <link rel="stylesheet"  href="https://code.jquery.com/jquery-3.2.1.js">
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/bootstrap.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/jquery-1.11.2.min.js" type="text/javascript"></script>   
        <script src="js/AdminAddPrespuesto.js" type="text/javascript"></script>
        
        <title>..::Presupuesto::..</title>
    </head>
    <body>
         <div class="container">            
             <h1>
                 Presupuesto -Vidrieria
             </h1>
             <br>
             <form action="prueba2" class="form-horizontal" method="post">
                <div class="row">                      
                    <div>
                         <label for="nombre"  class="control-label col-md-2 col-lg-2">Servicio</label>
                    </div>                    
                       <div class="col-md-6 ">
                           <select name="producto" class="form-control checkbox " id="servicio">
                               <option value="1">Espejo</option>
                               <option value="2">Catedral 03mm</option>
                               <option value="0">----------------------------</option>
                               <option value="3">Incoloro 04mm </option>
                               <option value="4">Incoloro 06mm </option>
                               <option value="5">Incoloro 08mm </option>
                               <option value="6">Incoloro 10mm </option>
                               <option value="0">----------------------------</option>
                               <option value="7">Bronce 04mm</option>
                               <option value="8">Bronce 06mm</option>                               
                               <option value="9">Bronce 08mm</option>
                               <option value="10">Bronce 10mm</option>                           
                               <option value="0">----------------------------</option>
                               <option value="11">Ventana Crudo Incoloro 06 mm</option>
                               <option value="12">Ventana Crudo Incoloro 08 mm</option>
                               <option value="13">Ventana Crudo Incoloro 10 mm</option>
                               <option value="0">----------------------------</option>
                               <option value="14">Ventana Templado Incoloro 06 mm</option>
                               <option value="15">Ventana Templado Incoloro 08 mm</option>
                               <option value="16">Ventana Templado Incoloro 10 mm</option>
                               <option value="0">----------------------------</option>                         
                               <option value="17">Ducha Crudo Incoloro 06 mm</option>
                               <option value="18">Ducha Crudo Incoloro 08 mm</option>
                               <option value="19">Ducha Crudo Incoloro 10 mm</option>
                               <option value="Ventana">----------------------------</option>  
                               <option value="20">Ducha Templado Incoloro 06 mm</option>
                               <option value="21">Ducha Templado Incoloro 08 mm</option>
                               <option value="22">Ducha Templado Incoloro 10 mm</option>
                               <option value="0">----------------------------</option>                         
                               <option value="23">Mampara Crudo Incoloro 06 mm</option>
                               <option value="24">Mampara Crudo Incoloro 08 mm</option>
                               <option value="25">Mampara Crudo Incoloro 10 mm</option>
                               <option value="0">----------------------------</option>  
                               <option value="26">Mampara Templado Incoloro 06 mm</option>
                               <option value="27">Mampara Templado Incoloro 08 mm</option>
                               <option value="28">Mampara Templado Incoloro 10 mm</option>
                               <option value="0">----------------------------</option>  
                               <option value="29">Puerta Templado Incoloro 06 mm</option>
                               <option value="30">Puerta Templado Incoloro 08 mm</option>
                               <option value="31">Puerta Templado Incoloro 10 mm</option>                                
                               
                        </select>                    
                      </div>                    
                </div>                
              
                <br><br>  
                 <div class="form-group has-success ">
                     <label for="Ancho"  class="control-label col-md-2 col-lg-2">Ancho</label>
                     <div class="col-md-6 col-lg-5 ">
                         <input class="form-control " type="text" name="ancho" id="ancho" placeholder="Ingresar Ancho cm">
                     </div>         
                      <label class="control-label "> cm </label>
                </div>              

                <div class="form-group has-error">
                    <label for="Altura" class="control-label col-md-2 col-lg-2">Altura</label>
                    <div class="col-md-6 col-lg-5">
                        <input  class="form-control" type="text" name="altura" id="altura"placeholder="Ingresar Altura cm">
                    </div>
                    <label class="control-label "> cm </label>
                </div>               

                <div class="form-group">
                    <div class=" col-md-2 col-md-offset-2">
                        <input type="submit"  class="btn btn-success" value="Calcular">
                    </div>
                </div>
                
                <div class="form-group">
                    <div class=" col-md-2 col-md-offset-2">
                        <label>Resultado</label>
                        
                       
                    </div>                    
	        </div>
                
                
                
            </form>

        </div>
        <script src="https://code.jquery.com/jquery-latest.js" charset="utf-8"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" charset="utf-8"></script>

    </body>
</html> 
