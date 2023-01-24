package tema5ejercicioscopiainsercion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {

	static boolean esPrimo(int n) {

		boolean esPrimo = true;
		
		if (n == 0 || n == 1) {
			
			esPrimo = false;
			
		} else {
			
			for (int i = 2; i < n; i++) {
				
				if (n % i == 0) {
					
					esPrimo = false;
					break;

				}

			}
			
		}

		return esPrimo;

	}

	public static void main(String[] args) {

		int list[] = new int[10];
		int prim[] = new int[0];
		int notPrim[] = new int[0];

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca 10 números: ");

		for (int i = 0; i < list.length; i++) {

			list[i] = sc.nextInt();

		}

		System.out.println();

		for (int i = 0; i < list.length ; i++) {

			if (esPrimo(list[i])) {

				prim = Arrays.copyOf(prim, prim.length + 1);
				prim[prim.length - 1] = list[i];

			} else {

				notPrim = Arrays.copyOf(notPrim, notPrim.length + 1);
				notPrim[notPrim.length - 1] = list[i];

			}

		}

		System.arraycopy(prim, 0, list, 0, prim.length);
		System.arraycopy(notPrim, 0, list, prim.length, notPrim.length);

		System.out.println("Tabla con primos a la izquierda y no primos a la derecha: ");
		System.out.println(Arrays.toString(list));

		sc.close();

	}

}
