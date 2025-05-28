package com.mycompany.pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PessoaDAO {

    private Connection connection;

    public PessoaDAO() {
        this.connection = new CFcadastro().conectaDB();
    }
    public void CriarUsuario(Pessoa pessoa)throws SQLException{
        String sql = "INSERT INTO table tb_pessoas(nome,endereço,sexo,cpf)"
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

    private String pessoa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



