package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int tabla1[] = new int [10];
		int tabla2[] = new int [10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int j = 0; j < tabla1.length; j++) {
			System.out.print("Introduzca un valor: ");
			tabla1[j] = sc.nextInt();
		}
		for(int k = 0; k < tabla2.length; k++) {
			System.out.print("Introduzca un valor: ");
			tabla2[k] = sc.nextInt();
		}
		
		System.out.println(Arrays.equals(tabla1, tabla2));
		sc.close();
	}

}
