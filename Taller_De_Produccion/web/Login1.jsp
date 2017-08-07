<!doctype html>

<html>

    <head>
        <title>Sign In</title>
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
        <script type="text/javascript" src="https://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
        <style type="text/css">

            body {
                padding-top: 40px;
                padding-bottom: 40px;
                background-color: #eee;
            }
            .form-signin {
                max-width: 330px;
                padding: 15px;
                margin: 0 auto;
            }
            .form-signin .form-signin-heading, .form-signin .checkbox {
                margin-bottom: 10px;
                color:#eee;
                padding: 15px;
            }
            .form-signin .checkbox {
                font-weight: normal;
            }
            .form-signin .form-control {
                position: relative;
                font-size: 16px;
                height: auto;
                padding: 10px;
                -webkit-box-sizing: border-box;
                -moz-box-sizing: border-box;
                box-sizing: border-box;
            }
            .form-signin .form-control:focus {
                z-index: 2;
            }
            .form-signin input[type="text"] {
                margin-bottom: -1px;
                border-bottom-left-radius: 0;
                border-bottom-right-radius: 0;
            }
            .form-signin input[type="password"] {
                margin-bottom: 10px;
                border-top-left-radius: 0;
                border-top-right-radius: 0;
            }
        </style>
    </head>

    <body background="imagenes/11458_1440x900[1].jpg"  >

        <div  class="container">
            <form action="LoginServlet" method="POST" class="form-signin">
                <h2 class="form-signin" >INGRESE CUENTA</h2>
                <input type="text" name="usuario" class="form-control" placeholder="Usuario">
                <input type="password" name="clave" class="form-control" placeholder="Password">
                <label class="checkbox">
                    <input type="checkbox" value="remember-me">Recordarme</label>
                
                <!--input class="btn btn-lg btn-primary btn-block" type="button" value="Ingresar" onclick="location.href = 'listaClientes.jsp'"-->
                 <a href="ListarClientes">Ingresar</a>
                <% String mensaje = "";
                    if (request.getSession().getAttribute("Error") != null) {
                        mensaje = request.getSession().getAttribute("Error").toString();
                    }%> <%= mensaje%>

                <% request.getSession().removeAttribute("Error");%>
                <input type="button" value="Nuevo Usuario" onclick="location.href = 'registroo.jsp'">
                
            </form>
        </div>
        <!-- /container -->
    </body>

</html>