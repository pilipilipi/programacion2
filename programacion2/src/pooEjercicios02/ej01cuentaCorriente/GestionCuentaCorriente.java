package pooEjercicios02.ej01cuentaCorriente;

public class GestionCuentaCorriente {

	public static void main(String[] args) {
		
		CuentaCorriente c1 = new CuentaCorriente("12345678W", "Paquita", 500);
		CuentaCorriente c2 = new CuentaCorriente("12345678W", 100);
		
		System.out.println("El nombre del titular de la cuenta1 es " + c1.nombre);
		
		c1.sacarDinero(100);		
		System.out.println("El saldo de c1 es " + c1.saldo);
		
		c1.ingresarDinero(1000);
		System.out.println("El saldo de c1 despues de ingresar es " + c1.saldo + " " + c1.dni + " " + c1.nombre);
		
		c1.sacarDinero(2100);
		
		c2.ingresarDinero(300);
		System.out.println("El saldo de c2 es " + c2.saldo + " " + c1.dni + " " + c2.nombre);
		
	}

}
