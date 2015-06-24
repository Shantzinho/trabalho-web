//  Query1.java:  Query an mSQL database using JDBC. 
package classesObjetoRelacional;
import java.sql.*;

/**
 * A JDBC SELECT (JDBC query) example program.
 */
class teste {
 
    public static void main (String[] args) {
        try {
            String url = "jdbc:derby://localhost:1527/banco";
            Connection conn = DriverManager.getConnection(url,"gerente","medacash");
            Statement stmt = conn.createStatement();
            ResultSet rs;
 
            rs = stmt.executeQuery("SELECT * FROM Clientes");
            while ( rs.next() ) {
                String lastName = rs.getString("nome");
                System.out.println(lastName);
                String cartao = rs.getString("cartao");
                System.out.println(cartao);
            }
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}