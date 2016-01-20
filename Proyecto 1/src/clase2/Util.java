package clase2;

public class Util {

	public double calAreaTriangulo(double base, double altura) {
		return base * altura / 2;
	}

	public String calcIMC(double peso, double altura) {

		double imc = peso / Math.pow(altura, 2);

		String resultado = "";

		if (imc < 16) {
			resultado = "Infrapeso: Delgadez Severa";
		} else if (imc >= 16 && imc <= 16.99) {
			resultado = "Infrapeso: Delgadez Moderada";
		} else if (imc >= 17 && imc <= 18.49) {
			resultado = "Infrapeso: Delgadez Aceptable";
		} else if (imc >= 18.5 && imc <= 24.99) {
			resultado = "Peso Normal";
		} else {
			resultado = "Sobrepeso";
		}

		return resultado;
	}

}
