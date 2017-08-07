<%-- 
    Document   : listaEncuestas
    Created on : 19-may-2015, 10:57:41
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
    <body>
        <header>
            <nav>
                <a class="a espacio-derecha1 re "> </a>   

                <img class="a espacio-derecha re" src="imagenes/logo2.png" alt=""/>


                <a class="a espacio-derecha re " href="Login.jsp" > Clientes</a>           


                <a class="a espacio-derecha re " href="Login1.jsp"> Personal</a>

                <a class="a espacio-derecha re " href="listaEncuestas.jsp"> Encuentas </a>

            </nav>



        </header>

        <HR width=100% align="left"> 

        <div class="container">
            <div>
                <h1 class="titulo" display: inline-block>Clientes</h1>
                <p>


                </p>
            </div>

            <div id="table" style="width: 60%; float:left">
                <table class="table table-striped">

                    <tr style="color:#269abc; background-color: ">
                        <th>
                            Nombre
                        </th>
                        <th>
                            Usuario
                        </th>
                        <th>
                            Habilitado
                        </th>

                        <th>
                            Operaciones
                        </th>
                    </tr>

                    <tr>
                        <c:forEach var="cliente" items="${clientes}">
                            <td>
                                ${cliente.nombres}

                            </td>
                            <td>
                                ${cliente.correo}

                            </td>

                            <td>
                                ${cliente.habilitado}

                            </td>
                            <td>
                                <a class="btn btn-primary btn-xs active" href="VerServlet?codPartido=${partido.id}">Habilitar</a>
                                <a class="btn btn-primary btn-xs active" href="VerServlet?codPartido=${partido.id}">Ver</a>
                                <a class="btn btn-danger btn-xs active" href="EditarServlet?codPartido=${partido.id}">Editar</a>
                                <a class="btn btn-danger btn-xs active" href="EliminarServlet?codPartido=${partido.id}">Eliminar</a>
                            </td>
                        </c:forEach>

                    </tr>   


                </table>
            </div>

        </div>
    </body>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>


    <form action="#" method="post" >

        <input class="boton1" type="submit" value="Nuevo Cliente" >
    </form>


    <br>
    <br>
    <br>

    <footer>     

        <div class="a re asd" >
            <a class="a espacio-derecha1 re  "> </a>   
            <img class="imgulima" src="imagenes/logo_footer.png" alt=""/>
        </div>
        <div class="asd">
            <a class="a espacio-derecha1 re "> </a> 
            <strong> Ingeniera de Sistemas </strong>
            <br>
            <a class="a espacio-derecha1 re "> </a> 
            <strong>  Programacion Internet</strong>
            <br>
            <a class="a espacio-derecha1 re "> </a> 
            <strong>  Universidad de lima ,2015</strong> 
            <br>
            <a class="a espacio-derecha1 re "> </a> 
            <strong>  GRUPO XYZ</strong>
        </div>

    </footer>

</html>
