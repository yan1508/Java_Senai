package com.mycompany.guilhermefranca;

public class Forr {

    public static void main(String[] args) {
        
        int base = 5;
        
        System.out.println("Parte esquerda:");
        for (int i = 1; i <= base; i++) {
            System.out.println("*".repeat(i));
        }
        
        System.out.println();
        
        System.out.println("Parte direita:");
        for (int i = 1; i <= base; i++) {
            System.out.println(" ".repeat(base - i) + "*".repeat(i));
        }
        
        System.out.println(); 

        System.out.println("Árvore completa:");
        for (int i = 1; i <= base; i++) {
            System.out.println(" ".repeat(base - i) + "*".repeat(2 * i - 1));
        }
        
    }
}
