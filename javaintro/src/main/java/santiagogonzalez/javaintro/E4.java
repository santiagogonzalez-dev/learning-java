package santiagogonzalez.javaintro;
import java.util.Scanner;
public class E4 {
    public static void main(String[] args) {
        // toUpperCase() y toLowerCase() en Java.
        Scanner reader = new Scanner(System.in).useDelimiter("\n");
        System.out.println("De una frase");
        String frase = reader.nextLine();
        String frase1 = frase.toUpperCase();
        String frase2 = frase.toLowerCase();
        System.out.println(frase);
        System.out.println(frase1);
        System.out.println(frase2);
    }
}
