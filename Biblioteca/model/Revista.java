package Biblioteca.model;

public class Revista extends itemBiblioteca{

	// Atributos
	
	protected int numero;
	protected String periodicidad;
	
	public Revista(String id, String titulo, int anioPublicacion, int numero, String periodicidad) {
		super(id, titulo, anioPublicacion);
		this.numero = numero;
		this.periodicidad = periodicidad;
		
	}

	@Override
	public String obtenerDescripcion() {
		return (titulo);
	}
	
}
