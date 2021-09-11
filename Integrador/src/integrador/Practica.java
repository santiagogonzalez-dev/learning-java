package integrador;

import java.util.List;

public class Practica {

//    La función recibirá un numero x y deberá determinar si es capicúa o no. 
//    Este deberá devolver verdadero(true) si es capicúa y falso(false) si no lo es. 
//    Además deberemos contemplar los siguientes escenarios: 
//    Contemplar que el numero que llega puede ser negativo. 
//    Contemplar que el numero que llega puede ser de un digito, si es así debe devolver true. 
//    Contemplar que el numero que llega puede ser null, si es así debe devolver false.
//    @param num
//    @return esPalindromo
	public Boolean numeroCapicua(Integer num) {
		Boolean esPalindromo = false; // Started as false

		// Confirm that the number given isn't null, and convert to absolute number.
		try {
			// To ignore the (-) I will work with an absolute number
			// And if it fails to convert it (because it's a null) it will catch ()
			int absNum = Math.abs(num);

			Integer Count = 0;
			while (absNum > 0) {
				absNum = absNum / 10;
				Count = Count + 1;
			}
			if (Count.equals(1)) {
				// Check if it's just one number
				esPalindromo = true;
			} else {

				// Rotate the number and check if it's the same backwards
				int palindrome = num;
				int reverse = 0;

				// Compute the reverse
				while (palindrome != 0) {
					int remainder = palindrome % 10;
					reverse = reverse * 10 + remainder;
					palindrome = palindrome / 10;
				}

				// The integer is palindrome if num and reverse are equal
				if (num == reverse) {
					esPalindromo = true;
				} else {
					esPalindromo = false;
				}
			}
		} catch (Exception e) {
			// The number is null
			esPalindromo = false;
		}

		return esPalindromo;
	}

//    Estamos en caramelolandia, donde estan los peores ladrones de dulces. 
//    Una vez al mes, se sienta una n cantidad de presos en ronda, contemplando 
//    al preso que inicia la ronda, como el preso 0. 
//    A los presos se les da una m cantidad de caramelos, estos caramelos se repartirán de uno en uno a cada preso, 
//    contemplando que se comenzaran a repartir los caramelos desde el primer preso (inicio). 
//    Se repartirán los caramelos hasta que no queden más y el ultimo caramelo en repartirse estará podrido, 
//    determinar a que preso, según su posición en la ronda le tocara el caramelo podrido.
//     @param inicio
//     @param cantidadCaramelos
//     @param cantidadLadrones
//     @return ladronQueLeTocoElCarameloPodrido
	public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadLadrones) {
		//Aca escribir la logica necesaria

		int resultado = 0;
		int i = 0;
		for (i = inicio; inicio < cantidadLadrones; i++) {
			cantidadCaramelos--;
			if (cantidadCaramelos == 0) {
				resultado = i;
				break;
			}
		}
		if (i == cantidadLadrones) {
			i = 0;
		}
		return i;
	}

//    En un universo paralelo, donde los habitantes son medias, existe un crucero de medias donde se sube una lista de medias. 
//    Esta lista de tripulantes del crucero es una Collection de letras. 
//    Lo que se deberá hacer, es filtrar la lista de medias que se suben al crucero y 
//    retornar una lista que contenga los grupos de medias que si tenían pares. 
//    Esta lista final de medias pares se mostraran ordenadas de menor a mayor.
//    A continuación un ejemplo: 
//    List de medias que llegan : A,B,A,B,C,A,F,Z,C,H. A,B y C tiene pares, mientras que F,Z y H no. 
//    Entonces la List que se debería retornar sería: A,B,C.
//   @param pasajeros
//   @return mediasAmigas
//	public List<String> mediasAmigas(List<String> pasajeros) {
//		Aca escribir la logica necesaria
//		return null;
//	}
}
