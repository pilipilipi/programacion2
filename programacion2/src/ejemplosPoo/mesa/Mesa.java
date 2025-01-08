package ejemplosPoo.mesa;

import java.util.Scanner;

public class Mesa {
	
	//Atributos
	String color;
	int nPatas;
	
	//metodos
	public void pintar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cual es el nuevo color");

		color = sc.nextLine();
		sc.close();
	}
	
	public void cambiarPatas() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cual es el nuevo numero de patas");
				
		nPatas = Integer.parseInt(sc.nextLine());
		sc.close();
	}

}
