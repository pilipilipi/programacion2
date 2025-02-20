package pooEjercicios03.ej07;

public class Baraja {
	
	private Carta[] baraja = new Carta[40];
	private Carta[] barajada = new Carta[40];
	private Carta[] monton = new Carta[40];
	private Carta[] enMano = new Carta[40];
	private static int siguiente = 0;
	
	private int[] numeros = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
	private String[] palos = {"bastos", "oros", "copas", "espadas"};
	
	public Baraja() {
		
	}
	
	public void crearBaraja() {
		int indice = 0;
		
		for(int i = 0; i < this.palos.length; i++) {
			for(int j = 0; j < this.numeros.length; j++) {
				baraja[indice] = new Carta(this.numeros[j], this.palos[i]);
				indice++;
			}
		}
	}
	
	public void barajar() {
		int aleatorio;
			 
		 for (int i = 0; i < this.baraja.length; i++) {
			 
			 do {
		            aleatorio = (int) (Math.random() * 40);
		        } while (this.barajada[aleatorio] != null);
			 
			 this.barajada[aleatorio] = this.baraja[i];
		 }
	}
	
	public void siguienteCarta() {
		
		if(siguiente <= barajada.length) {	
			System.out.println(this.barajada[siguiente]);

			monton[siguiente] = barajada[siguiente];
			barajada[siguiente] = null;
			
			siguiente++;
			
		} else {
			System.out.println("No quedan cartas");
		}

	}
	
	public void cartasDisponibles() {
		
		System.out.println("Quedan: " + (40 - siguiente) + " cartas para repartir");
	}
	
	public void darCartas(int numCartas) {
		
		if(numCartas > (40 - siguiente)) {
			System.out.println("No hay cartas suficientes");
			
		} else {
			
			for (int i = 0; i <= numCartas; i++) {
				
				
				
			}
		}
	}
	
	public void cartasMonton() {
		
		for(int i = 0; i < siguiente; i++) {
			
		}
	}
	
	
	
}
































