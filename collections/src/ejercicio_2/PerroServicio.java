package ejercicio_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Santiago Gonzalez
 */

public class PerroServicio {

	Scanner reader = new Scanner(System.in).useDelimiter("\n");

	public Perro ingresarPerro() {
		Perro perroConRaza = new Perro(); // Creo el perro que voy a devolver

		// Pregunto su raza(atributo) y se la setteo al objeto(Perro)
		System.out.println("Cuál es la raza del perro?");
		perroConRaza.setRaza(reader.nextLine());

		return perroConRaza;
	}
}
