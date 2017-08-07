
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List,java.util.HashMap, 
java.util.ArrayList, java.sql.Date, java.util.Iterator,
 java.util.Map, ulima.auxiliar.Cliente"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">      
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
		<link href="css/estilo.css" rel="stylesheet" type="text/css"/>
        <link type="text/css" rel="stylesheet" href="css/bootstrap-theme.css">
        <link type="text/css" rel="stylesheet" href="css/bootstrap.css">
        <link type="text/css" rel="stylesheet" href="css/estilo.css">
        <script type="text/javascript" src="js/bootstrap.min.js" ></script>
        <link href="css/main.css" rel="stylesheet" type="text/css"/>

        <title>JSP Page</title>
    </head>

    <body>    
	        <div class="container">
	    	     <h1>Listado de Cliente </h1>    	    	     
	    	</div>  
  
  <div class="container">
          <a href="AdminAddCliente.jsp" class="btn btn-danger"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Crear Cliente </a>
          <a href="AdminAddSumnitro.jsp" class="btn btn-danger"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Crear Suministro </a>  
	       <br>
	       <br> 
	       	<div class="container">
	       	  <form action="CargaData   method="GET">                    
	          							<button  class="btn btn-danger" style="float:right; width: 20%; display: inline-block;">Desencolar </button>          
	                                   <% if(request.getAttribute("encolar")!=null){%>
									    <div>Se cargado a la Base de datos </div>
									   <% }else if (request.getAttribute("error")!=null){%>
										   <div>error no se ha cargado la base de datos </div>											
										<% }%>
			
	          </form>
	          
	       
	       	</div>
	      <br><br> 
	       
	       
  </div>     
             
	          
	     <div class="container">
	     
	     
            <table class="table table-striped center-text" id="tablaEmpleados" style="width: 500%; float:center">
                <tr>                                      
                    <td>ID Cliente </td>
                    <td>Nombre </td>                 
                    <td>Estado</td> 
                    <td>Editar</td> 
                    <td>Cambiar</td>
                    <td>Suministro</td> 
                </tr> 
            
             <c:forEach var="x1" items="${sessionScope.listaCliente}">
                <tr>        
                	
                	  <td>${x1.id_cliente}</td> 
                      <td>${x1.name}</td> 
                      <td>${x1.estado}</td>                    				   
                   	  <td> <a href="modificarCli?accion=EDITAR&id_cliente=${x1.id_cliente}">  <span class="glyphicon glyphicon-pencil center" aria-hidden="true"></span></a></td>                                      
                      <td> <a href="CambiodeEstado?accion=CAmbiarEstado&id_cliente=${x1.id_cliente}"> <span class="glyphicon glyphicon-repeat center" aria-hidden="true"></span></a></td>
                      <td> <a href="BaseDatosListaSuministro?id_cliente=${x1.id_cliente}" > <span class=" glyphicon glyphicon-menu-hamburger center" aria-hidden="true"></span></a></td> 
                     	           								    
								    <% if (request.getAttribute("errorSuministro")!=null){%>
									   <div>no tiene suminstro asignado! </div>											
									<% }%>			   
                    				                                                
                </tr>
            </c:forEach>
  
            </table>
	     
	     
	     </div>         
          

        
    </body>
</html>
