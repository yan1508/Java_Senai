package paodamanha;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactory {
       
    public Connection conectaDB(){
        Connection com = null;
        try {
            String url = "jdbc:mysql://locahost:3306/tb_padaria?useSS1=false";
            String user = "root";
            String password = "";
            
            com = DriverManager.getConnection(url, user, password);
            
        } catch (SQLException p) {
            System.out.println("Erro: "+p.getMessage());
        }
        return com;
    } 
}

