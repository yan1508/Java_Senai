package com.mycompany.mavenproject1;

   public class Bhaskara {
    public static void main(String[] args) {
        
        double a,b,c,x1,x2,delta;
        a=4;
        b=-5;
        c=12;
                
        delta = b*b -4*a*c;
        x1 = (-b+Math.sqrt(delta))/(2*a);
        x2 = (-b-Math.sqrt(delta))/(2*a);
                
        System.out.println("delta: "+delta+" x1" +x1+ "x2" +x2);
    }
   }