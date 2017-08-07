<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>...:: Listado de Empleados:::...</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">        
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        
        <div class="container">
            <h1>Hello World!</h1>            
            <div>
                <a class="btn btn-primary" href="addEmpleado.jsp"> Agregar Empleado </a>                
            </div>
            <br><br>
            <div>
                <table class="table table-striped " id="tablaEmpleado">                  
                    <c:forEach var="x" items="${sessionScope.listado}">                        
                        <tr>
                            <td>${x.id}</td>
                            <td>${x.nombre}</td>
                            <td>${x.apellido}</td>
                            <td>${x.departamento}</td>
                            <td><a href="s02?accion=CONSULTA&id=${x.id}"> <span class="glyphicon glyphicon-eye-open center-text" aria-hidden="true"></span></a></td>
                            <td><a href="s02?accion=EDITAR&id=${x.id}"> <span class="glyphicon glyphicon-pencil center-text " aria-hidden="true"></span></a></td>
                            <td><a href="s02?accion=ELIMINAR&id=${x.id}"> <span class="glyphicon glyphicon-trash center-text" aria-hidden="true"></span></a></td>
                        </tr>                        
                    </c:forEach>                    
                </table>
            </div>
            
        </div>
        
        
    </body>
</html>
