package Biblioteca.app;
import Biblioteca.model.*;
import Biblioteca.util.*;

public class Main {

	public static void main(String[] args) {
		Autores a = new Autores("Cervantes", "Española");
		
		Libro l1 = new Libro("1", "Don Quijote", 1605, "autoresLibro", "500");
		
		Revista r1 = new Revista("2", "Todo Motor", 2020, 150, "Semanal");
		
		System.out.println(l1.toString());
		System.out.println(r1.toString());
		
		System.out.println("Items totales" + ContadorItems.getTotallItems());
	}

}
