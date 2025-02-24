package pooEjercicios03.ej07;

public class Main {

	public static void main(String[] args) {

		Baraja b1 = new Baraja();
		b1.crearBaraja();
		b1.barajar();
		
		b1.darCartas(5);
		b1.barajar();
		b1.cartasDisponibles();
		
		b1.siguienteCarta();
		b1.siguienteCarta();
		b1.barajar();
		
		b1.siguienteCarta();
		b1.siguienteCarta();
		b1.siguienteCarta();
		b1.siguienteCarta();
		b1.siguienteCarta();
		b1.siguienteCarta();
		b1.barajar();
		
		b1.darCartas(8);
		b1.cartasMonton();
		b1.mostrarBaraja();
		b1.mostrarMano();
		
		b1.cartasDisponibles();
	}

}
