package santiagogonzalez.javaintro;

import java.util.Scanner;

public class E15_echo_profes {

    public static void main(String[] args) {
        double num1;
        double num2;
        int seleccion;
        char valSalida;

        System.out.println("Ingrese dos números enteros positivos");
        num1 = pedirEntero();
        num2 = pedirEntero(); // Con esto pedimos los numeros usando el subproceso
        while (num1 < 1 || num2 < 1) {
            System.out.println("Los números deben ser positivos y distintos de cero");
            num1 = pedirEntero();
            num2 = pedirEntero(); // Con esto pedimos los numeros usando el subproceso
        }

        do {
            mostrarMenu();
            seleccion = (int) validarSeleccion(); // Lo que se hace acá es un casteo
            valSalida = ejecutarSeleccion(seleccion, num1, num2);
        } while (valSalida != 'S');
    }

    // Leer los numeros, el int es porque se devuelve un integer en el video usan int pero 
    // yo voy a usar double para que no me lo redondee en los resultados de la división.
    public static double pedirEntero() {
        Scanner reader = new Scanner(System.in).useDelimiter("\n"); // Leer
        return reader.nextInt(); // Nos ahorramos el declarar y leer una variable de más
    }

    public static char pedirChar() {
        Scanner reader = new Scanner(System.in).useDelimiter("\n"); // Leer
        return reader.next().charAt(0); // Nos va a devolver lo que este en posicion 0
    }

    // Sirve solo para mostrar el menú, es void porque no devuelve nada
    public static void mostrarMenu() {
        System.out.println("---- MENU ----\n"
            + "1. Sumar\n" + "2. Restar\n"
            + "3. Multiplicar\n" + "4. Dividir\n"
            + "5. Salir");
    }

    // Validamos el número usado en el menú
    public static double validarSeleccion() {
        double seleccion = pedirEntero();
        while (seleccion < 1 || seleccion > 5) {
            System.out.println("La opción ingresada no es válida");
            System.out.println("Elija otra opción: ");
            seleccion = pedirEntero();
        }
        return seleccion;
    }

    // Seleccion una de las opciones del menú
    public static char ejecutarSeleccion(int seleccion, double a, double b) {
        char valSalida = '\0';
        switch (seleccion) {
            case 1:
                System.out.println("El resultado de la suma es: " + (a + b));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + (a - b));
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: " + (a * b));
                break;
            case 4:
                System.out.println("El resultado de la división es: " + (a / b));
                break;
            case 5:
                System.out.println("Está seguro que desea salir? S/N");
                valSalida = Character.toUpperCase(pedirChar());
                while (valSalida != 'S' && valSalida != 'N') {
                    System.out.println("Ingrese una opción válida");
                    valSalida = Character.toUpperCase(pedirChar());
                }
                break;
        }
        return valSalida;
    }
}
