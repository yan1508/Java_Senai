package cadastroswing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {

    public PessoaDAO() {
    }
     private Connection connection;

    public PessoaDAO(Connection connection) {
        this.connection = new CFCadastro().conectaDB();
    }
    public void CriarUsuario(Pessoa pessoa)throws SQLException{
        String sql = "INSERT INTO table pessoa(nome,endereco,sexo,cpf)"
                + "values(?,?,?,?)";
        
        PreparedStatement pstmt;
            pstmt = null;
        try{
            pstmt = connection.prepareStatement(sql);
            
            pstmt.setString(1,pessoa.getNome());
            pstmt.setString(2,pessoa.getEndereco());
            pstmt.setString(3,pessoa.getSexo());
            pstmt.setString(3,pessoa.getCpf());
        
            
            pstmt.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Erro: "+e.getMessage());
        }finally{
            if(pstmt!= null)pstmt.close();
        }
    }
}
