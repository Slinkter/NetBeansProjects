<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"  href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet"  href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">
        <link rel="stylesheet"  href="https://code.jquery.com/jquery-3.2.1.js">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Listado de Empleados (usando Request / Response)</h1>
            <br>
            <a href="addemployee.jsp" class="btn btn-danger">
              <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>  
                Agregar Empleado
            </a>
            <br><br>
            <table class="table table-striped" id="tablaEmpleados">
            <c:forEach var="x" items="${sessionScope.lista}">
                <tr>
                    <td>${x.id}</td>
                    <td>${x.firstName}</td>
                    <td>${x.lastName}</td>
                    <td><a href="s02?accion=CONSULTAR&id=${x.id}"><span class="glyphicon glyphicon-menu-hamburger" aria-hidden="true"></span></a></td>
                    <td><a href="s02?accion=EDITAR&id=${x.id}"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></a></td>
                    <td><a href="s02?accion=ELIMINA&id=${x.id}"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></a></td>
                </tr>
            </c:forEach>
            </table>
        </div>
        
        
    </body>
</html>
