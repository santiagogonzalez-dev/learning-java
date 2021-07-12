package santiagogonzalez.javaintro;

import java.util.Scanner;

public class E16_lea_20_num {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useDelimiter("\n"); // Leer
        int contador = 0; // Inicializo las variables
        int numerosPos = 0; 
        int resultado = 0; 
        
        System.out.println("Dé 20 números");
        while ( contador < 20 ){
            int numeros = reader.nextInt();
	    if ( numeros >= 0 ) {
		    switch ( numeros ) {
			case 0 -> System.out.println("Se capturó el número cero");
			default -> resultado = ( resultado + numeros );
		    }
	    } else {
		    System.out.println("El numero es negativo y no sera sumado");
	    } // End if
            ++contador;
        }
        System.out.println("El resultado final es de: " + resultado);
    }   
}
/* Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
 * salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
 * deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
 * número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
