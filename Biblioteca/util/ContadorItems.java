package Biblioteca.util;

public class ContadorItems {
	private static int totallItems = 0; // Este atributo lleva un estatico para que funcione el metodo.
	
	public static void incrementar() {
		totallItems++;
	}
	
	public static int getTotallItems() {
		return totallItems;
	}
	
}
