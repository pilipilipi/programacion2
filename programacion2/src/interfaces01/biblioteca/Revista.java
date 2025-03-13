package interfaces01.biblioteca;

public class Revista extends Biblioteca {
	
	private int numero;
	
	public Revista(int codigo, int año, String titulo, int numero) {
		
		super(codigo, año, titulo);
		this.numero = numero;
	}
}
