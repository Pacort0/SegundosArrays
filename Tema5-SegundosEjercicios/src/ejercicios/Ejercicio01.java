package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		int tam;
		double valor;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduzca el tamaño de la tabla: ");
		tam = sc.nextInt();
		System.out.print("Introduzca un valor para cada celda de la tabla: ");
		valor = sc.nextDouble();
		
		double tabla[] = new double [tam];
		Arrays.fill(tabla, valor);
		
		System.out.println(Arrays.toString(tabla));
		
		sc.close();
	}

}
