package santiagogonzalez.javaintro;

import java.util.Scanner;

public class E12_motores {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Que tipo de bomba es?");
        int tipoMotor = reader.nextInt();
        switch(tipoMotor){
            case 1:
                System.out.println("bomba de agua");
                break;
            case 2:
                System.out.println("bomba de gasolina");
                break;
            case 3:
                System.out.println("bomba de hormigón");
                break;
            case 4:
                System.out.println("bomba de pasta alimenticia");
                break;
            default: System.out.println("No existe valor valido para tipo de bomba");
        }
    }   
}
/*Considera que estás desarrollando una web para una empresa que fabrica motores
(suponemos que se trata del tipo de motor de una bomba para mover fluidos).
Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre
1 y 4.
El programa debe mostrar lo siguiente:
- Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una
bomba de agua”.
- Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una
bomba de gasolina”.
- Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una
bomba de hormigón”.
- Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una
bomba de pasta alimenticia”.
- Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No
existe un valor válido para tipo de bomba”*/