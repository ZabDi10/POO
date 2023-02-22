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

	public Animales(String nombre) {
		iD++;
		this.nombre = nombre;
		System.out.println("El nombre es " + this.nombre);
		
	}

	public Animales(String nombre, int edad) {
		iD++;
		this.nombre = nombre;
		this.edad = edad;
		System.out.println("Mi mascota " + this.nombre + " y tiene " + this.edad + " y su ID es "+ iD);
	}

	
	

}
