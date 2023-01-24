package tema5ejercicioscopiainsercion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		
		int tablaEnteros[] = new int[10];
		int numPares[] = new int[0];
		int numImpares[] = new int[0];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca 10 valores: ");
		
		for (int i = 0 ; i < tablaEnteros.length ; i++) {
			
			tablaEnteros[i] = sc.nextInt();
			
		}
		
		for (int i = 0 ; i < tablaEnteros.length ; i++) {
			
			if (tablaEnteros[i] % 2 == 0) {
				
				numPares = Arrays.copyOf(numPares, numPares.length + 1);
				numPares[numPares.length - 1] = tablaEnteros[i];
				
			} else {
				
				numImpares = Arrays.copyOf(numImpares, numImpares.length + 1);
				numImpares[numImpares.length - 1] = tablaEnteros[i];
				
			}
			
		}
		
		System.out.println();
		System.out.print("Tabla pares:  ");
		System.out.println(Arrays.toString(numPares));
		System.out.print("Tabla impares: ");
		System.out.print(Arrays.toString(numImpares));
		
		sc.close();

	}

}
