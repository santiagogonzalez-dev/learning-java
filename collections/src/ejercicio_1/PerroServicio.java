package ejercicio_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Santiago Gonzalez
 */

public class PerroServicio {

	private Scanner reader = new Scanner(System.in).useDelimiter("\n");

	public Perro introducirRaza() {

		// No hace falta hacer la aclaración en el segundo <>
		ArrayList<String> listaDePerros = new ArrayList<>();

		Perro perroCreado = new Perro();
		String confirmacion = "n";

		do {
			System.out.println("Ingrese una raza");
			String raza = reader.nextLine();

			listaDePerros.add(raza);

			System.out.println("Salir? S/N");
			confirmacion = reader.nextLine();
		} while (confirmacion.equalsIgnoreCase("n"));

		for (String listaDePerro : listaDePerros) {
			System.out.println(listaDePerro);
		}

		return perroCreado;
	}
}