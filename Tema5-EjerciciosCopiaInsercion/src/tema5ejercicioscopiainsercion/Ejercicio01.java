package tema5ejercicioscopiainsercion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		int list[] = new int[15];
		int lastNum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca 15 números: ");
		
		for (int i = 0 ; i < list.length ; i++) {
			
			list[i] = sc.nextInt();
			
		}
		
		lastNum = list[list.length-1];
		
		System.arraycopy(list, 0, list, 1, list.length - 1);
		
		list[0] = lastNum;
		
		System.out.println(Arrays.toString(list));

		sc.close();
		
	}

}
