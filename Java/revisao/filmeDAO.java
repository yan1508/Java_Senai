package revisao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class filmeDAO{
    private Connection connection;

    public filmeDAO() {
        this.connection = new ConexaoFator().conectaDB();
    }
    public void CriarUsuario(filme revisao)throws SQLException{
        String sql = "INSERT INTO table tb_filmes(ano,titulo,genero)"
                + "values(?,?,?,?)";
        
        PreparedStatement pstmt;
            pstmt = null;
        try{
            pstmt = connection.prepareStatement(sql);
            
            pstmt.setInt(1,revisao.getAno());
            pstmt.setString(2,revisao.getTitulo());
            pstmt.setString(3,revisao.getGenero());
            
            pstmt.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("Erro: "+e.getMessage());
        }finally{
            if(pstmt!= null)pstmt.close();
        }
    }

    private String revisao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

