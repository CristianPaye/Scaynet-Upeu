package clase2;

public class Repaso {

	public static void main(String[] args) {

		Repaso r = new Repaso();

		int a = 25;
		int b = 144;

		/**
		 * Suma + Resta - Multiplicacion * Division / Modulo % Clase para ayuda
		 * Matematica "Math"
		 */

		// Esta instruccion me sirve para imprimir en la consola
		System.out.println("La suma es: " + r.sumar(a, b));

		System.out.println("Operaciones Logicas");

		/**
		 * And && Or || Alt + 124 Negacion !
		 */

		System.out.println(!true);

		System.out.println("Calculando el IGV");
		System.out.println("IGV: " + r.calcIGV(100));

		System.out.println("Calculando el IMC:");
		System.out.println("Su IMC es: " + r.calcIMC(85, 1.72));

	}

	public int sumar(int sum1, int sum2) {

		return sum1 + sum2;
	}

	public double calcIGV(double monto) {
		double igv = 18;

		return monto * igv / 100;
	}

	public double calcIMC(double peso, double altura) {
		return peso / Math.pow(altura, 2);
	}

}
