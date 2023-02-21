package primerPOO;

public class Animales {

	// Atributos
	String nombre;
	int iD;
	int edad;

	// Metodos
	public void mostrarNombre() {
		System.out.println(nombre);
	}

	public void mostrarCaracteristicas(String nombString, int edad, int iD) {
		System.out.println("Mi animal se llama " + nombString + "Tiene " + edad + "años y su ID es :" + iD);
	}
}
