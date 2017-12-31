<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">

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

                 <div class="form-group ">
                     <label for="nombre"  class="control-label col-md-2 col-lg-2">Nombre</label>
                     <div class="col-md-10  col-lg-10 inputGroupContainer input-group">

                         <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                         <input class="form-control " type="text" name="nombre" id="nombre" placeholder="Ingresar Nombre">
                     </div>
                </div>

                <div class="form-group ">
                     <label for="nombre"  class="control-label col-md-2 col-lg-2">Apellido</label>
                     <div class="col-md-10  col-lg-10 inputGroupContainer input-group">
                       <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                         <input class="form-control " type="text" name="apellido" id="nombre" placeholder="Ingresar Apellido">
                     </div>
                </div>

                <div class="form-group ">
                     <label for="nombre"  class="control-label col-md-2 col-lg-2">Dirección</label>
                     <div class="col-md-10  col-lg-10 inputGroupContainer input-group">
                       <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                         <input class="form-control " type="text" name="direccion" id="nombre" placeholder="Ingresar Dirección">
                     </div>
                </div>
                <div class="form-group ">
                     <label for="nombre"  class="control-label col-md-2 col-lg-2">Districto</label>
                     <div class="col-md-10  col-lg-10 inputGroupContainer input-group">
                       <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                         <input class="form-control " type="text" name="districto" id="nombre" placeholder="Ingresar Districto">
                     </div>
                </div>
                <div class="form-group ">
                     <label for="nombre"  class="control-label col-md-2 col-lg-2">Telefono</label>
                     <div class="col-md-10  col-lg-10 inputGroupContainer input-group">
                       <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
                         <input class="form-control " type="text" name="telefono" id="nombre" placeholder="Ingresar telefono">
                     </div>
                </div>

                <div class="form-group ">
                    <label for="correo" class="control-label col-md-2 col-lg-2">Correo</label>
                    <div class="col-md-10  col-lg-10 inputGroupContainer input-group">
                      <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                        <input id="correo" class="form-control" name="correo" type="text" placeholder="Ingresar correo">
                    </div>
                </div>
                <div class="form-group ">
                     <label for="nombre"  class="control-label col-md-2 col-lg-2">cuenta</label>
                     <div class="col-md-10  col-lg-10 inputGroupContainer input-group">
                       <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                         <input class="form-control " type="text" name="cuenta" id="nombre" placeholder="Ingresar cuenta">
                     </div>
                </div>
                <div class="form-group ">
                     <label for="nombre"  class="control-label col-md-2 col-lg-2">Estado</label>
                     <div class="col-md-10  col-lg-10 inputGroupContainer input-group">
                       <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                         <input class="form-control " type="text" name="estdo" id="nombre" placeholder="Ingresar estado">
                     </div>
                </div>

                <div class="form-group">
                    <div class=" col-xs-2  col-md-2  col-lg-2 col-md-offset-2">
                        <input type="submit" value="Grabar" class="btn btn-outline-primary ">
                        <input type="reset"  value="Limpiar" class="btn btn-secondary ">
                    </div>
                </div>

            </form>
        </div>

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
    </body>
</html>
