package Biblioteca.model;

public abstract class itemBiblioteca {
	// Atributos 
	
	public String id;
	public String titulo;
	public int anioPublicacion;
	
	
	// Métodos
	
	public itemBiblioteca(String id, String titulo, int anioPublicacion){
		this.id = id;
		this.titulo = titulo;
		this.anioPublicacion = anioPublicacion;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getAnioPublicacion() {
		return anioPublicacion;
	}


	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}
	
	public abstract String obtenerDescripcion();
	
	public String toString() {
		return (titulo);
	}
}
