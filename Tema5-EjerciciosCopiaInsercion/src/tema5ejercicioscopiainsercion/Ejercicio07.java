package tema5ejercicioscopiainsercion;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		int list[] = new int[10];
		
		int value;
		int position;
		
		String select = "x";
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0 ; i < list.length ; i++) {
			
			list[i] = (int) (Math.random()*100 + 1);
			
		}
		
		while (!select.equals("c")) {
			
			System.out.println("-- La lista ha sido creada correctamente --");
			System.out.println();
			System.out.println("Menú (Introduzca la letra por teclado)");
			System.out.println("a. Mostrar valores");
			System.out.println("b. Introducir valores");
			System.out.println("c. Salir");
			System.out.println();
			
			select = sc.nextLine();
			
			switch (select) {
				
				case "a":
			
					System.out.println(Arrays.toString(list));
					System.out.println();
					
					break;
				
				case "b":
				
					System.out.println();
					System.out.print("Introduzca un valor para introducir en la lista: ");
					
					value = sc.nextInt();
					
					System.out.println();
					System.out.print("Introduzca la posición donde introducirlo: ");
					
					position = sc.nextInt();
					
					System.out.println();
					
					list = Arrays.copyOf(list, list.length + 1);
					
					System.arraycopy(list, position, list, position + 1, list.length - position - 1);
					
					list[position] = value;
					
					break;
				
				case "c":
					
					System.out.println("-- Programa finalizado --");
					
					break;
				
				default:
					
					System.out.println("ERROR: No ha introducido una opción válida");
			}
			
		}
		
		sc.close();

	}

}
