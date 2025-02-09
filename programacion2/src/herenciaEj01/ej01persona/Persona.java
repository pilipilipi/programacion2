package herenciaEj01.ej01persona;

public class Persona {

	protected int edad;
	protected String sexo;

	public Persona() {
		
	}

	public Persona(int edad, String sexo) {
		this.edad = edad;
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", sexo=" + sexo + "]";
	}

}
