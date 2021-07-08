package santiagogonzalez.javaintro;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese primer número");
        int numEntero = leer.nextInt(); // Leer un entero
        System.out.println("Ingrese segundo número");
        int numEnter2 = leer.nextInt(); // Leer segundo entero
        
        int resultado = numEntero + numEnter2;
        System.out.println("La suma de estos dos es de: " + resultado);
        // csj
    }
}