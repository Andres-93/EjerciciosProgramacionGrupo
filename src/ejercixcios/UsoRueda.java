package ejercixcios;

public class UsoRueda {

	public static void main(String[] args) {
		
		Rueda rueda1 = new Rueda("Redonda",0.2,1.9,"MICHELIN");
		Rueda rueda2 = new Rueda("Redonda",0.21,1.2,"PIRELLI");
		Rueda rueda3 = new Rueda("Redonda",0.22,0.7,"CONTINENTAL");
		Rueda rueda4 = new Rueda("Redonda",0.5,1.7,"GOODYEAR");
		
		rueda1.comprobarDimensiones();
		rueda2.comprobarDimensiones();
		rueda3.comprobarDimensiones();
		rueda4.comprobarDimensiones();
		

	}

}
