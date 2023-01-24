package tema5ejercicioscopiainsercion;

import java.util.Arrays;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		int listaOrdenada[] = new int[100];
		int listaInversa[] = new int[listaOrdenada.length];
		int cont = 0;
		

		for (int i = 0 ; i < listaOrdenada.length ; i++) {
			
			listaOrdenada[i] = i + 1;
			
		}
		
		for (int i = listaOrdenada.length - 1 ; i > -1 ; i--) {
			
			listaInversa[i] = listaOrdenada[cont++];
			
		}
		
		System.out.println();
		System.out.print("Tabla Ordenada:  ");
		System.out.println(Arrays.toString(listaOrdenada));
		System.out.print("Tabla Inversa: ");
		System.out.print(Arrays.toString(listaInversa));
		
	}

}
