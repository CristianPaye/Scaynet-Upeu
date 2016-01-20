package clase2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Repaso r = new Repaso();

		/**
		 * Para ingresar datos desde el teclado scan es el objeto
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese su peso en Kg.");

		double peso = scan.nextDouble();

		System.out.println("Ingrese su altura en Metros");
		double altura = scan.nextDouble();

		System.out.println("Su IMC es: " + r.calcIMC(peso, altura));

	}

}
