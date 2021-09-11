package IntegradorJava;

/**
 * @author Santiago Gonzalez
 */
public class Examen {

//	public Boolean parCieloPiso(int numEnt, double numReal, long numLargo) {
//		// Acá escribí la lógica necesaria
//		Boolean numEntB = false;
//		Boolean numRealB = false;
//		Boolean numLargoB = false;
//		Boolean bienMal = false;
//
//		// numEnt
//		if (numEnt % 2 == 0) {
//			numEntB = true;
//		} else {
//			numEntB = false;
//		}
//
//		// numReal
//		if ((numReal % 10) < 5) {
//			numRealB = true;
//		} else {
//			numRealB = false;
//		}
//
//		// numLargo
//		if (numLargo >= 0) {
//			numLargoB = true;
//		} else {
//			numLargoB = false;
//		}
//
//		if (numEntB && numRealB && numLargoB) {
//			bienMal = true;
//		}
//		return bienMal;
//	}
	public static double firstDigit(double n){
		while (n >= 10)
			n /= 10;
		return n;
	}
}
