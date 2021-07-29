package Ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		Libro librocreado = new Libro();

		Scanner reader = new Scanner(System.in).useDelimiter("\n");

		System.out.println("Cuál es el título del libro?");
		String titulo = reader.next();
		System.out.println("Cuál es el nombre del autor?");
		String nombre = reader.next();
		System.out.println("Cuál es el número de páginas?");
		int nropaginas = reader.nextInt();
		System.out.println("Cuál es el número de ISBN?");
		String isbn = reader.next();

		librocreado.llenarLibro(titulo, nombre, nropaginas, isbn);

		librocreado.mostrarLibro();
	}
}

/* Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y un constructor con todos los atributos pasados por
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas. */