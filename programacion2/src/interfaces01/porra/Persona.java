package interfaces01.porra;

public class Persona {

	private String nombre;
	private int dinero;

	public Persona(String nombre) {

		this.nombre = nombre;
		dinero = 100;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
}
