package Ejercicio_3;

public class Operacion {

	private double numero1;
	private double numero2;

	// a) Constructor 
	public Operacion(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	// b) Constructor vacío
	public Operacion() {
	}

	// c) Setter numero1 y numero2
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	// c) Getter numero1 y numero2
	public double getNumero1() {
		return numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	// d) Pide los números y los guarda en los atributos del objeto Operacion
	public void crearOperacion(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	// e) Método sumar()
	public double sumar(double numero1, double numero2) {
		double resultadoSumar = (numero1 + numero2);
		return resultadoSumar;
	}

	// f) Método restar()
	public double restar(double numero1, double numero2) {
		double resultadoRestar = (numero1 - numero2);
		return resultadoRestar;
	}

	// g) Método multiplicar()
	public double multiplicar(double numero1, double numero2) {
		double resultadoMultiplicar = 0;
		if (numero1 == 0 || numero2 == 0) {
			System.out.println("Se está multiplicando por cero");
			resultadoMultiplicar = 0;
		} else {
			resultadoMultiplicar = (numero1 * numero2);
		}
		return resultadoMultiplicar;
	}

	// h) Método dividir()
	public double dividir(double numero1, double numero2) {
		double resultadoDividir = 0;
		if (numero1 == 0 || numero2 == 0) {
			System.out.println("Se está dividiendo por cero");
			resultadoDividir = 0;
		} else {
			resultadoDividir = (numero1 / numero2);
		}
		return resultadoDividir;
	}
}