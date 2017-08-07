<%-- 
    Document   : Admin
    Created on : 12/11/2015, 04:16:59 PM
    Author     : LuiS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"  href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido <%= request.getAttribute("nombreAdmin")%> a  Gestion de  Clientes</h1>
   
        <h2>Actividades</h2>
      
          <div>
          <p> Crear Cliente / Crear Suminsitro  </p>
          <form action="BaseDatosListaCliente"  ">
         
								<div class="col-xs-6 col-md-3">
                                            <div class="form-group">                               
                                                <button type="submit" class="boton btn btn-primary">ir</button>
                                              
                                             </div>
                                 </div>
         
         </form>
          
          </div>
            
            
         

         
        
        
        
    </body>
</html>
