package Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		Circunferencia circun = new Circunferencia();

		Scanner reader = new Scanner(System.in).useDelimiter("\n");

		System.out.println("Ingrese el radio de la circunferencia: ");
		double radio = reader.nextDouble();

		circun.crearCircunferencia(radio);

		circun.setRadio(radio);

		circun.mostrarCircunferencia();
	}
}
/* Declarar una clase llamada Circunferencia que tenga como atributo privado el
 * radio de tipo real. A continuación, se deben crear los siguientes métodos:
 * a) Método constructor que inicialice el radio pasado como párametro.
 * b) Método get y set para el atributo radio de la clase Circunferencia.
 * c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el
 * atributo del objeto.
 * d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio^2).
 * e) Método perimetro(): para calcular el périmetro (Perimetro = 2 * π * radio). 
 */