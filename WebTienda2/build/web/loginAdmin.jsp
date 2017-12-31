<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Arquitectura de Software - Administrador </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet"  href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet"  href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js">        
        <link rel="stylesheet"  href="https://code.jquery.com/jquery-3.2.1.js">
        <link rel="stylesheet" href="css/animate.css">
        <link href="css/Login.css" rel="stylesheet" type="text/css"/>
    </head>
    <body> 
        <div class="container" style="margin-top:80px">
            <br><br><br><br>
          <div class="row">
			<div class="col-sm-6 col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading text-center">
						<strong>  Administrador </strong>
					</div>
					<div class="panel-body">
						<form role="form" action="Login" method="POST" >
							<fieldset>
								<div class="row  ">
									<div class=" col-lg-4 col-md-4">										
                                                                                <img class="img-circle" src="imagenes/99.png" alt="" />
									</div>
								</div>
								<div class="row">
									<div class="col-sm-12 col-md-10  col-md-offset-1 ">
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon">
													<i class="glyphicon glyphicon-user"></i>
												</span> 
												<input class="form-control" placeholder="usuario" name="usuario" type="text" autofocus>
											</div>
										</div>
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon">
													<i class="glyphicon glyphicon-lock"></i>
												</span>
                                                                                            <input class="form-control" placeholder="contraseña" name="password" type="password" >
											</div>
										</div>
										<div class="form-group">
											<input type="hidden" value="ADMIN" name="tipo_usuario">
										</div>
										<input type="submit" class="btn btn-lg btn-primary btn-block" value="Ingresar">
                                                                                <br><br><br><br><br><br><br><br>
									</div>
										<%if(request.getAttribute("error")!=null){%>
                                                                                <div>Credenciales invalidas, ingresar nuevamente!</div>
                                                                                <%}%>
								</div>
							</fieldset>
						</form>
					</div>
					
               </div>
	     </div>
           </div>
	</div>
    </body>
</html>
