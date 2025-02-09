package practicaVI;

public class Cine {

	private String nombre, ubicacion;
	private Sala[] salas = new Sala[4];

	public Cine() {

		this.nombre = "predeterminado";
		this.ubicacion = "calle jara, numero 1";
	}

	public Cine(String nombre, String ubicacion) {

		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}

	public Cine(String nombre, String ubicacion, Sala[] salas) {

		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.salas = salas;
	}

	public Sala buscarSalaPorNumero(int numeroSala) {
		for (int i = 0; i < salas.length; i++) {
			if (salas[i].getNumeroSala() == numeroSala) {
				return salas[i];
			}
		}
		return null;
	}

	public void mostrarCartelera() {
		System.out.println("Peliculas en proyeccion:");

		for (int i = 0; i < salas.length; i++) {
			System.out.println(salas[i].getPeliculaEnProyeccion());
		}
	}

	public int verificarCapacidadTotal() {
		int capacidadTotal = 0;

		for (int i = 0; i < salas.length; i++) {
			capacidadTotal += salas[i].getCapacidad();
		}
		System.out.println("Capacidad total: " + capacidadTotal);

		return capacidadTotal;
	}

	public void ventaEntrada() {

		System.out.println("Cine: " + this.nombre);
		System.out.println("Ublicacion: " + this.ubicacion);
		// System.out.print("Pelicula: " + );

	}

}
