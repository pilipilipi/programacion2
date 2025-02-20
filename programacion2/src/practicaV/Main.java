package practicaV;

public class Main {
	public static void main(String[] args) {
		Estandar h1 = new Estandar(101, true, Camas.dos);
		Estandar h2 = new Estandar(102, false, Camas.tres);
		Suite h3 = new Suite(201, 2, true);
		Suite h4 = new Suite(202, 1, false);

		System.out.println("Total de habitaciones creadas: " + Habitacion.getTotalHabitaciones());
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);

		System.out.println("¿Son iguales h1 y h2? " + h1.equals(h2));

		Persona p1 = new Persona("12345678A", "Juan", "Pérez", "01/01/1990");
		Persona p2 = new Persona("87654321B", "Ana", "Gómez", "02/02/1985");

		h1.reservar(p1);
		h3.reservar(p2);

		Habitacion[] habitaciones = {h1, h2, h3, h4};

		System.out.println("\nPrecios de las habitaciones suite:");
		for (int i = 0; i < habitaciones.length; i++) {
			if (habitaciones[i] instanceof Suite) {
				System.out.println("Habitación " + habitaciones[i].getNumero() + " precio: "
						+ habitaciones[i].calcularCosteTotal());
			}
		}

		System.out.println("Reservas en habitaciones estándar:");
		for (int i = 0; i < habitaciones.length; i++) {
			if (habitaciones[i] instanceof Estandar && !habitaciones[i].isDisponible()) {
				System.out.println("DNI: " + habitaciones[i].getPersona().getDni() + " - Nombre: "
						+ habitaciones[i].getPersona().getNombre());
			}
		}
	}
}
