package _collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Parking {

    private String nombre;
    private int totalPlazas;
    private int plazasLibres;
    private List<Coche> listaCoches;
    private Map<Color, Integer> mapColores;
    private Map<Marca, Integer> mapMarcas;
    private Map<Coche, Integer> mapCochesIguales;
    private Set<Coche> setCoches;
    private Random random;
    
    public Parking(String nombre, int totalPlazas) {
        this.nombre = nombre;
        this.totalPlazas = totalPlazas;
        this.plazasLibres = totalPlazas;
        this.listaCoches = new ArrayList<>();
        this.mapColores = new HashMap<>();
        this.mapMarcas = new HashMap<>();
        this.mapCochesIguales = new HashMap<>();
        this.setCoches = new HashSet<>(); 
        this.random = new Random();
    }
    
    public boolean entraCoche(Coche c) {
    	boolean cocheDentro = false;
    	
		for (Coche e: listaCoches) {
			if (e == c) {
				cocheDentro = true;
				break;
			}
		}
    	
    	if (listaCoches.size() == totalPlazas) return false;
        if(cocheDentro) {
        	return false;
        }
        listaCoches.add(c);
        plazasLibres--;
        sumarContadores(c); 
        return true;
    }
    
    public boolean saleCoche(Coche c) {

        
        boolean cocheDentro = false;
        
        for (int i = 0; i < listaCoches.size(); i++) {
			if(listaCoches.get(i) == c) {
				listaCoches.remove(i);
				cocheDentro = true;
			}
			
		}
        
        if(!cocheDentro) {
        	return false;
        }
        
        if(mapCochesIguales.get(c) == 1) {
        	setCoches.remove(c);
        }
        listaCoches.remove(c);
        plazasLibres++;
     
        restarContadores(c); 
        return true;
    }
    
//    public boolean saleCocheAleatorio() {
//        if (listaCoches.isEmpty()) return false;
//        int cocheAleatorio = random.nextInt(listaCoches.size());
//        return saleCoche(listaCoches.get(cocheAleatorio));
//    }
    public Coche saleCocheAleatorio() {
      if (listaCoches.isEmpty()) {
    	 return null; 
      } 
      
      Coche cocheAleatorio = listaCoches.get(random.nextInt(0,listaCoches.size()));
      saleCoche(cocheAleatorio);
      return cocheAleatorio;
 }
    
    
    public boolean vaciaParking() {
        if (listaCoches.isEmpty()) return false;
        while (!listaCoches.isEmpty()) {
            saleCoche(listaCoches.get(0));
        }
        return true;
    }
    
    public void reportParking() {
        System.out.println("LISTADO COCHES");
        System.out.println("--------------");
        System.out.println("Parking: " + nombre);
        for (Coche vehiculos : listaCoches) {
            System.out.println("  " + vehiculos);
        }
        System.out.println("Total coches: " + listaCoches.size() + 
                           ", plazas libres: " + plazasLibres + ".");
    }
    
    public void reportColores() {
        System.out.println("REPORT DE COLORES");
        System.out.println("-----------------");
        System.out.println("Parking: " + nombre);
        for (Map.Entry<Color, Integer> e : mapColores.entrySet()) {
            int num = e.getValue();
            String veces = (num == 1) ? "vez" : "veces";
            System.out.println("Color " + e.getKey().getNombreColor()
                    + ": se repite  " + num + " " + veces + ".");
        }
        System.out.println("Total coches: " + listaCoches.size());
    }
    
    public void reportMarcas() {
        System.out.println("REPORT DE MARCAS");
        System.out.println("----------------");
        System.out.println("Parking: " + nombre);
        for (Map.Entry<Marca, Integer> e : mapMarcas.entrySet()) {
            int num = e.getValue();
            String veces = (num == 1) ? "vez" : "veces";
            System.out.println("Marca " + e.getKey().getNombreCompleto()
                    + ": se repite " + num + " " + veces + ".");
        }
        System.out.println("Total coches: " + listaCoches.size());
    }
    
    public void reportCochesIguales() {
        System.out.println("REPORT DE COCHES IGUALES");
        System.out.println("------------------------");
        System.out.println("Parking: " + nombre);
        for (Map.Entry<Coche, Integer> e : mapCochesIguales.entrySet()) {
            int num = e.getValue();
            String veces = (num == 1) ? "vez" : "veces";
            System.out.println(e.getKey() + " se repite " + num + " " + veces + ".");
        }
        System.out.println("Total coches: " + listaCoches.size());
    }
    
    public void reportSetCoches() {
        System.out.println("REPORT SET DE COCHES");
        System.out.println("--------------------");
        System.out.println("Parking: " + nombre);
        for (Coche c : setCoches) {
            System.out.println(c);
        }
        System.out.println("Total items: " + setCoches.size());
    }
    
    public void reportCompleto() {
    	
        System.out.println("===== Reporte Completo =====");
        System.out.println();
        reportParking();       
        System.out.println();
        reportColores();      
        System.out.println(); 
        reportMarcas();       
        System.out.println(); 
        reportCochesIguales(); 
        System.out.println(); 
        reportSetCoches();   
        
    }

    private void sumarContadores(Coche c) {
        
        int cantidadColor = mapColores.getOrDefault(c.getColor(), 0);
        mapColores.put(c.getColor(), cantidadColor + 1);
        
        
        int cantidadMarca = mapMarcas.getOrDefault(c.getMarca(), 0);
        mapMarcas.put(c.getMarca(), cantidadMarca + 1);
        
   
        int cantidadCoche = mapCochesIguales.getOrDefault(c, 0);
        mapCochesIguales.put(c, cantidadCoche + 1);
        
        
        setCoches.add(c);
    }
    
    private void restarContadores(Coche c) {
        
        int cantidadColor = mapColores.get(c.getColor());
        cantidadColor--;
        if (cantidadColor == 1) mapColores.remove(c.getColor());
        else mapColores.put(c.getColor(), cantidadColor);
        
       
        int cantidadMarca = mapMarcas.get(c.getMarca());
        cantidadMarca--;
        if (cantidadMarca == 1) mapMarcas.remove(c.getMarca());
        else mapMarcas.put(c.getMarca(), cantidadMarca);
        
        
        int cantidadCoche = mapCochesIguales.get(c);
        cantidadCoche--;
        if (cantidadCoche == 1) mapCochesIguales.remove(c);
        else mapCochesIguales.put(c, cantidadCoche);
        
    }
    
}
