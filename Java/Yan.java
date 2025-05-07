package com.mycompany.yan;

import java.time.LocalDate;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Yan {
    private String nome;
    private String CPF;
    private LocalDate DTN;
    private double altura;
    private double peso;

    public Yan(String nome, String CPF, LocalDate DTN, double altura, double peso) {
        this.nome = nome;
        this.CPF = CPF;
        this.DTN = DTN;
        this.altura = altura;
        this.peso = peso;
    }
    
    
    public double calcularIMC(){
        if(this.getAltura()<= 0){
            throw new IllegalArgumentException("Altura deve ser maior que 0: ");
        }
        return this.peso/Math.pow(altura,2);
    }
    
    public boolean isMaiorIdade(){
        LocalDate hoje = LocalDate.now();
        Period idade = Period.between(this.getDTN(),hoje);
        return idade.getYears()>=18;
    
    }
    
    
    
    
    public String getNome() {
        return nome;
    }
    
    public String toCSV(){
        return nome+";"+DTN ";" +altura+";"+peso+ ";"+
                String.format("%.2f", calcularIMC())+ 
                ";"+ (isMaiorIdade()? "sim":"não");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDTN() {
        return DTN;
    }

    public void setDTN(String DTN) {
        this.DTN = DTN;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
        
}

