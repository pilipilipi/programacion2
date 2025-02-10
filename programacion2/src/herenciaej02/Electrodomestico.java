package herenciaej02;

public class Electrodomestico {

	private double precioBase, peso;
	private Color color;
	private Consumo consumo;

	private final double PRECIO_BASE = 100, PESO = 5;
	private final Color COLOR = Color.valueOf("blanco");
	private final Consumo CONSUMO = Consumo.valueOf("F");

	public Electrodomestico() {
		this.precioBase = PRECIO_BASE;
		this.peso = PESO;
		this.color = COLOR;
		this.consumo = CONSUMO;
	}

	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR;
		this.consumo = CONSUMO;
	}

	public Electrodomestico(double precioBase, double peso, Color color, Consumo consumo) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = color;
		this.consumo = consumo;
	}

	public void precioFinal() {

		switch (this.consumo) {

		case A:
			precioBase += 100;
			break;

		case B:
			precioBase += 80;
			break;

		case C:
			precioBase += 60;
			break;

		case D:
			precioBase += 50;
			break;

		case E:
			precioBase += 30;
			break;

		case F:
			precioBase += 10;
			break;

		default:
			System.out.println("Consumo no valido");
			break;
		}

		if (this.peso > 0 && this.peso <= 19) {
			precioBase += 10;

		} else if (this.peso >= 20 && this.peso <= 49) {
			precioBase += 50;

		} else if (this.peso >= 50 && this.peso <= 79) {
			precioBase += 80;

		} else if (this.peso >= 80) {
			precioBase += 100;

		} else {
			System.out.println("Peso no válido");
		}
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Consumo getConsumo() {
		return consumo;
	}

	public void setConsumo(Consumo consumo) {
		this.consumo = consumo;
	}
}
