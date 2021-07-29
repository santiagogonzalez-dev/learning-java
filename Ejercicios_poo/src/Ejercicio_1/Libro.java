package Ejercicio_1;

public class Libro {
	private String titulo;
	private String nombre;
	private int nropaginas;
	private String isbn;

	// Constructor vacío, sin parámetros o predeterminado
	public Libro() {
	}

	// Se usa el this para diferenciar variable de atributo, ya que tienen el mismo nombre
	public Libro(String titulo, String nombre, int nropaginas, String isbn) {
		this.titulo = titulo;
		this.nombre = nombre;
		this.nropaginas = nropaginas;
		this.isbn = isbn;
	}

	// Creamos los setter, 
	public void setTitulo (String titulo) {
		this.titulo = titulo;
	}

	public void setNombre (String nombre) {
		this.nombre = nombre;
	}

	public void setPaginas (int nropaginas) {
		this.nropaginas = nropaginas;
	}

	public void setISBN (String isbn) {
		this.isbn = isbn;
	}

	// Primer método, para rellenar el libro
	public void llenarLibro(String titulo, String nombre, int nropaginas, String isbn) {
		this.titulo = titulo;
		this.nombre = nombre;
		this.nropaginas = nropaginas;
		this.isbn = isbn;
	}
	
	// Segundo método. Mostrar perros mediante un método
	public void mostrarLibro() {
		System.out.println("El título del libro es: " + titulo);
		System.out.println("El nombre del autor es: " + nombre);
		System.out.println("La cantidad de páginas es de: " + nropaginas);
		System.out.println("El número de ISBN es: " + isbn);
	}
}