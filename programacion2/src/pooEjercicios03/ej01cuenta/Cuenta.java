package pooEjercicios03.ej01cuenta;

public class Cuenta {
	
	String titular;
	double cantidad;
	
	
	public Cuenta(String titular) {
		this.titular = titular;
	}
	
	public Cuenta(String titular, int cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	
	public double ingresar(double cantidad) {
		
		if(cantidad <= 0) {
			System.out.println("Cantidad incorrecta");
			
		} else {
			this.cantidad += cantidad;
			System.out.println("Cantidad ingresada");
		}

		return this.cantidad;
	}
	
	
	public double retirar(double cantidad) {
		
		if (cantidad >= this.cantidad) {
			System.out.println("Dinero retirado");
			this.cantidad = 0;
			
		} else {
			this.cantidad -= cantidad;
			System.out.println("Dinero retirado");
		}
		
		return this.cantidad;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getCantidad() {
		return cantidad;
	}


	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}	
	
}
