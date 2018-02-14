package ejercixcios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		
		int limitInf = 0;
		int limitSup = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("INTRODUCE EL PRIMERO LIMITE: ");
		int limit1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("INTRODUCE EL SEGUNDO LIMITE: ");
		int limit2 = Integer.parseInt(sc.nextLine());
		
		if ( limit1 > limit2) {
			 limitSup = limit1;
			 limitInf = limit2;
			 
			 while(limitInf <= limitSup) {
				 
				 if (limitInf % 3 == 0) {
					 
					 System.out.println(" " + limitInf);
										 
				 }
				 limitInf++;			 
			 }		 
		}
		else {
			limitSup = limit2;
			limitInf = limit1;
			
			while ( limitInf <= limitSup) {
				
				if (limitInf % 3 == 0) {
					 
					 System.out.println(" " + limitInf);
										 
				 }
				 limitInf++;				
			}		
		}
		
		
		
		sc.close();

	}

}
