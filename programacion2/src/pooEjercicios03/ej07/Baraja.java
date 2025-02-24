package pooEjercicios03.ej07;

public class Baraja {

	private Carta[] baraja;
	private Carta[] monton;
	private Carta[] enMano;
	private int siguiente;
	private int indiceMano;
	private int indiceMonton;

	private final static int[] NUMEROS = { 1, 2, 3, 4, 5, 6, 7, 10, 11, 12 };
	private final static String[] PALOS = { "bastos", "oros", "copas", "espadas" };

	public Baraja() {
		this.baraja = new Carta[40];
		this.monton = new Carta[40];
		this.enMano = new Carta[40];
		this.siguiente = 0;
		this.indiceMano = 0;
		this.indiceMonton = 0;
	}

	public void crearBaraja() {
		int aleatorio;

		for (int i = 0; i < PALOS.length; i++) {
			for (int j = 0; j < NUMEROS.length; j++) {

				do {
					aleatorio = (int) (Math.random() * 40);
				} while (this.baraja[aleatorio] != null);

				baraja[aleatorio] = new Carta(NUMEROS[j], PALOS[i]);
			}
		}
	}

	public void barajar() {
		Carta banquillo;
		int aleatorio;
		this.siguiente = 0;

		for (int i = 0; i < this.baraja.length; i++) {

			aleatorio = (int) (Math.random() * 40);
			banquillo = baraja[aleatorio];

			baraja[aleatorio] = baraja[i];
			baraja[i] = banquillo;

		}

	}

	public void siguienteCarta() {

		if (this.siguiente >= this.baraja.length) {
			System.out.println("\nNo quedan cartas");
			return;
		}

		while (this.siguiente < this.baraja.length && this.baraja[siguiente] == null) {
			this.siguiente++;

			if (this.siguiente >= baraja.length) {
				System.out.println("\nNo quedan cartas");
				return;
			}
		}

		System.out.println("\nSiguiente carta:" + this.baraja[siguiente]);

		this.monton[this.indiceMonton] = this.baraja[this.siguiente];
		this.baraja[this.siguiente] = null;

		this.siguiente++;
		this.indiceMonton++;
	}

	public void cartasDisponibles() {
		int cartasRestantes = 0;

		for (int i = 0; i < this.baraja.length; i++) {

			if (this.baraja[i] != null) {
				cartasRestantes++;
			}
		}

		System.out.println("\nQuedan: " + cartasRestantes + " cartas restantes");
	}

	public void darCartas(int numCartas) {

		if (numCartas > (this.baraja.length - this.siguiente)) {
			System.out.println("\nNo hay cartas suficientes");
			return;
		}

		for (int i = 0; i < numCartas; i++) {

			while (this.siguiente < this.baraja.length && this.baraja[this.siguiente] == null) {
				this.siguiente++;
			}

			if (this.siguiente < this.baraja.length) {

				this.enMano[this.indiceMano] = this.baraja[this.siguiente];
				this.baraja[this.siguiente] = null;

				this.siguiente++;
				this.indiceMano++;

			} else {

				System.out.println("\nNo hay suficientes cartas");
				return;
			}
		}
	}

	public void cartasMonton() {
		System.out.println("\nMonton:");

		for (int i = 0; i < this.monton.length; i++) {

			if (this.monton[i] != null) {
				System.out.println(this.monton[i]);
			}
		}
	}

	public void mostrarBaraja() {
		System.out.println("\nBaraja restante:");

		for (int i = 0; i < this.baraja.length; i++) {

			if (this.baraja[i] != null) {
				System.out.println(this.baraja[i]);
			}
		}
	}

	public void mostrarMano() {
		System.out.println("\nMano:");

		for (int i = 0; i < this.enMano.length; i++) {

			if (this.enMano[i] != null) {
				System.out.println(this.enMano[i]);
			}
		}
	}

}
