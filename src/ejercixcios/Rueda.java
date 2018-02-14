package ejercixcios;

public class Rueda {

	private String tipo;
	private double grosor;
	private double diametro;
	private String marca;
	
	public Rueda( String tipo,double grosor,double diametro, String marca) {
		this.tipo = tipo;
		this.diametro = diametro;
		this.grosor = grosor;
		this.marca = marca;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getGrosor() {
		return grosor;
	}
	public void setGrosor(double grosor) {
		this.grosor = grosor;
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	public void comprobarDimensiones(){
		String resultado;
		if (this.diametro > 1.4) {
			if (this.grosor < 0.4) {
				resultado = "La rueda es para un vehículo grande y el grosor es inferior al recomendado";
			}
			else {
				resultado = "La rueda es para un vehículo grande";
			}
		}
		else if (this.diametro <= 1.4 && this.diametro > 0.8 ) {
			if (this.grosor < 0.25) {
				resultado = "La rueda es para un vehículo mediano y el grosor es inferior al recomendado";
			}
			else {
				resultado = "La rueda es para un vehículo mediano";
			}
		}
		else {
			resultado = "La rueda es para un vehículo pequeño";
		}
	
		System.out.println(resultado);
		
	}
	
	
	
	
}
