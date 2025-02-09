package herenciaEj01.ej01persona;

public class Empleado extends Persona {
	
	private int numeroEmp;
	private String departamento, puesto;
	
	public Empleado(){
		super();
	}
	
	public Empleado(int edad, String sexo, int numeroEmp, String departamento, String puesto) {
		super(edad, sexo);
		this.numeroEmp = numeroEmp;
		this.departamento = departamento;
		this.puesto = puesto;
	}

	public int getNumeroEmp() {
		return numeroEmp;
	}

	public void setNumeroEmp(int numeroEmp) {
		this.numeroEmp = numeroEmp;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return super.toString() + "Empleado [numeroEmp=" + numeroEmp + ", departamento=" + departamento + ", puesto=" + puesto + "]";
	}	
	
	
}
