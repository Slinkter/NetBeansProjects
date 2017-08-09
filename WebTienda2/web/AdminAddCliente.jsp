<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"  href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
        <title>..::Crear Cliente::..</title>
    </head>
    <body>
               
        <div class="header">
            <div class="container">
                <h1>Crear Cliente -Formulario</h1>
            </div>
            
        </div>
        
        <div class="container">
            <br>
            <form action="cliente"   method="POST" class="form-horizontal">
                <input type="hidden" name="accion" value="AGREGAR">

                 <div class="form-group has-error">
                     <label for="nombre"  class="control-label col-md-2 col-lg-2">Nombre</label>
                     <div class="col-md-10 col-lg-10">
                         <input class="form-control " type="text" name="nombre" id="nombre" placeholder="Ingresar Nombre">
                     </div>
                </div> 
                <div class="form-group has-error">
                     <label for="nombre"  class="control-label col-md-2 col-lg-2">Apellido</label>
                     <div class="col-md-10 col-lg-10">
                         <input class="form-control " type="text" name="apellido" id="nombre" placeholder="Ingresar Apellido">
                     </div>
                </div>
                <div class="form-group has-error">
                     <label for="nombre"  class="control-label col-md-2 col-lg-2">Dirección</label>
                     <div class="col-md-10 col-lg-10">
                         <input class="form-control " type="text" name="direccion" id="nombre" placeholder="Ingresar Dirección">
                     </div>
                </div>
                <div class="form-group has-error">
                     <label for="nombre"  class="control-label col-md-2 col-lg-2">Districto</label>
                     <div class="col-md-10 col-lg-10">
                         <input class="form-control " type="text" name="districto" id="nombre" placeholder="Ingresar Districto">
                     </div>
                </div>
                <div class="form-group has-error">
                     <label for="nombre"  class="control-label col-md-2 col-lg-2">Telefono</label>
                     <div class="col-md-10 col-lg-10">
                         <input class="form-control " type="text" name="telefono" id="nombre" placeholder="Ingresar telefono">
                     </div>
                </div>

                <div class="form-group has-error">
                    <label for="correo" class="control-label col-md-2 col-lg-2">Correo</label>
                    <div class="col-md-10 col-lg-10">
                        <input id="correo" class="form-control" name="correo" type="text" placeholder="Ingresar correo">
                    </div>
                </div>
                <div class="form-group has-error">
                     <label for="nombre"  class="control-label col-md-2 col-lg-2">cuenta</label>
                     <div class="col-md-10 col-lg-10">
                         <input class="form-control " type="text" name="cuenta" id="nombre" placeholder="Ingresar cuenta">
                     </div>
                </div>
                <div class="form-group has-error">
                     <label for="nombre"  class="control-label col-md-2 col-lg-2">Estado</label>
                     <div class="col-md-10 col-lg-10">
                         <input class="form-control " type="text" name="estdo" id="nombre" placeholder="Ingresar estado">
                     </div>
                </div>
             
                <div class="form-group">
                    <div class=" col-md-2 col-md-offset-2">
                        
                        <input type="submit" value="Grabar" class="btn btn-default">
                        <input type="reset" value="Limpiar" class="btn btn-default">
                    </div>
                </div>

            </form>
        </div>
        
    </body>
</html>
