<%@page import="factories.DAOFactory"%>
<%@page import="java.util.List"%>
<%@page import="model.PruebaSelect"%>
<%@page import="model.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">S
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <title>BookNote</title>
    </head>
    <%
        Usuario u = (Usuario) request.getSession().getAttribute("usuario");

        if (u == null) {
            request.getSession().setAttribute("error", new Error("Debe Ingresar sus Credenciales"));
            request.getRequestDispatcher("inicio.jsp").forward(request, response);
        }


    %>

    <style>
        .navbar-nav.navbar-center {
            position: absolute;
            left: 50%;
            transform: translatex(-50%);
        }

        .navbar-header{
            padding-top: 7px; 
            padding-left: 10px
        }

        .navbar-custome{
            background: #48BD48;
            font-weight: bolder;
            color: white;

        }

        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }


    </style>

    <body>
        <nav class="navbar navbar-default navbar-fixed-top navbar-custome" role="navigation">

            <div class="navbar-header">
                <a href="#" class="navbar-left">
                    <!-- <span><img width=80px height=35px src=""></span> LOGO--> 
                </a>
            </div>
            <p class="navbar-text pull-left">BookNote</p>

            <ul class="nav navbar-nav navbar-center">

                <li>
                    <a href="alumnoNota.jsp">Ver Notas</a>

                </li>

                <li>
                    <a href="alumnoMensaje.jsp">Avisos del Profesor</a>
                </li>

                <li>
                    <a href="alumnoAsignatura.jsp">Registrar Asignatura</a>
                </li>
                
                <li>
                    <a href="alumnoContrasenia.jsp">Cambiar Contraseña</a>
                </li>
                
            </ul>

            <ul class="nav navbar-nav navbar-right" style="padding-right: 10px">
                <li>
                    <form class="navbar-form pull-right" action="cerrarSesionServlet.do">
                        <button type="submit" class="btn btn-danger">Cerrar sesión</button>
                    </form>
                </li>
            </ul>
        </nav>

        <br><br><br>
        <br><br><br>

        <div class="container">
            <div class="jumbotron" style="border-radius: 10px 10px 10px 10px">
                <center><h1>Notas</h1></center>
                <div class="row justify-content-xl-center">
                    <div class="col-md-6 col-md-offset-3">

                        <table>
                            <tr>
                                <th>Asignatura</th>
                                <th>Notas</th>
                            </tr>
                            <%
                            List<PruebaSelect> notaAlumno = DAOFactory.getInstance().getPruebaSelectDAO(DAOFactory.Motor.MY_SQL).getNotasAlumno(u.getId());
                            for(PruebaSelect ps : notaAlumno){
                                out.print("<tr>");
                                out.print("<td>"+ ps.getId_asignatura()+"</td>");
                                out.print("<td>"+ ps.getNota()+"</td>");
                                out.print("</tr>");
                            }
                            %>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
