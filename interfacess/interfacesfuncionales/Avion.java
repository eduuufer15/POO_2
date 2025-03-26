package interfacess.interfacesfuncionales;

public class Avion extends Vehiculo implements Volador{

	@Override
	public void planear() {
		System.out.println("Avion planeando");
	}

}
