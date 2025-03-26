package arrayList1;

import java.util.ArrayList;

public class ArrayEjemplo1 {
	
	    private static void muestraYSubraya(String texto) {
	        System.out.println(texto);
	        for (int i = 0; i < texto.length(); i++) {
	            System.out.print("-");
	        }
	        System.out.println();
	    }

	    private static void muestraTodosLosDatos(ArrayList<String> lista) {
	        for (int i = 0; i < lista.size(); i++) {
	            System.out.print(lista.get(i) + " ");
	        }
	        System.out.println();
	        
	        muestraYSubraya("for-each");
	        for (String color : lista) {
	            System.out.print(color + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        ArrayList<String> colores = new ArrayList<>();
	        colores.add("rojo");
	        colores.add("amarillo");
	        colores.add("verde");
	        colores.add("rojo");
	        colores.add("amarillo");
	        colores.add("azul");
	        colores.add("naranja");
	        colores.add("marrón");
	        colores.add("verde");

	        muestraYSubraya("for");
	        muestraTodosLosDatos(colores);

	        // Borrar el segundo rojo
	        
	        int contadorRojo = 0;
	        for (int i = 0; i < colores.size(); i++) {
	            if (colores.get(i).equals("rojo")) {
	                contadorRojo++;
	                if (contadorRojo == 2) {
	                    colores.remove(i);
	                    break;
	                }
	            }
	        }

	        muestraYSubraya("ArrayList después de borrado segundo rojo");
	        muestraTodosLosDatos(colores);

	        // Borrar todos los amarillos con un bucle while
	        
	        int i = 0;
	        while (i < colores.size()) {
	            if (colores.get(i).equals("amarillo")) {
	                colores.remove(i);
	            } else {
	                i++;
	            }
	        }

	        muestraYSubraya("ArrayList después de borrado todos los amarillos");
	        muestraTodosLosDatos(colores);
	    }
	}

