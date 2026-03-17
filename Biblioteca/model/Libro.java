package Biblioteca.model;

public class Libro extends itemBiblioteca{

	// Atributos
	
	private String autor;
    private String numPaginas;
	
	
	public Libro(String id, String titulo, int anioPublicacion, String autor, String numPaginas) {
		super(id, titulo, anioPublicacion);
		this.autor = autor;
		this.numPaginas = numPaginas;
		
	}

	@Override
	public String obtenerDescripcion() {
		return (titulo);
	}

}
