/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sobreposicao;

/**
 *
 * @author ead
 */
public class Mamifero extends Animal{
    private String corPelo;

    public Mamifero(String corPelo, double peso, int idade, String menbros) {
        super(peso, idade, menbros);
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    public String reagir(boolean reacao){
        
        if(reacao == true){

            return "agradavel";
        }else{
            System.out.println("O animal está rosnando");
            return "agressivo";
        }
    }

    
    @Override
    public void emitirSom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Mamifero{" + "corPelo=" + corPelo + '}';
    }

    @Override
    public void falarFrase() {
        if("agradavel".equals(reagir()){
            System.out.println("O animal está abanando");
        }
    }
}
