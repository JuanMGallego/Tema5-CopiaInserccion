package tema5ejercicioscopiainsercion;

import java.util.Arrays;

public class Ejercicio02opt {

	public static void main(String[] args) {
		
		int list[] = new int[20];
		int num;
		int imp = list.length - 1;
		int par = 0;
		
		for (int i = 0 ; i < list.length ; i++) {
			
			num = (int) (Math.random()*101);
			
			if (num % 2 == 0) {
				
				list[par] = num;
				par++;
				
			} else {
				
				list[imp] = num;
				imp--;
						
			}
			
		}
		
		System.out.println("Tabla con pares a la derecha e impares a la izquierda: ");
		System.out.println(Arrays.toString(list));

	}

}
