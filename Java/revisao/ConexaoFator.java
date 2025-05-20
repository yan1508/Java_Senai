package revisao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoFator {
    public Connection conectaDB(){
        Connection com = null;
        try {
            String url = "jdbc:mysql://locahost:3306/db_filme?useSS1=false";
            String user = "brainroot";
            String password = "";
            
            com = DriverManager.getConnection(url, user, password);
            
        } catch (SQLException p) {
            System.out.println("Erro: "+p.getMessage());
        }
        return com;
    } 
}
