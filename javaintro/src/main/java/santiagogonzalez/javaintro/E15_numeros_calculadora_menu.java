package santiagogonzalez.javaintro;
import java.util.Scanner;
public class E15_numeros_calculadora_menu {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useDelimiter("\n");
        System.out.println("De primer y segundo números");
        double num1 = reader.nextInt();
        double num2 = reader.nextInt(); // No modificar
        // Si use double tienen decimales, no se porque, averiguar
        int opcion = 0;
        double resultado = 0;
        String confirmacion = "n";
        do{
            System.out.println("    MENU            ");
            System.out.println("    1. Sumar        ");
            System.out.println("    2. Restar       ");
            System.out.println("    3. Multiplicar  ");
            System.out.println("    4. Dividir      ");
            System.out.println("    5. Salir        ");
            System.out.println("    Elija una opción");
            opcion = reader.nextInt();
            switch(opcion){
            case 1:
                System.out.println(' ');
                resultado = ( num1 + num2 );
                System.out.println( "El resultado de la suma es: " + resultado );
                System.out.println(' ');
                break;
            case 2:
                System.out.println(' ');
                resultado = ( num1 - num2 );
                System.out.println( "El resultado de la resta es: " + resultado);
                System.out.println(' ');
                break;
            case 3:
                System.out.println(' ');
                resultado = ( num1 * num2 );
                System.out.println( "El resultado de la multiplicacion: " + resultado);
                System.out.println(' ');
                break;
            case 4:
                System.out.println(' ');
                resultado = ( num1 / num2 );
                System.out.println( "El resultado de la division: " + resultado);
                System.out.println(' ');
                break;
            default:
                System.out.println(' ');
                System.out.println("Desea salir? s/n");
                System.out.println(' ');
                confirmacion = reader.next();
            }
        } while(confirmacion.equals("n"));
    }
}
// csj
