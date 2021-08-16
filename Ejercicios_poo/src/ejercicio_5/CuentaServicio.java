package ejercicio_5;

import java.util.Random;
import java.util.Scanner;

public class CuentaServicio {
	private Scanner leer = new Scanner(System.in).useDelimiter("\n");

	private Cuenta crearCuenta() {
		Cuenta c = new Cuenta();

		System.out.println("Bienvenido, ingrese sus datos para crear una cuenta");
		//System.out.println("Ingrese su número de cuenta");
		//int numeroCuenta = leer.nextInt();
		int numeroCuenta = new Random().nextInt(999999999);
		System.out.println("Ingrese su número de dni");
		long dni = leer.nextLong();
		System.out.println("Ingrese su número de dni");
		double sueldoActual = leer.nextDouble();

		c.setNumeroCuenta(numeroCuenta);
		c.setDni(dni);
		c.setSaldoActual(sueldoActual);
		return c;
	}

	private void ingreso(Cuenta c, double ingreso){
		c.setSaldoActual(c.getSaldoActual()+ ingreso);
		System.out.println("Ingreso exitoso. Saldo actual: $" + c.getSaldoActual());
	}

	private void retirar(Cuenta c) {
		double retiro;
		System.out.println("Ingrese la cantidad a retirar");
		retiro = leer.nextDouble();

		if(c.getSaldoActual() < retiro) {
			System.out.println("No hay suficiente saldo disponible");
		} else {
			c.setSaldoActual(c.getSaldoActual() - retiro);
			System.out.println("Retiro exitoso. Su saldo actual es: $" + c.getSaldoActual());
		}
	}

	private void extraccionRapida(Cuenta c) {
		double retiro;
		System.out.println("Ingrese una cantidad a retirar");
		retiro = leer.nextDouble();

		if(c.getSaldoActual() * 0.20 < retiro) {
			System.out.println("El retiro no puede superar el 20% del salto actual");
		} else {
			c.setSaldoActual(c.getSaldoActual() - retiro);
			System.out.println("Retiro exitoso. Su saldo actual es: $" + c.getSaldoActual());
		}
	}

	private void consultarSaldo(Cuenta c) {
		System.out.println("Saldo disponible: $ " + c.getSaldoActual());
	}

	private void consultarDatos(Cuenta c) {
		System.out.println("DNI: " + c.getDni());
		System.out.println("Numero de cuenta: " + c.getNumeroCuenta());
		System.out.println("Saldo disponible: $ " + c.getSaldoActual());
	}

	private static void mostrarMenu() {
		System.out.println("MENU\n"
				+ "1 - Ingreso\n"
				+ "2 - Extraccion\n"
				+ "3 - Extraccion rapida\n"
				+ "4 - Consulta saldo disponible\n"
				+ "5 - Consulta datos cuenta\n"
				+ "6 - Salir");
	}

	private int elegirOpcion() {
		int sel;
		do {
			sel = leer.nextInt();
			if (sel < 1 || sel > 6) {
				System.out.println("Seleccion invalido. Intente nuevamente");
			}
		} while (sel < 1 || sel > 6);
		return sel;
	}

	public void ejecutarMenu() {
		Cuenta c1 = crearCuenta();
		mostrarMenu();
		int sel = 0;

		do{
			sel = elegirOpcion();

			switch(sel) {
				case 1:
					System.out.println("Digite el monto a ingresar");
					double ingreso = leer.nextDouble();
					ingreso(c1, ingreso);
					break;
				case 2:
					retirar(c1);
					break;
				case 3:
					extraccionRapida(c1);
					break;
				case 4:
					consultarSaldo(c1);
					break;
				case 5:
					consultarDatos(c1);
					break;
				case 6:
					System.out.println("Adios");
					break;
			}
			if(sel != 6) {
				System.out.println("");
				mostrarMenu();
				System.out.println("");
			}
		} while(sel != 6);
	}
}
