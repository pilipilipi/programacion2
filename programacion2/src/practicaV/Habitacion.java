package practicaV;

public abstract class Habitacion {

	private int numero;
	private final double PRECIOBASE = 100;
	private boolean disponible;
	private static int totalHabitaciones = 0;
	private Persona persona;

	public Habitacion(int numero) {

		this.numero = numero;
		this.disponible = true;
		totalHabitaciones++;
	}

	public abstract double calcularCosteTotal();

	public void reservar(Persona persona) {
		if (disponible) {
			this.persona = persona;
			this.disponible = false;
		}
	}

	@Override
	public boolean equals(Object obj) {

		Habitacion habitacion = (Habitacion) obj;
		return this.numero == habitacion.numero;
	}

	@Override
	public String toString() {
		return "\nNúmero de habitación ***" + numero + "***\n"
				+ (disponible ? "***DISPONIBLE***" : "***NO DISPONIBLE***");
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public static int getTotalHabitaciones() {
		return totalHabitaciones;
	}

	public static void setTotalHabitaciones(int numeroHabitaciones) {
		Habitacion.totalHabitaciones = numeroHabitaciones;
	}

	public double getPRECIOBASE() {
		return PRECIOBASE;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}
