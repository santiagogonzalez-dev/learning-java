package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		Operacion operata = new Operacion();

		Scanner reader = new Scanner(System.in).useDelimiter("\n");

		System.out.println("Introduzca numero 1: ");
		double numero1 = reader.nextDouble();
		System.out.println("Introduzca numero 2: ");
		double numero2 = reader.nextDouble();
		operata.crearOperacion(numero1, numero2);

		//operata.sumar(numero1, numero2);

		System.out.println("El número 1 es: " + numero1);
		System.out.println("El número 2 es: " + numero2);
		System.out.println("Resultado suma: " + operata.sumar(numero1, numero2));
		System.out.println("Resultado resta: " + operata.restar(numero1, numero2));
		System.out.println("Resultado multiplicacion: " + operata.multiplicar(numero1, numero2));
		System.out.println("Resultado dividir: " + operata.dividir(numero1, numero2));
	}
}