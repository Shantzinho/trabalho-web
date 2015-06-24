package classesObjetoRelacional;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletException;

/**
 *
 * @author Arenari
 */
public class Conecta {
    Connection conn = null;

    public void init() throws ServletException {
        try {
           conn = DriverManager.getConnection("jdbc:derby://localhost:1527/banco", 
                                               "gerente", "medacash");
        } catch (Exception ex) {
            //alguma coisa aqui
        }
    } 

    public void destroy() {
        try {
           conn.close();
        } catch (Exception ex) {
           //alguma coisa aqui
        }
    }
}
