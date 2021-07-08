package santiagogonzalez.javaintro;

import static java.lang.Math.max;
import java.util.Scanner;

public class E7_cual_es_mayor {
    public static void main(String[] args) {
        // Implementar un programa que dado dos números enteros determine cuál es el mayor y lo muestre por pantalla.
        Scanner reader = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos números enteros");
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
        
        int cualmayor = Math.max(num1, num2);
        System.out.println("El mayor de estos números es: " + cualmayor);
    }
    
}
