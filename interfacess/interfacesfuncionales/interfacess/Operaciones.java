package interfacess.interfacesfuncionales.interfacess;

import java.util.List;

public class Operaciones implements OperacionEntraEnteroSaleEntero{
	private int x;

	public int cuadrado(int x) {
		return x * x;
	}

	public int cubo(int x) {
		return x * x * x;
	}

	public int doble(int x) {
		return 2 * x;
	}

	public int triple(int x) {
		return 3 * x;
	}

	public int polinomio(int x) {
		return polinomioVariable (5, 7, 9, x);
	}

	public int polinomioVariable(int x, int a, int b, int c) {
		return a * x * x * x + b * x * x + c;
	}
	public List [Integer] filtra (int [] numeros, FiltroEnteros f) {
		List<Integer> listaFiltrada = new ArrayList<>();
		for (int num : numeros) {
			if(f.filtrar(num)) {
				listraFiltrada.add(num);
			}
		}
		return listaFiltrada;
	}
	
	public static void main(String[] args) {
//		Operaciones operaciones = new Operaciones();
		int x = 2;
		
//		System.out.println(operaciones.cuadrado(x));
//		System.out.println(operaciones.cubo(x));
//		System.out.println(operaciones.doble(x));
//		System.out.println(operaciones.triple(x));
//		System.out.println(operaciones.polinomio(x));
//		System.out.println(operaciones.polinomioVariable(x, x, x, x));

		OperacionEntraEnteroSaleEntero cuadrado = (int s) -> {return s * s;}; // Es lo mismo que s -> s * s; solo que es la fomra simplificada 
		OperacionEntraEnteroSaleEntero cubo = s -> s * s * s;
		OperacionEntraEnteroSaleEntero doble = s -> 2 * s;
		OperacionEntraEnteroSaleEntero triple = s -> 3 * s;
		OperacionEntraEnteroSaleEntero polinomio = s -> 5 * s * s * s + 7 * s * s + 9;
		OperacionEntra4EnterosSaleEntero polinomioVariable = (a, b, c, s) -> a * s * s * s + b * s * s + c;
		OperacionEntraEnteroSaleEntero mitad = s -> s / 2;
		OperacionEntraEnteroSaleEntero cuartaParte = s -> s / 4;
		OperacionEntraEnteroSaleEntero decimaParte = s -> s / 10;
		OperacionEntraDoubleIntSaleDouble nSimaParte = (s, p) -> x / p;

		System.out.println("Cuadrado: " + cuadrado.dale(x));
		System.out.println("Cubo: " + cubo.dale(x));
		System.out.println("Doble: " + doble.dale(x));
		System.out.println("Triple: " + triple.dale(x));
		System.out.println("Polinomio: " + polinomio.dale(x));
		System.out.println("Polinomio: " + polinomioVariable.dale(5, 7 , 9, x));
		System.out.println(mitad.dale(x));
		System.out.println(cuartaParte.dale(x));
		System.out.println(decimaParte.dale(x));
		System.out.println(nSimaParte.dale(x, 20));
		

	}

	@Override
	public int dale(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
