package santiagogonzalez.javaintro;

import java.util.Scanner;

public class E5_gradosFyC {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useDelimiter("\n");
        System.out.println("De una temperatura en C°");
        int temperaturaC = reader.nextInt();
        // Temperatura que se dio
        System.out.println("Centigrados: "  + temperaturaC);
        // Temperatura en Fahrenheit
        // fórmula correspondiente es: F = 32 + (9 * C / 5)
        int temperaturaF = 32 + (9 * temperaturaC / 5);
        System.out.println("Fahrenheit: "   + temperaturaF);
    }
    
}
