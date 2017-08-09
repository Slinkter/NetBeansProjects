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
            <form action="" class="form-horizontal">
                <div class="row">                      
                    <div>
                         <label for="nombre"  class="control-label col-md-2 col-lg-2">Servicio</label>
                    </div>                    
                       <div class="col-md-6 ">
                           <select class="form-control checkbox " id="servicio">
                            <option value="Ventana">Ventana</option>
                            <option value="Mampara">Mampara</option>
                            <option value="Ducha">Ducha</option>
                            <option value="Espejo">Espejo</option>
                            <option value="Incoloro">Incoloro (vidrio transparente)</option>
                            <option value="Bronce">Bronce (vidrio oscuro)</option>
                            <option value="Catedral">Catedral (vidrio diseño)</option>
                        </select>                    
                      </div>                    
                </div>
                <br><br>                
                <div class="row">                      
                    <div>
                         <label for="nombre"  class="control-label col-md-2 col-lg-2">Material</label>
                    </div>                    
                    <div class="col-md-6 ">
                        <select class="form-control checkbox" id="material">
                        <option value="Crudo">Crudo</option>
                        <option value="Templado">Templado</option>                            
                      </select>                    
                   </div>                    
                </div>
                <br><br>
                <div class="row">                      
                    <div>
                        <label for="nombre"  class="control-label col-md-2 col-lg-2" >Grosor</label>
                    </div>                    
                    <div class="col-md-6 ">
                      <select class="form-control checkbox" id="grosor">
                        <option value="4"> 4 mm </option>
                        <option value="6"> 6 mm </option>   
                        <option value="8"> 8 mm </option>  
                        <option value="10"> 10 mm </option>  
                      </select>                    
                   </div>                    
                </div>
                <br><br>
                <div class="row">                      
                    <div>
                        <label for="nombre"  class="control-label col-md-2 col-lg-2" >Adiccional</label>
                    </div>                    
                    <div class="col-md-6 ">
                      <select class="form-control checkbox" id="adiccional">
                        <option value="Arenado"> Arenado </option>
                        <option value="Lamina"> Lamina </option>   
                        <option value="Normal"> Normal </option> 
                      </select>                    
                   </div>                    
                </div>
                <br><br>  
                 <div class="form-group has-success ">
                     <label for="Ancho"  class="control-label col-md-2 col-lg-2">Ancho</label>
                     <div class="col-md-6 col-lg-5 ">
                         <input class="form-control " type="text" id="ancho" placeholder="Ingresar Ancho cm">
                     </div>         
                      <label class="control-label "> cm </label>
                </div>              

                <div class="form-group has-error">
                    <label for="Altura" class="control-label col-md-2 col-lg-2">Altura</label>
                    <div class="col-md-6 col-lg-5">
                        <input  class="form-control" type="text" id="altura"placeholder="Ingresar Altura">
                    </div>
                    <label class="control-label "> cm </label>
                </div>               

                <div class="form-group">
                    <div class=" col-md-2 col-md-offset-2">
                        <button  id="accion" class="btn btn-success">Calcular</button>
                    </div>
                </div>
                
                <div class="form-group">
                    <label>Resultado</label>
                    <input id="txtResultado" type="text">
	        </div>
                
                
                
            </form>

        </div>
        <script src="https://code.jquery.com/jquery-latest.js" charset="utf-8"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" charset="utf-8"></script>

    </body>
</html> 
