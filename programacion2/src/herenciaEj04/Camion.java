package herenciaEj04;

public class Camion extends Vehiculo {

	private int carga, limCarga;
	private String conductor;

	public Camion() {

		super();
		this.carga = 3500;
		this.limCarga = 10000;
		this.conductor = "234";
	}

	public Camion(int año, int ruedas, int autonomia, String marca, String matricula, int carga, int limCarga,
			String conductor) {

		super(año, ruedas, autonomia, marca, matricula);
		this.carga = carga;
		this.limCarga = limCarga;
		this.conductor = conductor;
		calcLimite();
	}

	public void calcLimite() {

		if (this.carga > this.limCarga) {
			this.carga = this.limCarga;
		}
	}
	
	public void cambioConductor(String conductor) {
		
		this.conductor = conductor;
		System.out.println("Conductor nuevo: " + this.conductor);
	}
	
	public void cargar(int incremento) {
		
		if (this.carga + incremento > this.limCarga) {
			this.carga = this.limCarga;
			System.out.println("La carga introducida sobrepasa el limite, la carga nueva es de: " + this.carga);
			
		} else {
			this.carga += incremento; 
			System.out.println("La nueva carga es de: " + this.carga);
		}
	}
	
	public void descargar(int decremento) {
		
		if (decremento > this.carga) {
			this.carga = 0;
			System.out.println("Se ha descargado el camion por completo");
			
		} else {
			this.carga -= decremento;
			System.out.println("la carga tras descargar es de: " + this.carga);
		}
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public int getLimCarga() {
		return limCarga;
	}

	public void setLimCarga(int limCarga) {
		this.limCarga = limCarga;
	}

	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}

	@Override
	public String toString() {
		return super.toString() + "Camion [carga=" + carga + ", limCarga=" + limCarga + ", conductor=" + conductor + "]";
	}
	
}
