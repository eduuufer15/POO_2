package examen;

public class Test {
	public static void main(String[] args) {
		Edificio edificio = new Edificio(5, 500.0);
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona p3 = new Persona();
		
		edificio.entrar(p1);
		edificio.entrar(p2);
		edificio.entrar(p3);
		
		System.out.println(edificio.obternerInforme());
		
		edificio.salir(p2);
		
		System.out.println();
		System.out.println(edificio.obternerInforme());
		
	}
}
