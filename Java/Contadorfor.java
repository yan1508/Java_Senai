package com.mycompany.contadorfor;
public class Contadorfor {

    public static void main(String[] args) {
            int base = 5;

            for (int i = 0; i <= base; i++){
                System.out.print("*".repeat(i));   
            }
            System.out.println();

            for (int k = 0; k <= base; k++){
                for (int j = 1; j <= base - j,k++){
                    System.out.println(" ");                
                }
            }

            System.out.println();

            for(int i = 0; i <= base; i++){
                System.out.print(" ".repeat(base - i)+ "*".repeat(2 * i));
            }            
        }
}

