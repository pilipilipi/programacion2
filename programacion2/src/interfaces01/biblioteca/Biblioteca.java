package interfaces01.biblioteca;

public abstract class Biblioteca {
	
	private int codigo, año;
	private String titulo;
	
	public Biblioteca(int codigo, int año, String titulo) {
		this.codigo = codigo;
		this.año = año;
		this.titulo = titulo;
	}
	
	public void publicacionesAnterioresA(Biblioteca[] publicaciones, int año) {
		int acc = 0;
		
		for(int i = 0; i < publicaciones.length; i++) {
			
			if(publicaciones[i].año < año) {
				acc++;				
			}
		}
		
		System.out.println("Hay: " + acc + " libros anteriores a " + año);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}	
}
