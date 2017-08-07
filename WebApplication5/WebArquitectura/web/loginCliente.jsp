<%-- 
    Document   : loginCliente
    Created on : 12/11/2015, 04:03:49 PM
    Author     : LuiS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Arquitectura de Software - Cliente </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet"  href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">s
        <link href="css/index.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
                        
                
            <div class="container" style="margin-top:40px">
		<div class="row">
			<div class="col-sm-6 col-md-4 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<strong> Luz del Norte - Cliente  </strong>
					</div>
					<div class="panel-body">
						<form role="form" action="LoginCliente" method="GET">
							<fieldset>
								<div class="row">
									<div class="center-block">
										<img class="profile-img"
											src="ing/la-imagen-del-usuario-con-el-fondo-negro_318-34564.png" alt="">
                                                                                
									</div>
								</div>
								<div class="row">
									<div class="col-sm-12 col-md-10  col-md-offset-1 ">
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon">
													<i class="glyphicon glyphicon-user"></i>
												</span> 
												<input class="form-control" placeholder="id_cliente" name="id_cliente" type="text" autofocus>
											</div>
										</div>
										<div class="form-group">
											<div class="input-group">
												<span class="input-group-addon">
													<i class="glyphicon glyphicon-lock"></i>
												</span>
												<input class="form-control" placeholder="clave" name="password" type="password" >
											</div>
										</div>
										<div class="form-group">
											<input type="hidden" value="CLIENTE" name="tipo_usuario">
										</div>
											<input type="submit" class="btn btn-lg btn-primary btn-block" value="Ingresar">
									
									</div>
									
																	<%
										
										if(request.getAttribute("error")!=null){
											%><div>Credenciales invalidas, ingresar nuevamente!</div><%
										
										}
										
										
										%>
								</div>
							</fieldset>
						</form>
					</div>
					<div class="panel-footer ">
					No tengo cuenta	click <a href="#" onClick="">Aqui </a>
					</div>
                </div>
			</div>
		</div>
	</div>
    </body>
</html>
