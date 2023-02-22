package primerPOO;
import static iu.MiMenu.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instaranciar la clase. Declarar miAnimal como un objeto de la clase Animales
		Animales miAnimales = new Animales();
		miAnimales.nombre="Misifu";
		
		
		miAnimales.edad=14;
		miAnimales.mostrarNombre();
		miAnimales.mostrarCaracteristicas(miAnimales.nombre, miAnimales.edad, Animales.iD);
		Animales miAnimales2 = new Animales();
		
		miAnimales2.nombre="Guffi";
		miAnimales2.edad = 34;
		miAnimales2.mostrarNombre();
		miAnimales2.mostrarCaracteristicas(miAnimales2.nombre, miAnimales2.edad, miAnimales2.iD);
		mostrarMenu();
		
	}

}
