package herenciaEj04;

public class Main {
	public static void main(String[] args) {
		Empresa empresa = new Empresa("Transporte S.A.", 10);

		Coche coche1 = new Coche(2020, 500, "Toyota", "ABC123", "Azul", 5, false);
		Camion camion1 = new Camion(2018, 6, 800, "Volvo", "DEF456", 0, 1000, "Juan");
		Camion camion2 = new Camion(2019, 8, 700, "Mercedes", "GHI789", 0, 1500, "Pedro");

		System.out.println("\n=== Vehículos creados ===");
		System.out.println(coche1);
		System.out.println(camion1);
		System.out.println(camion2);

		// Operaciones sobre los vehículos
		coche1.pintar("Rojo");
		camion1.cargar(30);
		camion2.descargar(20);
		camion1.descargar(200);
		camion2.cargar(200);
		camion2.cambioConductor("Luis");

		// Mostrar vehículos después de las modificaciones
		System.out.println("\n=== Vehículos después de modificaciones ===");
		System.out.println(coche1);
		System.out.println(camion1);
		System.out.println(camion2);

		// Empresa: mostrar flota vacía
		System.out.println("\n=== Flota inicial ===");
		System.out.println(empresa);

		// Empresa compra vehículos
		empresa.comprar(coche1);
		empresa.comprar(camion1);
		System.out.println("\n=== Flota después de compras ===");
		System.out.println(empresa);

		// Empresa vende vehículos
		empresa.vender(camion1);
		empresa.vender(camion2); // Este no está en la empresa aún
		System.out.println("\n=== Flota después de ventas ===");
		System.out.println(empresa);

		// Empresa compra otro vehículo
		empresa.comprar(camion2);
		System.out.println("\n=== Flota final ===");
		System.out.println(empresa);
	}
}
