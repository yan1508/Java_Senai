package com.mycompany.sobreposicao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ead
 */
public class Calculo {
    public int metric(int a, int b){
        return a+b;
        
    }
    
    public double metric(double a, double b, double c){
        return Math.pow(b, 2) +(-4*(a*c));
        
    }
    
    public float metric(float a , float b, float c, float d){
        return (a+b+c+d)/4;
    }
}
