<%-- 
    Document   : Cliente
    Created on : 12/11/2015, 04:17:21 PM
    Author     : LuiS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido <%= request.getAttribute("nombreCliente")%></h1>
               click    <a href="CatalogoCliente?id_cliente=<%= request.getAttribute("id_cliente") %>"> aqui </a> para ver consumos .     
        
        
    </body>
</html>
