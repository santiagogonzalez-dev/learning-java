package santiagogonzalez.javaintro;

import java.util.Scanner;

public class E14_val_limit_posit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar un valor límite positivo");
        int limite = reader.nextInt();
        System.out.println("De un número");
        int i = 0; // Inicializo la variable
        
        while (limite > i){
            System.out.println("Siga dando números");
            int a = reader.nextInt();
            i = ( i + a );
        }
        System.out.println("El limite impuesto es de: " + limite);
        System.out.println("El resultado fue de: " + i);
        //csj
    }
}
/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.*/