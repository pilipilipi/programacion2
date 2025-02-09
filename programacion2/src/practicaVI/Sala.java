package practicaVI;

public class Sala {

	private int numeroSala, capacidad;
	private Pelicula peliculaEnProyeccion;
	private int[] butacas = new int[capacidad];

	public Sala() {

	}

	public Sala(int numeroSala, int capacidad) {

		this.numeroSala = numeroSala;
		this.capacidad = capacidad;
	}

	public Sala(int numeroSala, int capacidad, Pelicula peliculaEnProyeccion) {

		this.numeroSala = numeroSala;
		this.capacidad = capacidad;
		this.peliculaEnProyeccion = peliculaEnProyeccion;
	}

	public Pelicula asignarPelicula(Pelicula pelicula) {

		this.peliculaEnProyeccion = pelicula;
		return this.peliculaEnProyeccion;
	}

	public void mostrarInformacionSala() {
		System.out.println("Numero de sala: " + this.numeroSala + "\nCapacidad: " + this.capacidad
				+ "\nPelicula en proyeccion: " + this.peliculaEnProyeccion);
	}

	public int generaButaca() {
		int j = 1, aleatorio, asignada;
		boolean salaLlena = true;

		for (int i = 0; i < butacas.length; i++) {
			butacas[i] = j;
			j++;
		}

		for (int i = 0; i < butacas.length; i++) {

			if (butacas[i] != 0) {
				salaLlena = false;
				break;
			}
		}

		if (salaLlena) {
			System.out.println("Sala llena");
			return -1;
		}

		do {
			aleatorio = (int) Math.random() * (butacas.length + 1);
		} while (butacas[aleatorio] == 0);

		asignada = butacas[aleatorio];
		butacas[aleatorio] = 0;

		System.out.println("Su butaca es la: " + asignada);
		return asignada;
	}

	public int getNumeroSala() {
		return numeroSala;
	}

	public void setNumeroSala(int numeroSala) {
		this.numeroSala = numeroSala;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public Pelicula getPeliculaEnProyeccion() {
		return peliculaEnProyeccion;
	}

	public void setPeliculaEnProyeccion(Pelicula peliculaEnProyeccion) {
		this.peliculaEnProyeccion = peliculaEnProyeccion;
	}

	public int[] getButacas() {
		return butacas;
	}

	public void setButacas(int[] butacas) {
		this.butacas = butacas;
	}

}
