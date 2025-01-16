package pooEjercicios03.ej02persona;

import java.util.Scanner;

public class PersonaMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		Persona p1 = new Persona();
		pedirDatos(p1);
		p1.IMC();
		System.out.println(p1.toString());
		
		sc.close();
	}
	
	
	public static Persona pedirDatos(Persona p) {
		Scanner sc = new Scanner(System.in);	

		System.out.println("Dime el nombre");
		String nombre = sc.nextLine();
		
		System.out.println("Dime la edad");
		int edad = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dime el sexo, (h o m)");
		char sexo = sc.next().charAt(0);
		sc.nextLine();
		
		System.out.println("Dime el peso");
		double peso = Double.parseDouble(sc.nextLine());
		
		System.out.println("Dime la altura");
		double altura = Double.parseDouble(sc.nextLine());
			
		sc.close();
		return new Persona(nombre, edad, peso, altura, sexo);
		
	}
	
	
	public static Persona pedirDatos2(Persona p) {
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Dime el nombre");
		String nombre = sc.nextLine();
		
		System.out.println("Dime la edad");
		int edad = Integer.parseInt(sc.nextLine());
		
		System.out.println("Dime el sexo, (h o m)");
		char sexo = sc.next().charAt(0);
		sc.nextLine();
		
		System.out.println("Dime el peso");
		double peso = Double.parseDouble(sc.nextLine());
		
		System.out.println("Dime la altura");
		double altura = Double.parseDouble(sc.nextLine());
			
		sc.close();
		return new Persona(nombre, edad, peso, altura, sexo);		
		
	}

}
