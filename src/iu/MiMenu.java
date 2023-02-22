package iu;

import java.util.Scanner;

public class MiMenu {
	
	
	
	static public void mostrarMenu() {
	int opcion;
	do {
		System.out.println("Menú +Cotas");
		System.out.println("1. Alta");
		System.out.println("2. Baja");
		System.out.println("3. Salir");
		System.out.print("Tú opciones -> ");
		opcion = new Scanner(System.in).nextInt();
		switch (opcion) {
		case 1-> {
			System.out.println("Es un alta");
			}
		case 2-> {
			System.out.println("Es una baja");
			}
		case 3-> {
			System.out.println("Hasta luego Lucas....");
			}
		default -> System.out.println("Opcion erronea");
		}
		
	} while(opcion != 3);
	
}
}