<%-- 
    Document   : ClienteCatalogo
    Created on : 12/11/2015, 04:26:37 PM
    Author     : LuiS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body>
             
        <div class="container">
            <h1> Consumo </h1>
                     
                
            <table class="table table-striped" id="tablaEmpleados">
                <tr>
                    <td hidden=""> ID </td>
                    <td> Nombre </td>
                    <td> Numero de Suministro </td>
                    <td> Distrito  </td>
                    <td> Fecha </td>
                    <td> Consumo S/. </td>
                    
                   
                </tr>
                
            <c:forEach var="x" items="${sessionScope.listbook}">
                <tr>
                    <td>${x.id}</td>
                    <td>${x.titulo}</td>
                    <td>${x.estado}</td>
                    
                                        
                </tr>
            </c:forEach>
            </table>
        </div>
        
        
        
    </body>
</html>
