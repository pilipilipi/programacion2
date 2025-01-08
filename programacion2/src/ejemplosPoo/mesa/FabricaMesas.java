package ejemplosPoo.mesa;

public class FabricaMesas {

	public static void main(String[] args) {
		
		Mesa m1;
		Mesa m2;
		
		m1 = new Mesa();
		m1.pintar();
		System.out.println("la mesa m1 es de color" + m1.color);
		
		
		m2 = new Mesa();
		m2.pintar();
		System.out.println("la mesa m1 es de color" + m2.color);
	}

}
