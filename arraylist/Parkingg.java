package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Parkingg {
	 private String nombre;
	 private int plazasTotales;
	 private int plazasLibres;
	 
	 private List<Coches> listaCoches;

	public Parkingg(String nombre, int plazasTotales) {
		this.nombre = nombre;
		this.plazasTotales = plazasTotales;
		plazasLibres = plazasTotales;
		listaCoches = new ArrayList<>();

	}
	 
}
