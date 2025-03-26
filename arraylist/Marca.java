package arraylist;

import java.util.Random;

public enum Marca {
	VW, SE, AU;
	
	private static Random random = new Random();
	
	
	public static Marca aleatorio() {
		Random random = new Random();
		return Marca.values()[random.nextInt(Marca.values().length)];
	}
}
