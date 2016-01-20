package practica1;

import java.util.Scanner;

public class Pregunta1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese el monto total de venta:");

		double monto = scan.nextDouble();

		double bonificacion = 0;

		if (monto < 1000) {
			bonificacion = 0;
		} else if (monto < 5000) {
			bonificacion = monto * 3 / 100;
		} else if (monto < 20000) {
			bonificacion = monto * 5 / 100;
		} else if (monto > 20000) {
			bonificacion = monto * 8 / 100;
		} else {
			System.out.println("Ingrese un monto valido");
		}

		System.out.println("Su bonificacion es de :" + bonificacion);

	}

}
