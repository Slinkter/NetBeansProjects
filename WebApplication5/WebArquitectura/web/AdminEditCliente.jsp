<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Editar Cliente</h1>
        
        <form action="modificarCli2" method="POST">
            <input type="hidden" name="accion" value="UPDATE">
            
            <p >      <input type="hidden" name="id_cliente" value="${sessionScope.eCliente.id_cliente} "></p>
            <p>nombre : <input type="text" name="name" value="${sessionScope.eCliente.name}">  </p>
            <p>password: <input type="text" name="password" value="${sessionScope.eCliente.password} "> </p>
            <p>estado : <input type="text" name="estado" value="${sessionScope.eCliente.estado} "> </p>
            
            
                <input type="submit" value="ACTUALIZAR">
                <input type="reset" value="LIMPIAR">
     
        </form>
</body>
</html>