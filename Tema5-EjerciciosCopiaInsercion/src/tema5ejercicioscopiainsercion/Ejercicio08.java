package tema5ejercicioscopiainsercion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		int initValue;
		int increment;
		int arrayLength;
		int secuence[] = new int[1];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-- PROGRAMA PARA CREAR SECUENCIAS ARITMÉTICAS --");
		System.out.println();
		System.out.print("Introduzca el valor inicial: ");
		initValue = sc.nextInt();
		System.out.print("Introduzca el incremento: ");
		increment = sc.nextInt();
		System.out.print("Introduzca el número de valores a crear: ");
		arrayLength = sc.nextInt();
		System.out.println();
		
		secuence[0] = initValue;
		
		for (int i = 1; i < arrayLength - 1; i++) {
			
			secuence = Arrays.copyOf(secuence, secuence.length + 1);
			
			secuence[i] = secuence[i-1] + increment;
			
		}

		System.out.println(Arrays.toString(secuence));
		
		sc.close();
		
	}

}
