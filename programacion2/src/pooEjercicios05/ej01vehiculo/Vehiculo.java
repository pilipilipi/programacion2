package pooEjercicios05.ej01vehiculo;

public class Vehiculo {
	
	private String marca, modelo;
	private double velocidadMax;
	
	public Vehiculo () {
		
		this.marca = "Generica";
		this.modelo = "Base";
		this.velocidadMax = 100.0;
	}
	
	
	public Vehiculo (String marca) {
		
		this.marca = marca;
	}
	
	
	public Vehiculo (String marca, String modelo, double velocidadMax) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.velocidadMax = velocidadMax;
	}
	
	
	public double acelerar(double incremento) {
		
		if(incremento > this.velocidadMax * 0.5) {		
			System.out.println("aceleración excesiva");
			
		} 
		
		this.velocidadMax += incremento;
		
		if(this.velocidadMax > 300.0) {
			
			this.velocidadMax -= incremento;
			System.out.println("Se han superado los 300 km/h!!! no es posible acelerar");
		}
		
		return this.velocidadMax;
	}
	
	
	public double detener() {
		
		System.out.println("El vehiculo se ha detenido");
		this.velocidadMax = 0;
		return this.velocidadMax;
	}
	
	
	public boolean esIgual(Vehiculo v){
		
		if (v.marca == this.marca && v.modelo == this.modelo && Math.abs(v.velocidadMax - this.velocidadMax) < 5) {			
			return true;
			
		} else {
			return false;
		}

	}
	
	
	public boolean esIgual(String marca, String modelo, double velocidadMax){
		
		if (marca == this.marca && modelo == this.modelo && Math.abs(velocidadMax - this.velocidadMax) < 5) {			
			return true;
			
		} else {
			return false;
		}
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public double getVelocidadMax() {
		return velocidadMax;
	}


	public void setVelocidadMax(double velocidadMax) {
		this.velocidadMax = velocidadMax;
	}
	
	
	
}


	




































