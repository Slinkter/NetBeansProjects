<%-- 
    Document   : AdminAddPresupuesto2
    Created on : Dec 25, 2017, 3:56:28 PM
    Author     : Tukamon
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"  href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet"  href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">
        <link rel="stylesheet"  href="https://code.jquery.com/jquery-3.2.1.js">
        <link rel="stylesheet" href="css/animate.css">
        <link rel="stylesheet" href="css/main.css">
        <title>JSP Page</title>
    </head>
    <body>
       
        
        
      
    
         <div class="container">
             <h1>Presupuesto </h1>
             
             
            <div class="table-responsive">
                 <table class="table table-hover table-bordered table-condensed table-striped ">     
                     <tr>
                            <td>Descripcion</td>
                            <td>ancho</td>                            
                            <td>altura</td>
                            <td>Precio</td>                            
                     </tr>
                     
                     
                    <c:forEach var="x" items="${sessionScope.listado}">                        
                        <tr>
                            <tr>
                            <td>${x.nomProducto}</td>                            
                            <td>${x.ancho}</td>                            
                            <td>${x.altura}</td>
                            <td>${x.resultado}</td>   
                        </tr>  
                        </tr>                        
                    </c:forEach>     
            </table>
            </div>
           </div>
                
                
                
      
    </body>
</html>
