package pooEjercicios02.ej11persona;

public class PersonaMain {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		Persona p4 = new Persona();
		
		p1.setDni("00000000x");
		p1.setNombre("joaquin");
		p1.setApellido("ramirez");
		p1.setEdad(14);
		
		p1.imprime();
		p1.esMayorEdad();
		p1.esJubilado();
		p1.diferenciaEdad(p2);
		
		
		
		p2.setDni("1111111x");
		p2.setNombre("paula");
		p2.setApellido("jimenez");
		p2.setEdad(19);
		
		p2.imprime();
		p2.esMayorEdad();
		p2.esJubilado();
		p2.diferenciaEdad(p1);
		
		
		
		p3.setDni("22222222x");
		p3.setNombre("pepe");
		p3.setApellido("gonzalez");
		p3.setEdad(65);
		
		p3.imprime();
		p3.esMayorEdad();
		p3.esJubilado();
		p3.diferenciaEdad(p4);
		
		
		
		p4.setDni("33333333x");
		p4.setNombre("jose");
		p4.setApellido("fernandez");
		p4.setEdad(68);
		
		p4.imprime();
		p4.esMayorEdad();
		p4.esJubilado();
		p4.diferenciaEdad(p1);
	}

}
