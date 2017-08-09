<%-- 
    Document   : mostratCliente
    Created on : 01/07/2017, 11:51:59 AM
    Author     : Asus
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> 
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h1>Mostrar Cliente </h1>
            </div>
            <div>
                <p>ID : ${sessionScope.c3.id_cliente}</p>
                <p>Nombre: ${sessionScope.c3.nombre}</p>
                <p>Apellido : ${sessionScope.c3.apellido}</p>
                <p>Telefono : ${sessionScope.c3.telefono}</p>
                <p>Direccion : ${sessionScope.c3.direccion}</p>
                <p>Distrito : ${sessionScope.c3.distrito}</p>
                <p>Estado : ${sessionScope.c3.estado}</p>
            </div>           
        </div>
        
        
        
    </body>
</html>
