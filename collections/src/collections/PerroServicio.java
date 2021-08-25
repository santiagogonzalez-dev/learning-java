package collections;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Santiago Gonzalez
 */
public class PerroServicio {

	private Scanner reader = new Scanner(System.in).useDelimiter("\n");

	public Perro crearPerro() {
		Perro nuevoperro = new Perro(); // Instancio al objecto
		String salir = "n"; // Inicializo la variable

		// La listaDePerros va a ser la ArrayList en la que voy a guardar las
		// razas de los perros.
		ArrayList<String> listaDePerros = new ArrayList(1);

		do {
			System.out.println("Ingrese una raza");
			String raza1 = reader.nextLine();
			listaDePerros.add(raza1);

			/* Confirmar, si se introduce S se sale del programa y se muestran
			todas las razas de perros que se han ingresado, si se introduce una
			N se le vuelve a pedir que ingrese una raza de perro. */
			System.out.println("Quiere seguir agregando razas de perros?");
			System.out.println("O quiere salir? S/N");
			salir = reader.nextLine();

		} while (salir.equalsIgnoreCase("n"));

		// Muestro la ArrayList con un for each
		for (String contador : listaDePerros) {
			System.out.println("raza: " + contador);
		}
		// Muestro la ArrayList con un for normal
		//for (int i = 0; i < listaDePerros.size(); i++) {
		//	System.out.println(listaDePerros.get(i) + " ");
		//}

		return nuevoperro;
	}
}