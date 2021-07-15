package santiagogonzalez.javaintro;

import java.util.Scanner;

public class E20_imprima_numero_asterisco {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in).useDelimiter("\n"); // Leer
		System.out.println("Ingrese 4 numeros entre 1 y 20");
//		int num1 = reader.nextInt();
//		int num2 = reader.nextInt();
//		int num3 = reader.nextInt();
//		int num4 = reader.nextInt();
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int i1 = num1;
		int i2 = num2;
		int i3 = num3;
		int i4 = num4;

		// Validar el numero 1
		do {
			num1 = reader.nextInt();
			if (num1<1 || num1>20) {
				System.out.println("El número no esta entra 1 y 20");
			} else {
				System.out.println("El numero esta bien");
			}
		} while (num1>20 || num1<1);

		do {
			num2 = reader.nextInt();
			if (num2<1 || num2>20) {
				System.out.println("El número no esta entra 1 y 20");
			} else {
				System.out.println("El numero esta bien");
			}
		} while (num2>20 || num2<1);

		do {
			num3 = reader.nextInt();
			if (num3<1 || num3>20) {
				System.out.println("El número no esta entra 1 y 20");
			} else {
				System.out.println("El numero esta bien");
			}
		} while (num3>20 || num3<1);

		do {
			num4 = reader.nextInt();
			if (num4<1 || num4>20) {
				System.out.println("El número no esta entra 1 y 20");
			} else {
				System.out.println("El numero esta bien");
			}
		} while (num4>20 || num4<1);

		// Imprimir en pantalla
		System.out.print(num1 + " ");
		for (i1=0;i1<num1;i1++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print(num2 + " ");
		for (i2=0;i2<num2;i2++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print(num3 + " ");
		for (i3=0;i3<num3;i3++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print(num4 + " ");
		for (i4=0;i4<num4;i4++) {
			System.out.print("*");
		}
	}
	
}

/* Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
 * número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
 * 			5 *****
 * 			3 ***
 * 			11 ***********
 * 			2 **							*/