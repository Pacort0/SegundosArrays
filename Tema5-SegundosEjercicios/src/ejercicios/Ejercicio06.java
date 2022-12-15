package ejercicios;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		int num;
		int tabla[] = new int[1000];
		int veces = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < tabla.length; i++) {
			tabla[i] = (int)(Math.random()*100);
		}
		
		System.out.print("Introduzca un valor a comprobar: ");
		num = sc.nextInt();
		
		for(int i = 0; i < tabla.length; i++) {
			if(tabla[i] == num){
				veces++;
			}
		}
		if(veces == 0) {
			System.out.print("Ese número no se encuentra en la tabla");
		}
		else {
			System.out.print("Es número se encuentra en la tabla un total de " + veces + " veces");
		}
		
		sc.close();
	}

}
