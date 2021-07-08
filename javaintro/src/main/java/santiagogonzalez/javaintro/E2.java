package santiagogonzalez.javaintro;
import java.util.Scanner;
public class E2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();
        System.out.println("Tu nombre es: " + nombre);
    }
    
}
