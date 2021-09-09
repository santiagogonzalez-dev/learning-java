package ejercicio_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Santiago Gonzalez
 */
public class Ejercicio_2 {

	static Scanner reader = new Scanner(System.in).useDelimiter("\n");

	public static void main(String[] args) {

		ArrayList<Perro> perros = new ArrayList<>();

		Perro perro1 = new Perro();

		String confirmacion = "n";
		PerroServicio perroAux = new PerroServicio();
		do {
			perro1 = perroAux.ingresarPerro();
			perros.add(perro1);

			System.out.println("Desea salir? No(seguir cargando perros)/Si(salir del programa)");
			confirmacion = reader.nextLine();
		} while (confirmacion.equals("n")); // No usar == para Strings

		// Muestra la lista de perros cargados usando un for each
		int i = 0;
		for (Perro perro : perros) {
			System.out.print(i + "-");
			System.out.println(perros.get(i).getRaza());
			i++;
		}
		i = 0;
		// Muestra el tamaño de lista de perros cargados.
		System.out.println("El tamaño de la ArrayList con los perros es de: " + perros.size());

		// Parte II
		System.out.println("Que perro quiere eliminar de la lista?");
		String elegido = reader.nextLine();

		Iterator<Perro> iterator = perros.iterator();

		while (iterator.hasNext()) {			
			if (iterator.next().getRaza().equals(elegido)) {
//				iterator.remove();
				perros.remove(elegido);
			}
		}

		// Mostrar la lista ordenada, igual tendría que haber hecho en método, pero bueno...
		i = 0;
		for (Perro perro : perros) {
			System.out.print(i + "-");
			System.out.println(perros.get(i).getRaza());
			i++;
		}
	}
}
/* Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
y se mostrará la lista ordenada. */