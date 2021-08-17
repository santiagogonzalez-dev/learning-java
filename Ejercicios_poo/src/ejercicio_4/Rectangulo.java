package ejercicio_4;

public class Rectangulo {
    private double base;
    private double altura;

    // Constructor vacio
    public Rectangulo() {
    }

    // Constructor por parámetros
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

	// Getter base
	public double getBase() {
		return base;
	}

	// Setter base
	public void setBase(double base) {
		this.base = base;
	}

	// Getter altura
	public double getAltura() {
		return altura;
	}

	// Setter altura
	public void setAltura(double altura) {
		this.altura = altura;
	}
}