package bonus;

import java.util.Scanner;

public class Pregunta2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner leer = new Scanner(System.in);	
		
		int limite;
		System.out.println("ingrese un numero");
		limite = leer.nextInt();
		
		for(int i=1;i<limite;i++) {
			int count=0;
		for(int j=1;j<=i;j++) {
			
			if (i%j==0) 
			count++;
		}
		if(count==100)
			System.out.println(i);
		}
	
	}
	

}
