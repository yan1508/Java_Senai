package com.mycompany.pessoa;

public class Pessoa {
    private String nome;
    private String endereco;
    private String sexo;
    private String cpf;

    public Pessoa(String nome, String endereco, String sexo, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pessoa{");
        sb.append("nome=").append(nome);
        sb.append(", endereco=").append(endereco);
        sb.append(", sexo=").append(sexo);
        sb.append(", cpf=").append(cpf);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
