package santiagogonzalez.javaintro;
import java.util.Scanner;
public class E19_cuadrado_asteriscos {
	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in).useDelimiter("\n"); // Leer
	System.out.println( "Escribir el lado del cuadrado" );
	int lado = reader.nextInt();
	int i = 0;
	int j = 0;

	for (i = 0; i < lado; ++i) {
		System.out.println("*");
	}

	}
}