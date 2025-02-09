package practicaVI;

public class Pelicula {

	private String titulo, genero;
	private double duracion;
	private int clasificacionEdad;

	public Pelicula() {

	}

	public Pelicula(String titulo, String genero) {

		this.titulo = titulo;
		this.genero = genero;
	}

	public Pelicula(String titulo, String genero, double duracion, int calificacionEdad) {

		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
		this.clasificacionEdad = calificacionEdad;
	}

	public boolean esAptaParaEdad(int edad) {

		if (edad >= this.clasificacionEdad) {
			System.out.println("Es apta");
			return true;

		} else {
			System.out.println("no es apta");
			return false;
		}
	}

	public String obtenerDuracionFormato() {
		String tiempo;
		int horas, mins;

		horas = (int) this.duracion;
		mins = (int) ((this.duracion - horas) * 60);

		tiempo = horas + " horas y " + mins + " minutos.";
		System.out.println(tiempo);

		return tiempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public int getClasificacionEdad() {
		return clasificacionEdad;
	}

	public void setClasificacionEdad(int clasificacionEdad) {
		this.clasificacionEdad = clasificacionEdad;
	}

}
