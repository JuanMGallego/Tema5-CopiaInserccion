package tema5ejercicioscopiainsercion;

import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		int list[] = new int[20];
		int par[] = new int[0];
		int imp[] = new int[0];
		
		for (int i = 0 ; i < list.length ; i++) {
			
			list[i] = (int) (Math.random()*100 + 1);
			
		}
		
		for (int i = 0 ; i < list.length ; i++) {
			
			if (list[i] % 2 == 0) {
				
				par = Arrays.copyOf(par, par.length + 1);
				par[par.length - 1] = list[i];
				
			} else {
				
				imp = Arrays.copyOf(imp, imp.length + 1);
				imp[imp.length - 1] = list[i];
				
			}
			
		}
		
		System.arraycopy(par , 0 , list , 0 , par.length);
		System.arraycopy(imp, 0, list, par.length , imp.length);
		System.out.println("Tabla con pares a la derecha e impares a la izquierda: ");
		System.out.println(Arrays.toString(list));

	}

}
