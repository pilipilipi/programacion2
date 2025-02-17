package herenciaEj04;

import java.util.Arrays;

public class Empresa {

	private String nombre;
	private int tamanioFlota;
	private Vehiculo[] flota;
	private static int numVehiculos;

	public Empresa() {

		this.nombre = "vacio";
		this.tamanioFlota = 100;
	}

	public Empresa(String nombre, int tamanioFlota) {

		this.nombre = nombre;
		this.tamanioFlota = tamanioFlota;
		this.flota = new Vehiculo[tamanioFlota];
		numVehiculos = 0;
	}

	public void buscarVehiculo(Vehiculo vehiculo) {
		boolean existe = false;

		for (int i = 0; i < flota.length; i++) {
			if (vehiculo.equals(flota[i])) {

				System.out.println(flota[i]);
				existe = true;
				break;
			}
		}

		if (!existe) {
			System.out.println("No existe el vehiculo buscado");
		}
	}

	public void comprar(Vehiculo vehiculo) {

		if (numVehiculos < tamanioFlota) {
			for (int i = 0; i < flota.length; i++) {

				if (flota[i] == null) {
					flota[i] = vehiculo;
					break;
				}
			}

			numVehiculos++;

		} else {
			System.out.println("Flota completa");
		}
	}

	public void vender(Vehiculo vehiculo) {
		boolean existe = false;

		for (int i = 0; i < flota.length; i++) {
			if (flota[i] != null && flota[i].getMatricula().equals(vehiculo.getMatricula())) {

				flota[i] = null;
				numVehiculos--;
				existe = true;
				break;
			}
		}

		if (!existe) {
			System.out.println("Vehiculo no encontrado");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTamañoFlota() {
		return tamanioFlota;
	}

	public void setTamañoFlota(int tamañoFlota) {
		this.tamanioFlota = tamañoFlota;
	}

	public Vehiculo[] getFlota() {
		return flota;
	}

	public void setFlota(Vehiculo[] flota) {
		this.flota = flota;
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", tamanioFlota=" + tamanioFlota + ", flota=" + Arrays.toString(flota) + ", num vehiculos=" + numVehiculos + "]";
	}

}
