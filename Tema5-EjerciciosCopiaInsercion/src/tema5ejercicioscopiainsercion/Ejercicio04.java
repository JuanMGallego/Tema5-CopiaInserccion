package tema5ejercicioscopiainsercion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		int tablaEnteros[] = new int[10];
		int tablaFinal[] = new int[0];
		int posTabFin = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca 10 números: ");

		for (int i = 0 ; i < tablaEnteros.length; i++) {

			tablaEnteros[i] = sc.nextInt();

		}

		System.out.println();
		
		Arrays.sort(tablaEnteros);

		for(int i = 0 ; i < tablaEnteros.length; i++){
            
			if(i == 0 || tablaEnteros[i] != tablaEnteros[i - 1]){
            	
                tablaFinal = Arrays.copyOf(tablaFinal, tablaFinal.length + 1);
                tablaFinal[posTabFin++] = tablaEnteros[i];
                
            }
			
	    }
		 
		System.out.print("La tabla sin números repetidos es: ");
		System.out.print(Arrays.toString(tablaFinal));
		
		sc.close();
		
	}

}
