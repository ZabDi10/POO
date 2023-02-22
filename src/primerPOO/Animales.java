package primerPOO;

public class Animales {

	// Atributos
	String nombre;
	static int iD;
	int edad;

	// Metodos
	public void mostrarNombre() {
		System.out.println(nombre);
	}

	public void mostrarCaracteristicas(String nombString, int edad, int iD) {
		System.out.println("Mi animal se llama " + nombString + " tiene " + edad + " años y su ID es: " + iD);
	}

	public Animales() {// Es un metodo constructor. Es decir al llamar a la clase se ejecuta la funcion
						// a la vez
		iD++;
	}
}
