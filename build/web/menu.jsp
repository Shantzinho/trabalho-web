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
            <div class="row">
                <div class="col z-depth-2 m10 s10 l10 grey lighten-4 offset-l1 offset-m1 offset-s1" style="margin-top: 2%">
                    <div class="row">
                        <!--<div class="col s12 center" style="margin-top: 5%">
                            <h4 class="grey-text text-darken-5">Informe a senha.</h4>
                                <div class="row">
                                    <div class="input-field col s2 offset-s5">
                                        <input id="dig1" type="password" class="validate center" style="font-size: 50px">
                                    </div>
                                    <div class="input-field col s1">
                                      <input disabled id="dig2" type="password" class="validate center" style="font-size: 50px">
                                    </div>
                                    <div class="input-field col s1">
                                      <input disabled id="dig3" type="password" class="validate center" style="font-size: 50px">
                                    </div>
                                    <div class="input-field col s1">
                                      <input disabled id="dig4" type="password" class="validate center" style="font-size: 50px">
                                    </div>
                                </div>
                        </div>-->
                        <div class="row" style="margin-top: 10%">
                            <div class="col s6">
                                <a href="SaldoServlet" class="center teal darken-1 waves-effect waves-light btn-large s8" style="width: 100%">Saldo</a>
                            </div>
                            <div class="col s6">
                                <a class="center teal darken-1 waves-effect waves-light btn-large s8" style="width: 100%">Extrato</a>
                            </div>
                        </div>
                        <div class="row" style="margin-top: 5%">
                            <div class="col s6">
                                <a class="center teal darken-1 waves-effect waves-light btn-large s8" style="width: 100%">Dep&oacute;sito</a>
                            </div>
                            <div class="col s6">
                                <a class="center teal darken-1 waves-effect waves-light btn-large s8" style="width: 100%">Saque</a>
                            </div>
                        </div>
                        <div class="row" style="margin-top: 5%">
                            <div class="col s6">
                                <a class="center teal darken-1 waves-effect waves-light btn-large s8" style="width: 100%">Transfer&ecirc;ncia</a>
                            </div>
                            <div class="col s6">
                                <a class="center teal darken-1 waves-effect waves-light btn-large s8" style="width: 100%">Investimento</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>
    </body>
</html>
