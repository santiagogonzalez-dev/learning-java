package santiagogonzalez.javaintro;

import java.util.Scanner;

public class E6_math {
    public static void main(String[] args) {
        //Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
        Scanner reader = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un número entero");
        int num1 = reader.nextInt();
        
        int doblenum1 = (num1 * 2);
        System.out.println("El doble: " + doblenum1);
        
        int triplenum1 = (num1 * 3);
        System.out.println("El triple: " + triplenum1);
        
        double raiznum1 = Math.sqrt(num1);
        System.out.println("La raíz: " + raiznum1);
    }
    
}
