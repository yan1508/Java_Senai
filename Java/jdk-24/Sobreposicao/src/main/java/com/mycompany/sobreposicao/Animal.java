/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sobreposicao;

/**
 *
 * @author ead
 */
public abstract class Animal {
    private double peso;
    private int idade;
    private String menbros;

    public Animal(double peso, int idade, String menbros) {
        this.peso = peso;
        this.idade = idade;
        this.menbros = menbros;
    }
    
    public abstract void falarFrase();
     
    
    public String getMenbros() {
        return menbros;
    }

    public void setMenbros(String menbros) {
        this.menbros = menbros;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Animal{" + "peso=" + peso + ", idade=" + idade + ", menbros=" + menbros + '}';
    }
    
    
    
    public void locomover(){
        System.out.println("o animal está se movendo");
    }
    
    public void  alimentar(){
        System.out.println("Alimentar");
    }
    
   
    public abstract void emitirSom();
    
}
