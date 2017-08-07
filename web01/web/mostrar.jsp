<%-- 
    Document   : mostrar
    Created on : 13/06/2017, 03:35:00 PM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>Informacion</title>
        
    </head>
    <body>
        <div class="container" >
            <h1>Informacion Empleado</h1>
            <p>ID : ${sessionScope.emp.id}</p>
            <p>Nombre : ${sessionScope.emp.nombre}</p>
            <p>Apellido : ${sessionScope.emp.apellido}</p>
            <p>Departamento : ${sessionScope.emp.departamento}</p>
            <p>foto : <img src = "pics/${sessionScope.emp.foto}"</p>
            
        </div>
        
        
        
        
    </body>
</html>
