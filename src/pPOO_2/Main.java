package pPOO_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p = new Persona();
		p.edad=18;
		p.nombre = "Carmen Alicia";
		p.estatura = 1.56;
		p.saludar();
		p.cumplirAños();
		System.out.println("Cuando cumplas años tendras " + p.edad);
		System.out.println("¿Cuanto has crecido? -> ");
		double incremento = new Scanner(System.in).nextDouble();
		p.crecer(incremento);
		System.out.println("Mides ahora -> " + p.estatura);
		
		//Esto para metodos constructores
		Persona persona = new Persona("Pepe", 20, 1.90); // se lo pasamos a las funciones de persona	
		
	}

}
