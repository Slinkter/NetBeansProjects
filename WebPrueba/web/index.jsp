<%-- 
    Document   : index
    Created on : 2/02/2018, 12:54:31 PM
    Author     : Empleado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP//AJAX</title>  
        <script src="http://code.jquery.com/jquery-1.10.2.js" type="text/javascript"></script>
        <script src="js/app-ajax.js" type="text/javascript"></script>
        
    </head>
    <body>
        <form  >
            Enter Your Name : <input type="text" id="userName"  />
        </form>
        <br><br>
        <strong>
            Ajax Response
        </strong>
        <div id="ajaxGetUserServletResponse">
            
        </div>
    </body>
</html>
