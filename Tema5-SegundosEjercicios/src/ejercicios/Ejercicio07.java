package ejercicios;

import java.util.Arrays;

public class Ejercicio07 {

	public static void main(String[] args) {
		int apuesta[] = new int[6];
		int acierto[] = new int [6];
		int coincidencias = 0;
		
		for(int i = 0; i < (apuesta.length); i++) {
			apuesta[i] = (int)(Math.random()*(49 - 1) + 1); 
			acierto[i] = (int)(Math.random()*(49 - 1) + 1);
		}

		Arrays.sort(acierto);
		
		if(Arrays.equals(apuesta, acierto)) {
			System.out.print("¡ENHORABUENA! Ha ganado usted la lotería.");
		}
		else {
			System.out.println("Lo sentimos, ha perdido.");
			
			for(int i = 0; i < acierto.length; i++) {
				int posicion = Arrays.binarySearch(acierto, apuesta[i]);
				if(posicion >= 0) {
					coincidencias++;
				}
			}
		}
			if(coincidencias != 0) {
				System.out.print("Sin embargo, ha acertado " + coincidencias + " números.");
			}
			else {
				System.out.print("Pero es que no has dado ni una.");
			}
		}
}

