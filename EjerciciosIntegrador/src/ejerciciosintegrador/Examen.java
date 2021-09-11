package ejerciciosintegrador;

/**
 * @author Santiago Gonzalez
 */

public class Examen {

	public Boolean parCieloPiso(int numEnt, double numReal, long numLargo) {
		// Acá escribí la lógica necesaria
		Boolean bienMal = false;

		// numEnt
		Boolean numEntB = numEnt % 2 == 0;

		// numReal
		Boolean numRealB = (numReal % 10) < 5;

		// numLargo
		Boolean numLargoB = numLargo >= 0;

		if (numEntB && numRealB && numLargoB) {
			bienMal = true;
		}
		return bienMal;
	}
}