package santiagogonzalez.javaintro;

import java.util.Scanner; // Load Scanner package
import java.util.Vector; // Load Vector package

public class E22_vector_100_descendente {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useDelimiter("\n"); // Leer
        int numeros = 1;

        Vector vec = new Vector(100);
        for (int i = 0; i < 100; i++) {
            vec.add(numeros);
            numeros++; // Contador
            System.out.println(vec.lastElement()); // Imprimir último elemento
        }
    }
} /* Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.                                  */