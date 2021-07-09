package santiagogonzalez.javaintro;

import java.util.Scanner;

public class E13_nota_entre_0_y_10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useDelimiter("\n");
        System.out.println("De una nota entre 0 y 10");
        int resultado = 0;
        do{
            int nota = reader.nextInt();
            resultado = nota;
        } while ( resultado > 10 || resultado < 0);
        System.out.println("La nota final es de: " + resultado);
    }
}