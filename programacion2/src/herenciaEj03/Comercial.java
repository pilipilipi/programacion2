package herenciaEj03;

public class Comercial extends Empleado {
	
	private double comision;
	
	public Comercial(){
		super();
		this.comision = 0;
	}
	
	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}
	
	public void plus() {		
		if(this.edad > 30 && this.comision > 200) {
			this.salario += this.PLUS;
		}
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
}
