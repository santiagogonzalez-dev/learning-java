package ejercicio_2;

/**
 * @author Santiago Gonzalez
 */

public class Perro {
	private String raza;

	//Constructores
	public Perro() {
		//Constructor vacío
	}
	public Perro(String raza) {
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
}