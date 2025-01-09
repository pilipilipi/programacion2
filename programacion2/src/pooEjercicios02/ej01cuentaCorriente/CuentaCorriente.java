package pooEjercicios02.ej01cuentaCorriente;

public class CuentaCorriente {

	String dni, nombre;
	double saldo;
	
	public CuentaCorriente() {

	}
	
	public CuentaCorriente(String d, double s) {
		dni = d;
		saldo = s;
	}

	public CuentaCorriente(String d, String n, double s) {
		dni = d;
		nombre = n;
		saldo = s;
	}

	public void sacarDinero(double dineroRetirado) {
		if (saldo >= dineroRetirado) {
			saldo -= dineroRetirado;
			System.out.println("Operación realizada");

		} else {
			System.out.println("Operación denegada");
		}
	}

	public void ingresarDinero(double dineroIngresado) {
		saldo += dineroIngresado;
	}
}
