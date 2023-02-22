package pPOO_2;

public class Persona {
	String nombre;
	int edad;
	double estatura;
	
	public void saludar() {
		System.out.println("Hola. Mi nombre es: "+ nombre);
		System.out.println("Encantado de conocerte");
	}
	
	public void cumplirAños() {
		edad++;
	}
	
	public void crecer(double incremento) {
		estatura += incremento;
	}

	public Persona(String nombre) {
		
		this.nombre = nombre;
		System.out.println("El nombre de la persona es: " + this.nombre);
	}

	public Persona(String nombre, int edad, double estatura) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}

	public Persona() {
		super();
	}
	
	
	
}
