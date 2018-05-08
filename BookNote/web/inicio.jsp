<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">S
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

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
            <!-- El logotipo y el icono que despliega el menú se agrupan
                 para mostrarlos mejor en los dispositivos móviles -->
            <div class="navbar-header">
                <a href="#" class="navbar-left">
                   <!-- <span><img width=80px height=35px src=""></span> LOGO--> 
                </a>
            </div>
            <p class="navbar-text pull-left navbar-custome">BookNote</p>
        </nav>
        
        <br><br><br>
        <br><br><br>
        
        <div class="container">
            <div class="jumbotron" style="border-radius: 10px 10px 10px 10px">
                <center><h1>Iniciar Sesion</h1></center>
                <div class="row justify-content-xl-center">
                    <div class="col-md-6 col-md-offset-3">
                        <form action="sesionDocente.jsp" method="post">

                            <div class="form-group"> 
                                Usuario:
                                <input name="txtUsuario" type="text" class="form-control" maxlength="8"  id="txtUsuario" placeholder="Usuario:" required="required">
                                
                            </div>  

                            <div class="form-group">
                                Contrasena:
                                <input name="txtContraeña" type="password" class="form-control" id="inputNombre" placeholder="Contraseña: " required="required">
                            </div>
                            
                            <div class="form-group">
                                Perfil: <br>
                                <select class="form-control">
                                    <option value="docente">Docente</option>
                                    <option value="alumno">Alumno</option>
                                    <option value="padre">Padre</option>
                                    <option value="admin">Admin</option>
                                </select>
                            </div>
                            
                            
                            <center>
                                <button  class="btn btn-primary navbar-custome" type="submit" value="Registrar Usuario" name="registrar">
                                    Iniciar Sesion
                                </button>
                            </center>

                        </form>
                    </div>
                </div>
            </div>
        </div>
        
    </body>
</html>
