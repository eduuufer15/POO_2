package arraylist;

public class PruebasArraysNDimensionales {
	public static void main(String[] args) {

		int[][] array2D = new int[4][3];
		int[][] array2D_2 = {{3, 2, 5} , {1, 7}};
		
		for (int i = 0; i < array2D.length; i++) {
			for (int j = 0; j < array2D[i].length; j++) {
				array2D[i][j] = 1;
			}
		}
		
		for (int i = 0; i < array2D_2.length; i++) {
			for (int j = 0; j < array2D_2[i].length; j++) {
				System.out.print(array2D_2[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
