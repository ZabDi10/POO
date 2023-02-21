package pPOO_2;

public class Persona {
	String nombre;
	byte edad;
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
	
}
