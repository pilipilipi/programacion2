package herenciaEj04;

public class Coche extends Vehiculo {

	private String color;
	private int nPasajeros;
	private boolean esDescapotable;

	public Coche() {

		super();
		this.color = "gris";
		this.nPasajeros = 5;
		this.esDescapotable = false;

	}

	public Coche(int año, int autonomia, String marca, String matricula, String color, int nPasajeros,
			boolean esDescapotable) {

		super(año, autonomia, marca, matricula);
		this.color = color;
		this.nPasajeros = nPasajeros;
		this.esDescapotable = esDescapotable;
	}
	
	public void pintar(String color) {
		this.color = color;
		System.out.println("Nuevo color: " + this.color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getnPasajeros() {
		return nPasajeros;
	}

	public void setnPasajeros(int nPasajeros) {
		this.nPasajeros = nPasajeros;
	}

	public boolean isEsDescapotable() {
		return esDescapotable;
	}

	public void setEsDescapotable(boolean esDescapotable) {
		this.esDescapotable = esDescapotable;
	}

	@Override
	public String toString() {
		return super.toString() + "Coche [color=" + color + ", nPasajeros=" + nPasajeros + ", esDescapotable=" + esDescapotable + "]";
	}
	
}
