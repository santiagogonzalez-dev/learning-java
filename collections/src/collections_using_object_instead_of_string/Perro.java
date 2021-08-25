package collections_using_object_instead_of_string;

/**
 * @author Santiago Gonzalez
 */

public class Perro {
	private String raza;

	public Perro() {
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

	@Override
	public String toString() {
		return "Perro{" + "raza=" + raza + '}';
	}

}