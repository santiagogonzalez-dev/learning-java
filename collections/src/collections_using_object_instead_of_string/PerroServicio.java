package collections_using_object_instead_of_string;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Santiago Gonzalez
 */

public class PerroServicio {

	private Scanner reader = new Scanner(System.in).useDelimiter("\n");

	ArrayList<Perro> listaDePerros = new ArrayList<>();
	String confirmacion = "n";

	public Perro introducirRaza() {
		Perro perroCreado = new Perro();
		do {
			System.out.println("Ingrese una raza");
			String razaDelPerro = reader.nextLine();
			perroCreado.setRaza(razaDelPerro); // Setteo la raza del perro
			listaDePerros.add(perroCreado); // Lo agrego al objeto

			System.out.println("Salir? S/N");
			confirmacion = reader.nextLine();
		} while (confirmacion.equalsIgnoreCase("n"));

		for (Perro aux : listaDePerros) {
			System.out.println(aux.toString());
		}
		
		return perroCreado;
	}
}