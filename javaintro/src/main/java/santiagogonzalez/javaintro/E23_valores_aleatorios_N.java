package santiagogonzalez.javaintro;

import java.util.Scanner;
import java.util.Vector;

public class E23_valores_aleatorios_N {

    // Genera un número aleatorio int entre 1 y 100
    public static int getRandom() {
        int j = (int) (Math.random() * ((1 + 10) + 1)) + 1;
        return j;
    }

    public static void getAll(int t, int a) {
        Vector vec = new Vector(t); // Creamos el vector según el tamaño que pedimos

        for (int i = 0; i < t; i++) {
            vec.add(getRandom());
        }

        int encontrado = 0; // Inicializar. Contador para las veces del número encontrado
        for (int i = 0; i < t; i++) {
            int buscado = (int) vec.get(i);
            if (buscado == a) {
                encontrado++;
            }
        }

        System.out.println("El número buscado " + a + " se encontró repetido " + encontrado + " veces.");
        System.out.print("en las posiciones: ");
        for (int i = 0; i < t; i++) {
            if (vec.get(i).equals(a)) {
                int posicion = i;
                System.out.print(posicion + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useDelimiter("\n"); // Leer
        System.out.println("Tamaño del vector");
        int tam = reader.nextInt();
        System.out.println("Buscar un número en el vector entre 1 y 10");
        int abuscar = reader.nextInt();
        getAll(tam, abuscar);
    }
}