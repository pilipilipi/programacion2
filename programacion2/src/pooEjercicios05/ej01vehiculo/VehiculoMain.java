package pooEjercicios05.ej01vehiculo;

public class VehiculoMain {

	public static void main(String[] args) {
		
		Vehiculo v1 = new Vehiculo();
		Vehiculo v2 = new Vehiculo("seat");
		Vehiculo v3 = new Vehiculo("fiat", "punto", 150);
		
		v1.setVelocidadMax(250);
		v1.acelerar(70);
		v1.detener();
		
		v2.setModelo("ibiza");
		v2.setVelocidadMax(200);
		
		v3.esIgual(v2);
		v3.esIgual("fiat", "punto", 150);
		
	}

}
