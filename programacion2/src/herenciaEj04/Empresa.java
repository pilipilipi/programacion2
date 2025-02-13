package herenciaEj04;

public class Empresa {
	
	private String nombre;
	private int tamañoFlota;
	Vehiculo[] flota;
	
	public Empresa() {
		
		this.nombre = "vacio";
		this.tamañoFlota = 100;
	}
	
	public Empresa(String nombre, int tamañoFlota, int flota) {
		
		this.nombre = nombre;
		this.tamañoFlota = tamañoFlota;
		this.flota = new Vehiculo[flota];
	}
	
	public void buscarVehiculo(Vehiculo vehiculo) {
		boolean existe = false;
		
		for(int i = 0; i < flota.length; i++) {			
			if(vehiculo.equals(flota[i])) {
				
				flota[i].toString();
				existe = true;
				break;
			}
		}
		
		if (!existe) {
			System.out.println("No existe el vehiculo buscado");
		}
	}
	
	public void comprar(Vehiculo vehiculo) {
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTamañoFlota() {
		return tamañoFlota;
	}

	public void setTamañoFlota(int tamañoFlota) {
		this.tamañoFlota = tamañoFlota;
	}

	public Vehiculo[] getFlota() {
		return flota;
	}

	public void setFlota(Vehiculo[] flota) {
		this.flota = flota;
	}
	
}
