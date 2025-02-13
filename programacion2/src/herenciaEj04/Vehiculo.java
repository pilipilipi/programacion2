package herenciaEj04;

public class Vehiculo {
	
	private int año, ruedas, autonomia;
	private String marca, matricula;
	
	public Vehiculo() {

		this.año = 2000;
		this.ruedas = 4;
		this.autonomia = 500;
		this.marca = "por defecto";
		this.matricula = "0000 XXX";

	}

	public Vehiculo(int año, int ruedas, int autonomia, String marca, String matricula) {

		this.año = año;
		this.ruedas = ruedas;
		this.autonomia = autonomia;
		this.marca = marca;
		this.matricula = matricula;
	}
	
	public Vehiculo(int año, int autonomia, String marca, String matricula) {
		
		this.año = año;
		this.ruedas = 4;
		this.autonomia = autonomia;
		this.marca = marca;
		this.matricula = matricula;
	}
	
	@Override
	public boolean equals(Object obj) {
		
       Vehiculo vehiculo = (Vehiculo) obj;

       return this.año == vehiculo.año &&
        		this.ruedas == vehiculo.ruedas &&
        		this.autonomia == vehiculo.autonomia &&
        		this.marca.equals(vehiculo.marca) &&
        		this.matricula.equals(vehiculo.matricula);
    }

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getRuedas() {
		return ruedas;
	}

	public int getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Vehiculo [año=" + año + ", ruedas=" + ruedas + ", autonomia=" + autonomia + ", marca=" + marca
				+ ", matricula=" + matricula + "]";
	}
	
}
