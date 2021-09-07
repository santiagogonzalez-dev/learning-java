package ejercicio_2;

import java.util.ArrayList;

/**
 * @author Santiago Gonzalez
 */

public class PerroServicio {
	ArrayList<Perro> perro = new ArrayList<>(); // Creo la string

	public Perro crearPerro() {
		Perro perroConRaza = new Perro();	
		return perroConRaza;
	}
}
/*
ejercicio_1
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList.
*/