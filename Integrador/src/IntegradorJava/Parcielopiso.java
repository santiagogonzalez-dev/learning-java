package IntegradorJava;

/**
 * @author Santiago Gonzalez
 **/

public class Parcielopiso {

    public static void main(String[] args) {
		Examen examen = new Examen();
		Boolean verdaderoFalso = false;
//		System.out.println(examen.parCieloPiso(2, 2.9, 6));
		double numeroAuxiliar = 0;
		numeroAuxiliar = examen.firstDigit(2.9);
		System.out.println(numeroAuxiliar);
    }
}
/*
La función recibirá tres numéros:

numEnt, de tipo int
numReal, de tipo double
numLargo, de tipo long
y deberá devolver true si se cumplen todas las siguientes condiciones:

numEnt es par
numReal está próximo a su valor entero anterior. Por ejemplo, 1.4 SÍ está próximo a 1; 43.9 NO está próximo a 43; 123.5 NO está próximo a 123.
numLargo es positivo o es igual a cero
Resultados esperados:

Si se ingresan los números 4, 1.4, 6 deberá devolver true.
Si se ingresan los números 2, 1.49999, 77 deberá devolver true.
Si se ingresan los números 10000, 1, 123 deberá devolver true.
Si se ingresan los números 1, 10, 6 deberá devolver false.
Si se ingresa los números 2, 2.9, 6 deberá devolver false.
Si se ingresan los números 2, 2, -3 deberá devolver false.
*/
// Segundo ejercicio
/*
Es decir, si la palabra es:

"Hola"-> "Hopolapa"
"Casa"-> "Capasapa"
"Perro"-> "Peperropo"
"Carpincho"-> "Caparpipinchopo"
En síntesis, debemos añadir después de cada vocal las letras p + {{vocal}}, siendo esa vocal igual a la hallada. Por ejemplo, si encontramos la vocal "o", añadiremos la sílaba "po".

Resultados esperados:

Si se ingresa la palabra hola deberá devolver hopolapa.
Si se ingresa la palabra qwrty deberá devolver qwrty.
Si se ingresa la palabra a deberá devolver apa.
Si se ingresa la palabra gato deberá devolver gapatopo.
*/
// Tercer ejercicio
/*
Por ejemplo:

"Hola" -> "aloh"
"PeRrO" -> "orrep"
Resultados esperados:

Si se ingresa la palabra ?otag deberá devolver la palabra gato?.
Si se ingresa la palabra aaaa deberá devolver la palabra aaaa.
Si se ingresa la palabra raton deberá devolver la palabra notar.
Si se ingresa la palabra aAaAaA deberá devolver la palabra aaaaaa.
Si se ingresa la palabra Hola deberá devolver la palabra aloh.
*/