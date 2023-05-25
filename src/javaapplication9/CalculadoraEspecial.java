
package javaapplication9;

public class CalculadoraEspecial {
     
 public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
 // Math.pow es una función toma dos argumentos  base y el exponente y devuelve la potencia calculada
 //  double almacenar datos de tipo reales 
 
 public double logaritmo(double numero) {
        return Math.log(numero);
    }
 //Math.log es una función  que calcula el logaritmo natural de un número 
 
 
    public double seno(double angulo) {
        return Math.sin(angulo);
    }
//Math.sin es una función  que calcula el seno de un ángulo dado en radianes
    
    public double coseno(double angulo) {
        return Math.cos(angulo);
    }
//Math.cos es una función  que calcula el coseno de un ángulo dado en radianes
    
    public int factorial(int numero) {
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
     public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
    

 