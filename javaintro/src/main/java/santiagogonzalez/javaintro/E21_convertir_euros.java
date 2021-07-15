package santiagogonzalez.javaintro;

import java.util.Scanner;

public class E21_convertir_euros {

	// Conversion a dolares
	public double convDolares(double dolares) {
		double convertido = 0; // Inicializar var
		convertido = (dolares * 1.28611);
		return convertido;
	}

	// Conversion a yenes
	public double convYenes(double yenes) {
		double convertido = 0; // Inicializar var
		convertido = (yenes * 129.852);
		return convertido;
	}

	// Conversion a libras
	public double convLibras(double libras) {
		double convertido = 0; // Inicializar var
		convertido = (libras * 0.86);
		return convertido;
	}

	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in).useDelimiter("\n"); // Leer
	System.out.println("A que moneda se quiere convertir?");
	String moneda = reader.nextLine();
	System.out.println("Ingrese una cantidad de euros");
	double euros = reader.nextDouble();

	double resultado = 0; // Inicializo la variable

	E21_convertir_euros obj = new E21_convertir_euros(); // Llamamos al objecto

	switch (moneda) {
		case "dolares":
			System.out.println("La conversion va a ser de: ");
			resultado = obj.convDolares(euros);
			break;
		case "yenes":
			System.out.println("La conversion va a ser de: ");
			resultado = obj.convYenes(euros);
			break;
		case "libras":
			System.out.println("La conversion va a ser de: ");
			resultado = obj.convLibras(euros);
			break;
		default:
	}
	// Este seria el resultado y quedaria resuelto el ejercicio
	System.out.println("La conversion fue de: " + resultado);
	}
	// csj
}
/* Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
 * libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
 * converir que será una cadena, este no devolverá ningún valor y mostrará un
 * mensaje indicando el cambio (void).
 * El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €							*/