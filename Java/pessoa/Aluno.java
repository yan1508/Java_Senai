package com.mycompany.pessoa;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    public Aluno(String nome, String endereco, String sexo, String cpf) {
        super(nome, endereco, sexo, cpf);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aluno");
        sb.append("matricula=").append(matricula);
        sb.append(", curso=").append(curso);
        sb.append('}');
        return sb.toString();
    }
    
}