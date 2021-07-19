package introduccion_poo;

import java.util.Scanner;
import introduccion_poo.entidades.Mascota;

public class Introduccion_poo {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useDelimiter("\n");
        Mascota m1 = new Mascota("Fernando Chiquito", reader.next(), "Perro");
        // Con new, hacemos nacer el objeto

        System.out.println(m1.nombre + " " + m1.apodo + " " + m1.edad + " " + m1.tipo + " " + m1.color);
    }
}
