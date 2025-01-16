package pooEjercicios03.ej02persona;

public class Persona {
	
	String nombre, dni;
	int edad;
	double peso, altura;
	char sexo;
	final char HOMBRE = 'H';
	
	
	public Persona() {
		
		this.dni = generaDni();
		
		this.sexo = HOMBRE;
		this.nombre = "";
		this.edad = 0;
		this.peso = 0;
		this.altura = 0;
	}
	
	
	public Persona(String nombre, int edad, char sexo) {
		
		comprobarSexo(sexo);
		
		this.dni = generaDni();
		this.peso = 0;
		this.altura = 0;
	}
	
	
	public Persona(String nombre, int edad, double peso, double altura, char sexo) {
		this.dni = generaDni();
	}
	
	
	public int IMC() {
		double imc;
		imc = this.peso / (Math.pow(this.altura, 2));
		
		if(imc < 20) {
			System.out.println("Peso bajo" + imc);
			return -1;
			
		} else if (imc >= 20 && imc <= 25) {
			System.out.println("Peso adecuado" + imc);
			return 0;
			
		} else {
			System.out.println("Sobrepeso" + imc);
			return 1;
		}
	}
	
	
	public boolean mayorEdad() {
		
		if(this.edad >= 18) {
			return true;
			
		} else {
			return false;
		}
		
	}
	
	
	private void comprobarSexo(char sexo) {
		
		if(sexo != 'h' && sexo != 'H' && sexo != 'm' && sexo != 'm') {
			this.sexo = HOMBRE;			
		}
	}


	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura
				+ ", sexo=" + sexo + ", HOMBRE=" + HOMBRE + "]";
	}
	
	
	public String generaDni() {
		int dni;
		char letraDni;
		char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 
                'C', 'K', 'E'};
		
		dni = (int) (Math.random() * 100000000);		
		letraDni = letra[dni % 23];
		
		this.dni = (Integer.toString(dni) + letraDni);
		return this.dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	
}
































