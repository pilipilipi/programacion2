package pooEjercicios02.ej11persona;

public class Persona {

	private String dni, nombre, apellido;
	private int edad;
	
	
	public void imprime() {
		System.out.println("DNI: " + this.dni + "\nNombre: " + this.nombre + "\nApellido: " + this.apellido);
	}
	
	public boolean esMayorEdad() {

		if(this.edad >= 18) {
			System.out.println("Es mayor de edad");
			return true;
			
		} else {
			System.out.println("Es menor de edad");
			return false;
		}
	}
	
	public boolean esJubilado() {
		
		if(this.edad >= 65) {
			System.out.println("Está jubilado");
			return true;
						
		} else {
			System.out.println("No está jubilado");
			return false;
		}
	}
	
	public int diferenciaEdad(Persona p) {
		
		System.out.println(Math.abs(this.edad - p.edad));
		return Math.abs(this.edad - p.edad);
	}
	

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
