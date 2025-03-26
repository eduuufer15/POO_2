package _collections2;

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
    private List<Coche> listaCoches;
    private Map<Color, Integer> cochesPorColor;
    private Map<Marca, Integer> cochesPorMarca;
    private Map<Coche, Integer> cochesIguales;
    private Set<Coche> conjuntoCoches;
    
    // Constructor
    public Parking(String nombre, int totalPlazas) {
        this.nombre = nombre;
        this.totalPlazas = totalPlazas;
        this.listaCoches = new ArrayList<>();
        this.cochesPorColor = new HashMap<>();
        this.cochesPorMarca = new HashMap<>();
        this.cochesIguales = new HashMap<>();
        this.conjuntoCoches = new HashSet<>();
        
        // Inicializar mapas de conteo
        for (Color color : Color.values()) {
            cochesPorColor.put(color, 0);
        }
        
        for (Marca marca : Marca.values()) {
            cochesPorMarca.put(marca, 0);
        }
    }
    
    // Método para que entre un coche al parking (usando comparación por identidad)
    public boolean entraCoche(Coche c) {
        if (listaCoches.size() < totalPlazas) {
            boolean existe = false;
            // Comprobar si el coche ya está en la lista comparando la identidad (==)
            for (Coche coche : listaCoches) {
                if (coche == c) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                listaCoches.add(c);
                
                // Actualizar contadores por color
                cochesPorColor.put(c.getColor(), cochesPorColor.getOrDefault(c.getColor(), 0) + 1);
                // Actualizar contadores por marca
                cochesPorMarca.put(c.getMarca(), cochesPorMarca.getOrDefault(c.getMarca(), 0) + 1);
                // Actualizar el conteo de coches iguales (basado en equals, sin modificar el método)
                if (cochesIguales.containsKey(c)) {
                    cochesIguales.put(c, cochesIguales.get(c) + 1);
                } else {
                    cochesIguales.put(c, 1);
                }
                // Añadir al conjunto (nota: Set usa equals, por lo que sólo se guardará una instancia por valores)
                conjuntoCoches.add(c);
                
                return true;
            }
        }
        return false;
    }
    
    // Método para sacar un coche del parking (comparación por identidad)
    public boolean saleCoche(Coche c) {
        if (!listaCoches.isEmpty()) {
            int indice = -1;
            // Buscar el coche por identidad (para permitir duplicados)
            for (int i = 0; i < listaCoches.size(); i++) {
                if (listaCoches.get(i) == c) {
                    indice = i;
                    break;
                }
            }
            if (indice != -1) {
                Coche removido = listaCoches.remove(indice);

                // Actualizar contadores por color
                cochesPorColor.put(removido.getColor(), cochesPorColor.get(removido.getColor()) - 1);
                // Actualizar contadores por marca
                cochesPorMarca.put(removido.getMarca(), cochesPorMarca.get(removido.getMarca()) - 1);

                // Actualizar el conteo de coches iguales
                if (cochesIguales.containsKey(removido)) {
                    int cantidad = cochesIguales.get(removido);
                    if (cantidad > 1) {
                        // Reducir el contador
                        cochesIguales.put(removido, cantidad - 1);
                    } else {
                        // Si el contador es 1, comprobar si aún queda alguna instancia igual en la lista
                        boolean hayOtro = false;
                        for (Coche coche : listaCoches) {
                            if (coche.equals(removido)) {
                                hayOtro = true;
                                break;
                            }
                        }
                        if (hayOtro) {
                            // Si queda, forzamos el contador a 1 en lugar de eliminar la clave
                            cochesIguales.put(removido, 1);
                        } else {
                            cochesIguales.remove(removido);
                        }
                    }
                }

                // Verificar si hay que quitar del conjunto
                boolean existe = false;
                for (Coche coche : listaCoches) {
                    if (coche.equals(removido)) {
                        existe = true;
                        break;
                    }
                }
                if (!existe) {
                    conjuntoCoches.remove(removido);
                }
                return true;
            }
        }
        return false;
    }

    
    // Método para sacar un coche aleatorio (con verificación por identidad)
    public Coche saleCocheAleatorio() {
        if (listaCoches.isEmpty()) {
            return null;
        }
        
        Random rand = new Random();
        int index = rand.nextInt(listaCoches.size());
        Coche removido = listaCoches.remove(index);
        
        // Actualizar el conteo de colores
        if (cochesPorColor.containsKey(removido.getColor())) {
            int count = cochesPorColor.get(removido.getColor());
            if (count > 1) {
                cochesPorColor.put(removido.getColor(), count - 1);
            } else {
                cochesPorColor.put(removido.getColor(), 0);
            }
        }
        
        // Actualizar el conteo de marcas
        if (cochesPorMarca.containsKey(removido.getMarca())) {
            int count = cochesPorMarca.get(removido.getMarca());
            if (count > 1) {
                cochesPorMarca.put(removido.getMarca(), count - 1);
            } else {
                cochesPorMarca.put(removido.getMarca(), 0);
            }
        }
        
        // Actualizar el conteo de coches iguales
        if (cochesIguales.containsKey(removido)) {
            int count = cochesIguales.get(removido);
            if (count > 1) {
                cochesIguales.put(removido, count - 1);
            } else {
                // Si el contador es 1, comprobamos si queda alguna instancia igual en la lista
                boolean hayOtro = false;
                for (Coche coche : listaCoches) {
                    if (coche.equals(removido)) {
                        hayOtro = true;
                        break;
                    }
                }
                if (hayOtro) {
                    cochesIguales.put(removido, 1);
                } else {
                    cochesIguales.remove(removido);
                }
            }
        }
        
        // Verificar si hay otro coche igual en la lista; si no, eliminar del conjunto
        boolean existe = false;
        for (Coche coche : listaCoches) {
            if (coche.equals(removido)) {
                existe = true;
                break;
            }
        }
        if (!existe) {
            conjuntoCoches.remove(removido);
        }
        
        return removido;
    }

    
    // Método para vaciar el parking
    public boolean vaciaParking() {
        if (listaCoches.isEmpty()) {
            return false;
        }
        
        // Vaciar la lista de coches
        listaCoches.clear();
        
        // Reinicializar los contadores de colores a 0
        for (Color color : cochesPorColor.keySet()) {
            cochesPorColor.put(color, 0);
        }
        
        // Reinicializar los contadores de marcas a 0
        for (Marca marca : cochesPorMarca.keySet()) {
            cochesPorMarca.put(marca, 0);
        }
        
        // Vaciar el mapa de coches iguales y el conjunto de coches
        cochesIguales.clear();
        conjuntoCoches.clear();
        
        return true;
    }

    
    // Métodos de reporte (sin modificaciones en la lógica de salida)
    
    public void reportParking() {
        System.out.println("LISTADO COCHES");
        System.out.println("Parking: " + nombre);
        for (Coche c : listaCoches) {
            System.out.println(c);
        }
        System.out.println("Total coches: " + listaCoches.size() + 
                           ", plazas libres: " + (totalPlazas - listaCoches.size()) + ".");
    }
    
    public void reportColores() {
        System.out.println("REPORT DE COLORES");
        System.out.println("Parking: " + nombre);
        int total = 0;
        for (Map.Entry<Color, Integer> entry : cochesPorColor.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println("El coche de color " + entry.getKey().getNombreCompleto() + 
                                   " se repite " + entry.getValue() + 
                                   (entry.getValue() == 1 ? " vez." : " veces."));
                total += entry.getValue();
            }
        }
        System.out.println("Total coches: " + total);
    }
    
    public void reportMarcas() {
        System.out.println("REPORT DE MARCAS");
        System.out.println("Parking: " + nombre);
        int total = 0;
        for (Map.Entry<Marca, Integer> entry : cochesPorMarca.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println("El coche de marca " + entry.getKey().getNombreCompleto() + 
                                   " se repite " + entry.getValue() + 
                                   (entry.getValue() == 1 ? " vez." : " veces."));
                total += entry.getValue();
            }
        }
        System.out.println("Total coches: " + total);
    }
    
    public void reportCochesIguales() {
        System.out.println("REPORT DE COCHES IGUALES");
        System.out.println("Parking: " + nombre);
        int total = 0;
        for (Map.Entry<Coche, Integer> entry : cochesIguales.entrySet()) {
            System.out.println(entry.getKey() + " se repite " + entry.getValue() + 
                               (entry.getValue() == 1 ? " vez." : " veces."));
            total += entry.getValue();
        }
        System.out.println("Total coches: " + total);
    }
    
    public void reportSetCoches() {
        System.out.println("REPORT SET DE COCHES");
        System.out.println("Parking: " + nombre);
        for (Coche c : conjuntoCoches) {
            System.out.println(c);
        }
        System.out.println("Total items: " + conjuntoCoches.size());
    }
    
    // Método de reporte completo
    public void reportCompleto() {
        System.out.println("      REPORTE COMPLETO     ");
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
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
