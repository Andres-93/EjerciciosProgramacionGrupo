package ejercixcios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
int cont = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el numero:");
		int num = Integer.parseInt(sc.nextLine());
		
		for(int i = 2; i <= num ; i++) {
			
			for ( int j = 1; j <= i ; j++){
				
				if (i%j == 0) {
					cont++;
				}								
		}	
			if (cont == 2) {
				System.out.println(i);
			}
		cont = 0;
		
		}
		sc.close();
		

	}

}
