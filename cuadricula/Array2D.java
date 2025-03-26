package cuadricula;

public class Array2D {
	int filas;
	int columnas;
	int[][] array;
	
	public Array2D(int filas, int columnas, int[][] array) {
		this.filas = filas < 0 ? 0 : filas > 10 ? 10 : filas;
		this.columnas = columnas < 0 ? 0 : columnas > 10 ? 10 : columnas;
		this.array = array;
	}
	
	
	
	
}
