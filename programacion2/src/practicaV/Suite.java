package practicaV;

public class Suite extends Habitacion {

	private int numeroEspacios;
	private boolean jacuzzi;

	public Suite(int numero, int numeroEspacios, boolean jacuzzi) {
		super(numero);
		this.numeroEspacios = numeroEspacios;
		this.jacuzzi = jacuzzi;
	}

	@Override
	public double calcularCosteTotal() {
		double precio = super.getPRECIOBASE() * 1.35;
		if (jacuzzi) {
			precio *= 1.10;
		}
		return precio;
	}

	@Override
	public String toString() {
		return super.toString() + "\nNúmero de espacios: " + numeroEspacios + "\nJacuzzi: " + (jacuzzi ? "Sí" : "No");
	}

	public int getNumeroEspacios() {
		return numeroEspacios;
	}

	public void setNumeroEspacios(int numeroEspacios) {
		this.numeroEspacios = numeroEspacios;
	}

	public boolean isJacuzzi() {
		return jacuzzi;
	}

	public void setJacuzzi(boolean jacuzzi) {
		this.jacuzzi = jacuzzi;
	}

}
