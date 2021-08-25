package collections;

import java.util.ArrayList;

/**
 * @author Santiago Gonzalez
 **/

public class Ejercicio_1 {

    public static void main(String[] args) {
		PerroServicio razaperronuevo = new PerroServicio(); // Intancio el objeto

		razaperronuevo.crearPerro();
    }
}
/* Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará en
la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el
ArrayList. */
// Para preguntar tengo que hacer un simple Si/No.