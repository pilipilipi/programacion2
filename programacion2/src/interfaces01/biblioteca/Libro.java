package interfaces01.biblioteca;

public class Libro extends Biblioteca {
	
	private boolean prestado;
	private static int i = 0;
	private static Libro[] libros = new Libro[i];
	
	
	private Libro(int codigo, int año, String titulo) {
		super(codigo, año, titulo);
		this.prestado = false;
		
		if (i >= libros.length) {
            // Si el array está lleno, se suma 1 posicion
            Libro[] nuevoArray = new Libro[libros.length + 1];
            System.arraycopy(libros, 0, nuevoArray, 0, libros.length);
            libros = nuevoArray;
        }
		
		libros[i] = this;
		i++;
	}
	
	public void prestar() {
		this.prestado = true;
	}
	
	public void devolver() {
		this.prestado = false;
	}
	
	public void prestado() {
		
		if(this.prestado == false) {
			System.out.println("Esta disponible");
			
		} else {
			System.out.println("Esta prestado");
		}
	}
	
	public void cuentaprestados() {
		int acc = 0;
		
		for(int j = 0; j < libros.length; j++) {
			
			if(libros[j].prestado == true) {
				acc++;
			}
		}
		System.out.println("Hay " + acc + " libros prestados");
	}
	
	
	
}









































