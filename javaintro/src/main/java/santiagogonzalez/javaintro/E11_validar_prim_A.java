package santiagogonzalez.javaintro;
import java.util.Scanner;
public class E11_validar_prim_A {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useDelimiter("\n");
        System.out.println("De una frase o palabra");
        String frase = reader.nextLine();
        String frasediv = frase.substring(0,1);
        //System.out.println(frasediv);
        if ( "A".equals(frasediv) )
            System.out.println("CORRECTO");
        else
            System.out.println("INCORRECTO");
    }
}