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
                <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Notas<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="docenteNota.jsp">Ingresar Nota</a></li>
                        <li><a href="docenteMod.jsp">Modificar Nota</a></li>
                    </ul>
               
                <li>
                    <a href="docenteAsistencia.jsp">Asistencia</a>
                </li>

                <li>
                    <a href="docenteMensaje.jsp">Mensajes</a>
                </li>
            </ul>
           
            <ul class="nav navbar-nav navbar-right" style="padding-right: 10px">
                <li>
                    <form class="navbar-form pull-right" action="">
                        <button type="submit" class="btn btn-danger">Cerrar sesión</button>
                    </form>
                </li>
            </ul>
        </nav>
        
        <br><br><br>
        <br><br><br>
        
        <div class="container">
            <div class="jumbotron" style="border-radius: 10px 10px 10px 10px">
                <center><h1>Bienvenido</h1></center>
                <div class="row justify-content-xl-center">
                    <div class="col-md-6 col-md-offset-3">
                        <center><h1>Docente</h1></center>
                    </div>
                </div>
            </div>
        </div>
        
        
    </body>
        
  
</html>
