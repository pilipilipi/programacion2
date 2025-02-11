package herenciaEj03;

public abstract class Empleado {
	
	protected String nombre;
	protected int edad;
	protected double salario;
	protected final int PLUS = 300;
	
	public Empleado() {
		this.nombre = "Empleado";
		this.edad = 0;
		this.salario = 600;
	}
	
	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	public abstract void plus();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
