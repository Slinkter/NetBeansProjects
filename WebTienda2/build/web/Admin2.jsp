<%-- 
    Document   : Admin
    Created on : 26/06/2017, 12:49:37 PM
    Author     : Asus
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">  
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/estilos.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        
         <div class="container">
	    <h1>Listado de Cliente </h1>    	    	     
	 </div>  
  
        <div class="container">
            <a href="AdminAddCliente.jsp" class="btn btn-danger"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Crear Cliente </a>
            <a href="AdminAddPrespuesto.jsp" class="btn btn-danger"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Crear Presupuesto </a>  
            <br><br> 
        </div>  
        
        <div class="container">
            <div class="table-responsive">
                 <table class="table table-hover table-bordered table-condensed ">     
                     <tr>
                         <td>Id</td>
                         <td>Nombre</td>
                         <td>Apellido</td>
                         <td>Direccion</td>
                         <td>Correo</td>
                         <td>Telefono</td>
                         <td>Visita</td>
                         <td>Cuenta</td>
                         <td>Cuenta</td>
                         <td>Cuenta</td>

                     </tr>
                     
                     
                    <c:forEach var="x" items="${sessionScope.listado}">                        
                        <tr>
                            <td>${x.id_cliente}</td>
                            <td>${x.nombre}</td>
                            <td>${x.apellido}</td>                            
                            <td>${x.direccion}</td>
                            <td>${x.correo}</td>
                            <td>${x.telefono}</td>
                            <td>${x.estado}</td>                            
                            <td><a href="cliente?accion=CONSULTA&id=${x.id_cliente}"> <span class="col-md-push-4 glyphicon glyphicon-eye-open  " ></span></a></td>
                            <td><a href="cliente?accion=EDITAR&id=${x.id_cliente}"  > <span class="col-md-push-4 glyphicon glyphicon-pencil    " ></span></a></td>
                            <td><a href="cliente?accion=ELIMINAR&id=${x.id_cliente}"> <span class="col-md-push-4 glyphicon glyphicon-trash     " ></span></a></td>
                        </tr>                        
                    </c:forEach>     
            </table>
            </div>
        </div>

        <footer>
           

        </footer>
    </body>
</html>
