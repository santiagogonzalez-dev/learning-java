package Ejercicio_2;

public class Circunferencia {

	private double radio;
	private double area;
	private double perimetro;

	// Setters
	public void setRadio (double radio) {
		this.radio = radio;
	}

	public void setArea (double area) {
		this.area = area;
	}

	public void setPerimetro (double perimetro) {
		this.perimetro = perimetro;
	}

	// Getter
    public double getRadio() {
        return radio;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }


	// Constructor vacío, sin parámetros o predeterminado
	public Circunferencia() {
	}

	// Constructor 
	public Circunferencia(double radio) {
		this.radio = radio;
	}

	// c) Pide el radio y lo guarda en el atributo del objeto
	public void crearCircunferencia(double radio) {
		this.radio = radio;
	}

	// d) Calcular el área
	public double area() {
		area = (3.1415 * radio * radio);
		return area;
	}

	// e) Calcular el périmetro
	public double perimetro() {
		perimetro = (2 * 3.1415 * radio);
		return perimetro;
	}

	// Mostrar valores
	public void mostrarCircunferencia() {
		System.out.println("El radio es: " + radio);
		System.out.println("El área es: " + area());
		System.out.println("El perímetro es: " + perimetro());
	}
}