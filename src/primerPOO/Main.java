package primerPOO;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instaranciar la clase. Declarar miAnimal como un objeto de la clase Animales
		Animales miAnimales = new Animales();
		miAnimales.nombre="Misifu";
		
		miAnimales.iD=1;
		miAnimales.edad=14;
		miAnimales.mostrarNombre();
		miAnimales.mostrarCaracteristicas(miAnimales.nombre, miAnimales.edad, miAnimales.iD);
		miAnimales.nombre="Guffi";
	}

}
