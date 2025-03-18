package examen;



public enum Continente {
	EUROPA("Europa"),
	AMERICA("América"),
	ASIA("Asia"),
	AFRICA("África"),
	OCEANIA("Oceania"),
	ANTARTIDA("Antártida");
	
	private String nombreDeContinente;

	private Continente(String nombreDeContinente) {
		this.nombreDeContinente = nombreDeContinente;
	}

	public String getNombre() {
		return nombreDeContinente;
	}

	public void setNombre(String nombre) {
		this.nombreDeContinente = nombre;
	}
	
	
	
}
