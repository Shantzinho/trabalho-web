<%-- 
    Document   : index
    Created on : May 17, 2015, 6:04:15 PM
    Author     : Arenari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    </head>
    <body>
        
            <div class="row">
                <div class="col offset-l4 l4 offset-m3 m6 s10 offset-s1">
                    <div class="card center-align" style="margin-top: 30%">
                    <div class="card-content">
                        <div>
                            <span class="card-title black-text lighten-2">Login</span>
                        </div>
                        <div class="input-field col" style="margin-top: 60px">
                          <input id="num_cartao" type="text" class="validate">
                          <label for="last_name">Nº do Cartão</label>
                        </div>
                        <div class="input-field col s12">
                          <input id="password" type="password" class="validate">
                          <label for="password">Password</label>
                        </div>
                    </div>
                    <div class="card-action row">
                        <div class="col s6">
                            <a href="#">Criar nova conta</a>
                        </div>
                        <div class="col s6">
                            <a href='#'>Esqueci a senha</a>
                        </div>  
                    </div>
                  </div>
                </div>
            </div>
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
    </body>
</html>
