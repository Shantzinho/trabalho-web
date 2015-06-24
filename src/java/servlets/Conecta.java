package servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Arenari
 */
public class Conecta extends HttpServlet {
//posso colocar a conexão em um único servlet intermediário e fazer heranças!
    Connection conn = null;
    
    @Override
    public void init() throws ServletException {
        try {
           conn = DriverManager.getConnection("jdbc:derby://localhost:1527/trabalho", 
                                               "gerente", "medacash");          
        } catch (Exception ex) {
            //alguma coisa aqui
        }
    } 
    
    public boolean verificaLogin(String cartao, String senha) 
            throws SQLException{
        
        try (PreparedStatement sql = conn.prepareStatement("select * from Clientes where senha = ? and cartao = ? ")) {
            sql.setString(1, senha);
            sql.setString(2, cartao);
            ResultSet resultado = sql.executeQuery();
            
            if(resultado.next()){
                sql.close();
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void destroy() {
        try {
           conn.close();
        } catch (Exception ex) {
           //alguma coisa aqui
        }
    }
}
