package practica1;

import java.util.Scanner;

public class Pregunta2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese un numero entero");

		int num = scan.nextInt();
		String vocal = "";

		if (num == 1) {
			vocal = "A";
		} else if (num == 2) {
			vocal = "E";
		} else if (num == 3) {
			vocal = "I";
		} else if (num == 4) {
			vocal = "O";
		} else if (num == 5) {
			vocal = "U";
		} else {
			System.out.println("Ud. ha ingresado un valor incorrecto.");
		}

		System.out.println("El resultado es : " + vocal);
	}

}
