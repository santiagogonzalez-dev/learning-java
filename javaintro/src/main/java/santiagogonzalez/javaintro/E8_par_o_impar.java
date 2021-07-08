package santiagogonzalez.javaintro;

import java.util.Scanner;

public class E8_par_o_impar {
    public static void main(String[] args) {
        // Crear un programa que dado un numero determine si es par o impar.
        Scanner reader = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un número entero");
        int num1 = reader.nextInt();
        
        if ( num1 % 2 == 0)
            System.out.println(num1 + " es par");
        else
            System.out.println(num1 + " es impar");
    }
}