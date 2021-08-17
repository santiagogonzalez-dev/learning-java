package ejercicio_4;

import java.util.Scanner;

public class RectanguloServicio {

	private Scanner reader = new Scanner(System.in).useDelimiter("\n");

	public Rectangulo crearRectangulo() {

		Rectangulo rec1 = new Rectangulo();

		System.out.println("Ingrese la base del rectángulo: ");
		double base = reader.nextDouble();

		System.out.println("Ingrese la altura del rectángulo: ");
		double altura = reader.nextDouble();

		rec1.setBase(base); // Le seteo la base al objecto rec1
		rec1.setAltura(altura); // Le seteo la altura al objecto rec1

		calcularSuperficie(rec1, base, altura);
		calcularPerimetro(rec1, base, altura);
		dibuRectangulo(rec1, base, altura);

		return rec1;
	}

	// Método para calcular la superficie del objeto rec1
	private void calcularSuperficie(Rectangulo rec1, double base, double altura) {
		double superficie = (base * altura);

		System.out.println("La superficie del rectángulo es de: " + superficie);
	}

	// Método para calcular el perimetro del objeto rec1
	private void calcularPerimetro(Rectangulo rec1, double base, double altura) {
		double perimetro = ((base + altura) * 2);

		System.out.println("El perimetro del rectángulo es de: " + perimetro);
	}

	private void dibuRectangulo(Rectangulo rec1, double base, double altura) {
		for (int i = 1; i <= altura; i++) {
			for (int j = 1; j <= base; j++) {
				if (i == 1 || i == altura || j == 1 || j == base) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(); //Jump to the next row
		}
	}

}
