
package classesObjetoRelacional;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;

public class Saldo {
    private float saldo_corrente;
    private float saldo_poupanca;
    private String cartao;
    
    public Saldo (String cartao){
        this.cartao = cartao;
        
    }

    public float getSaldo_corrente() {
        return saldo_corrente;
    }

    public void setSaldo_corrente(float saldo_corrente) {
        this.saldo_corrente = saldo_corrente;
    }

    public float getSaldo_poupanca() {
        return saldo_poupanca;
    }

    public void setSaldo_poupanca(float saldo_poupanca) {
        this.saldo_poupanca = saldo_poupanca;
    }
    
    public float mostraSaldoCorrente(String cartao)
            throws SQLException, ServletException{
        
        Connection conn = null;
        try {
           conn = DriverManager.getConnection("jdbc:derby://localhost:1527/trabalho", 
                                               "gerente", "medacash");          
        } catch (Exception ex) {
            //alguma coisa aqui
        }
        
        
        PreparedStatement sql = conn.prepareStatement("select saldo_corrente from saldo sa, clientes cl where cl.id_cliente = sa.id_cliente and cartao = ? ");
        sql.setString(1, cartao);
        ResultSet resultado = sql.executeQuery();

        while(resultado.next()){
            this.saldo_corrente = resultado.getFloat("saldo_corrente");
        }
        
        sql.close();
        return this.saldo_corrente;
    }
    
}
