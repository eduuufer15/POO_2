package examen;


public enum ColorPelo {
	RUBIO("Rubio"),
	PELIRROJO("Pelirrojo"),
	NEGRO("Negro"),
	CANOSO("Canoso");
	
	private String nombreColorDePelo;


	private ColorPelo(String nombreColorPelo) {
		this.nombreColorDePelo = nombreColorPelo;
	}


	public String getNombre() {
		return nombreColorDePelo;
	}

}
