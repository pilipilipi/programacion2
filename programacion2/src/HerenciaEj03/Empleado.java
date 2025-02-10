package HerenciaEj03;

public class Empleado {
	
	protected String nombre;
	protected int edad;
	protected double salario;
	protected final int PLUS = 300;
	
	private Empleado() {
		this.nombre = "Empleado";
		this.edad = 0;
		this.salario = 600;
	}
	
	private Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
}
