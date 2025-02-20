package practicaV;

public class Estandar extends Habitacion {

	private boolean desayuno;
	private Camas numeroCamas;

	public Estandar(int numero, boolean desayuno, Camas numeroCamas) {
		super(numero);
		this.desayuno = desayuno;
		this.numeroCamas = numeroCamas;
	}

	@Override
	public double calcularCosteTotal() {
		double precio = super.getPRECIOBASE() * 1.10;
		if (desayuno) {
			precio += 5;
		}
		return precio;
	}

	public boolean isDesayuno() {
		return desayuno;
	}

	public void setDesayuno(boolean desayuno) {
		this.desayuno = desayuno;
	}

	public Camas getNumeroCamas() {
		return numeroCamas;
	}

	public void setNumeroCamas(Camas numeroCamas) {
		this.numeroCamas = numeroCamas;
	}

	@Override
	public String toString() {
		return super.toString() + "\nDesayuno: " + (desayuno ? "Sí" : "No") + "\nNúmero de camas: " + numeroCamas;
	}

}
