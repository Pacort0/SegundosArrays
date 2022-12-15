package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		int ranking[] = new int [8];
		int  contador = 1;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < ranking.length; i++) {
			System.out.print("Introduzca el nivel de habilidad del " + (i+1)+ "º jugador: ");
			ranking[i] = sc.nextInt();
		}
		Arrays.sort(ranking);
		
		for(int i = ranking.length - 1; i >=0; i--){
			System.out.println("El " + contador + "º jugador según su índice de habilidad tiene " + ranking[i] + " puntos.");
			contador++;
		}
		sc.close();
	}

}

