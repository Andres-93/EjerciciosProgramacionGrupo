package ejercixcios;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio2 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int aleatorio = 0;
		
		Random rd = new Random();
		
		System.out.println("Introduzca el limite deseado: ");
		int limite = Integer.parseInt(sc.nextLine());
		
		do {
			//rd.nextInt(Mayor-menor) + menor.
			aleatorio = rd.nextInt(limite);		
				
		}while(aleatorio % 7 != 0 );
		
		System.out.println("El aleatorio es " + aleatorio);
		
		sc.close();

	}

	
}
