package vehiculos;

public class Test {
	public static void main(String[] args) {
		Coche c = new Coche (160, 4, 1300, "4947KBL");
		System.out.println(c);
		Moto m = new Moto(160, 2, 500, "5850LNB"); 
		System.out.println(m);
		Bicicleta b = new Bicicleta(20, 2, 40);
		System.out.println(b);
	}
}
