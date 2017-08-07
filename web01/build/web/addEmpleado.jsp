
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <title>Nuevo Empleado</title>
    </head>
    <body>        
        <div class="container">
            <h1>Agregar Empleado</h1>
            <form action="s02" method="POST">
                <input type="hidden" name="accion" value="AGREGAR"><!-- Para mandar al S02-->
                <p>Nombre        <input type="text" name="nombre"/></p>
                <p>Apellido      <input type="text" name="apellido"/></p>
                <p>Departamento  <input type="text" name="departamento"/></p>
                <p>foto          <input type="text" name="foto"/></p>   
                <input type="submit" value="Grabar" class="btn btn-default">
                <input type="reset" value="Limpiar" class="btn btn-default">
            </form>            
        </div>
        
        
        
    </body>
</html>
