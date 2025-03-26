package arraylist;
	import java.util.ArrayList;

	public class ArrayListLibros {
	    public static void main(String[] args) {
	    	
	        // Crear un ArrayList con títulos de libros
	    	
	        ArrayList<String> libros = new ArrayList<>();

	        // Añadir 5 libros a la lista
	        
	        libros.add("Cien años de soledad");
	        libros.add("1984");
	        libros.add("El Alquimista");
	        libros.add("El Principito");
	        libros.add("El retrato de Dorian Gray");

	        // Mostrar los libros con un bucle for
	        
	        System.out.println("Lista de libros:");
	        for (String libro : libros) {
	            System.out.println(libro);
	        }
	        
	        libros.add(2, "Don Quijote de la Mancha");
	        System.out.println("\nDespués de añadir 'Don Quijote de la Mancha' en la posición 2:");
	        for (String libro : libros) {
	            System.out.println(libro);
	        }
	        
	        System.out.println("\nLa lista contotiene? '1984'" + libros.contains("1984"));
	        
	        System.out.println("\nLibro de la posicion 4 " + libros.get(4));
	        
	        System.out.println();
	        }
	    
	    
	    }
	


