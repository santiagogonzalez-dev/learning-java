package santiagogonzalez.javaintro;

import java.util.Scanner;

public class E9_eureka {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Introducí una frase");
        String frase = reader.nextLine();
        
        if ( true == frase.equals("eureka"))
            System.out.println("Correcto");
        else
            System.out.println("Incorrecto");
    }
    
}
