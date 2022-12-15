package ejercicios;

import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		int tabla[];
		int contador = 10;
		int tam = 0;
		
		for(int i = 1; i <=contador; i++) {
			tam = i;
			tabla = new int[tam];
			Arrays.fill(tabla, i);
			System.out.print(Arrays.toString(tabla));
			System.out.println();
		}
	}

}
