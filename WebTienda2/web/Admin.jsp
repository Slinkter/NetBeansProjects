<%-- 
    Document   : admin
    Created on : 26/06/2017, 03:38:42 PM
    Author     : Asus
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
        <h1>Bienvenido <%= request.getAttribute("usuario")%> a  Gestion de  Clientes</h1>
        
        <div class="container">
            <a href="login2" class="btn btn-primary">Listado</a>
        </div>
        
        
    </body>
</html>
