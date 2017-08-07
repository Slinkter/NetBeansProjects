<%-- 
    Document   : notificacion
    Created on : 19-may-2015, 10:57:23
    Author     : cynthia_
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrarse al Sistema</title>
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
        <link type="text/css" rel="stylesheet" href="css/bootstrap-theme.css">
        <link type="text/css" rel="stylesheet" href="css/bootstrap.css">
        <link type="text/css" rel="stylesheet" href="css/estilo.css">
        <script type="text/javascript" src="js/bootstrap.min.js" ></script>
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
    </head>
    <body  background="imagenes/wallpaper-naturaleza-1366x768-4199-27324552[1].jpg">
        <header>
            <nav>
                <a class="a espacio-derecha1 re "> </a>   

                <img class="a espacio-derecha re" src="imagenes/logo2.png" alt=""/>


                <a class="a espacio-derecha re "> Correo de Bienvenida</a>           


                

              

            </nav>



        </header>
        
         <HR width=100% align="left">
        <p>
        
         <p> <h1 class="titulo">Estimado:</h1> <p> Luis Cueva ${sessionScope.emp.nombres} </p>
         
         <p> <h1 class="titulo">Usuario</h1> <label> lcueva ${sessionScope.emp.correo} </label>
         <h1 class="titulo">Contraseña</h1><label>lcueva</label>
         <a href="Ir al Login"></a>
         <HR width=100% align="left">
         </p>
        
    <%-- start web service invocation --%><hr/>
    <%
    try {
	ws.eniar.correo.WSENVIARCORREP_Service service = new ws.eniar.correo.WSENVIARCORREP_Service();
	ws.eniar.correo.WSENVIARCORREP port = service.getWSENVIARCORREPPort();
	// TODO process result here
	java.lang.String result = port.imprimirfechahora();
	out.println(result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    
</body>
</html>
