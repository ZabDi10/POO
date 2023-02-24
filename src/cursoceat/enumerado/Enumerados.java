package cursoceat.enumerado;

import java.util.Scanner;

public class Enumerados {

	enum Talla {

		MINI("S"), MEDIANO("M"), GRANDE("L"), MUYGRANDE("XL"), ENORME("XXL");

		private String abreviatura;

		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;

		}

		public String getAbreviatura() {
			return abreviatura;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime la talla mini, mediano, gande, muygrande, enorme");
		String talla = sc.nextLine().toUpperCase();
		Talla laTalla=Enum.valueOf(Talla.class,talla);
		System.out.println("La talla es: " + talla);
		System.out.println("La percha es: " + laTalla.getAbreviatura() );
		
		
	}

}
