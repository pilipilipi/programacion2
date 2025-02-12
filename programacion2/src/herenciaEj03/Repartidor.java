package herenciaEj03;

public class Repartidor extends Empleado {

	private String zona;

	public Repartidor() {
		super();
		this.zona = "centro";
	}

	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}

	public void plus() {
		if (this.edad < 25 && this.zona.equalsIgnoreCase("zona 3")) {
			this.salario += this.PLUS;
		}
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
}
