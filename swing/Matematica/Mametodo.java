package conn.Matematica;

public class Mametodo {
    public double soma(double a, double b){
        return a + b;
    }
    public String parImpar(int a){
        
        String resultado = (a %2==0)?"Par":"impar"; 
        return resultado;
    }
    public double bhaskara(double a,double b,double c,double delta, double x1, double x2){
        delta = Math.pow(b,2)-4*a*c;
        x1 = (-b+Math.sqrt(delta))/(2*a);
        x2 = (-b-Math.sqrt(delta))/(2*a);
        return 0;
    }
}
