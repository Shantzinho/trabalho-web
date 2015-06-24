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
        <title>O Banco do Futuro</title>
        <link type="text/css" rel="stylesheet" href="css/style.css">
        <link type="text/css" rel="stylesheet" href="css/materialize.css"  media="screen,projection">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
        <style>
            body{
                background-image: url(images/index_background.jpg);
            }
        </style>
    </head>
    <body style="background-color: #0059bc">
        <div class="container">
            <div class="fixed-action-btn" style="bottom: 45px; right: 24px;">
                <a class="btn-floating btn-large grey" title="Operações Sem Cartão" href="operacoes_sem_cartao.jsp">
                  <i class="large mdi-action-dns"></i>
                </a>
                <ul>
                    <li><a class="btn-floating teal accent-2" title="Consultas"><i class="large mdi-action-account-balance"></i></a></li>
                  <li><a class="btn-floating teal accent-3" title="Pagamentos"><i class="large mdi-action-payment"></i></a></li>
                  <li><a class="btn-floating teal accent-4" title="Depósitos"><i class="large mdi-editor-attach-money"></i></a></li>
                </ul>
            </div>
            <div class="row">
                <div class="col z-depth-2 m8 s10 l6 grey lighten-4 offset-l3 offset-m2 offset-s1" style="margin-top: 10%">
                    <div class="row">
                        <form method="post" action="ValidaLogin">
                            <div class="input-field col s8 offset-s2 center" style="margin-top: 10%">
                                <input id="num_cartao" name="num_cartao" type="text" class="validate">
                                <label for="num_cartao">Nº Cart&atilde;o</label>
                                <div class="input-field col s4 offset-s4">
                                        <input id="num_senha" name="num_senha"  type="password" maxlength="5" class="validate" style="font-size: 50px">
                                        <label for="num_senha">Senha</label>
                                </div>
                                <button class="btn waves-effect waves-light" type="submit" name="acessar">Acessar
                                    <i class="mdi-content-send right"></i>
                                </button>
                            </div>
                        </form>
                        <div class="col s12 center" style="margin-top: 15%">
                            <a class="center teal darken-2 waves-effect waves-light btn-large s8" style="width: 100%;" href="operacoes_sem_cartao.jsp">Operações sem Cartão</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
    </body>
</html>
