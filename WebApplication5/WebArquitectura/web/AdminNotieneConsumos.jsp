<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <jsp:useBean id="errorSuministro" class="java.lang.String" scope="session"  ></jsp:useBean>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    
    <h1>Estimado Administrador</h1>
    
    <p> El cliente no tiene consumo <p>
    
    
     <%=errorSuministro %>
    
    
</body>
</html>