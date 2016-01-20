package clase2;

import java.util.Scanner;

public class TestUtil {

	public static void main(String[] args) {

		Util u = new Util();
		Scanner scan = new Scanner(System.in);

		System.out.println("Bienvenido a la calculadora de IMC");
		System.out.println("Ingrese su nombre:");

		String nombre = scan.nextLine();
		System.out.println("Hola " + nombre);

		System.out.println("Ingresa tu peso en kilogramos");
		double peso = scan.nextDouble();

		System.out.println("Ahora ingresa tu altura");
		double altura = scan.nextDouble();

		System.out.println(nombre + " tu resultado es :" + u.calcIMC(peso, altura));

	}

}
