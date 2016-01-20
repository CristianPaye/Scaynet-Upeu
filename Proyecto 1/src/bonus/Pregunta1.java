package bonus;

import java.util.Scanner;

public class Pregunta1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un numero entero");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
		
			System.out.println(i *2 -1 );
		}

	}

}



