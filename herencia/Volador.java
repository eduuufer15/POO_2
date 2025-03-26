package herencia; 

public interface Volador {
	public abstract void despega();
	public abstract void aterriza();
	void planea(); //Es igual que si ponemos public abstract void planea() se pone asi porque al ser una interfaz el metodo siempre sera publico y abstracto
}
