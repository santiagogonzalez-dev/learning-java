package integrador;

import java.util.Scanner;

public class Integrador {

    public static void main(String[] args) {
        
        Practica practica = new Practica();
        
//        System.out.println( (int) Math.log10(1000)+1);
        
		// Capicua
		Integer capicua = 2002;
		System.out.println("El número es: " + capicua);
		if (practica.numeroCapicua(capicua).equals(true)){
			System.out.println("Es capicua");
		} else {
			System.out.println("No es capicua");
		}

		// CarameloLandia
		System.out.println("El prisioner al que le toca el caramelo podrido es: " + practica.prisioneroDulce(1, 3, 9));

        //Generar las variables necesarias para probar
        //ArrayList<String> medias = new ArrayList(Arrays.asList(new String[]{"A", "B", "C", "D","A", "C", "D", "A"}));

        //System.out.println(practica.mediasAmigas(medias));
        //System.out.println(practica.numeroPalindromo(null));
        //System.out.println(practica.prisioneroDulce(5,10,5));
    }
}