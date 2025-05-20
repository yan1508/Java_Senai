package paodamanha;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PadariaDAO {

    public PadariaDAO() {
    }
     private Connection connection;

    public PadariaDAO(Connection connection) {
        this.connection = new ConectionFactory().conectaDB();
    }
    public void CriarUsuario(Padaria padaria)throws SQLException{
        String sql = "INSERT INTO table padaria(nome,email,telefone,tipo)"
                + "values(?,?,?)";
        
        PreparedStatement pstmt;
            pstmt = null;
        try{
            pstmt = connection.prepareStatement(sql);
            
            pstmt.setString(1,padaria.getNome());
            pstmt.setString(2,padaria.getEmail());
            pstmt.setString(3,padaria.getTelefone());
        
            
            pstmt.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Erro: "+e.getMessage());
        }finally{
            if(pstmt!= null)pstmt.close();
        }
    }
}
