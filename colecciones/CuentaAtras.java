package colecciones;

public class CuentaAtras {
	private int[] valores;
	
	public CuentaAtras(int numeroInicial, int numeroFinal) {
		valores = new int[numeroInicial - numeroFinal + 1];
		for (int i = 0; i < valores.length; i++) {
			valores[i] = numeroInicial - i;
		}
	}

	@Override
	public String toString() {
		String resultado = "";
		for (int i = 0; i < valores.length; i++) {
			resultado += valores[i];
			if (i < valores.length - 1) {
				resultado += " ... ";
			}
		}
		return resultado;
	}

	public void quitaUno() {
		if (valores.length > 0) {
			int[] nuevosValores = new int[valores.length - 1];
			for (int i = 0; i < nuevosValores.length; i++) {
				nuevosValores[i] = valores[i];
			}
			valores = nuevosValores;
		}
	}

	public static void main(String[] args) {
		CuentaAtras c = new CuentaAtras(5, 2);
		System.out.println(c);
		c.quitaUno();
		System.out.println(c);
		c.quitaUno();
		System.out.println(c);
		c.quitaUno();
		System.out.println(c);
		c.quitaUno();
		System.out.println(c);

	}
}

