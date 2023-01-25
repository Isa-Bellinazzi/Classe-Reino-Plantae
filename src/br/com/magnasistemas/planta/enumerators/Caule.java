package br.com.magnasistemas.planta.enumerators;

public enum Caule {
	DESORDENADO("DESORDENADO"),
	CILINDRICO("CILINDRICO"),
	PROSTADOS("PROSTADOS"),
	RAMIFICADOS("RAMIFICADOS"),
	LENHOSO("LENHOSO"),
	SUBTERRANEO("LENHOSO"),
	RAMOSO("RAMOSO"),
	HERBACEO("HERBACEO"),
	LEPTOIDE("LEPTOIDE"),
	ESPORIFEROS("ESPORIFEROS"),
	COLUNARES("COLUNARES"),
	SEM_CAULE_POSSUI_CAULOIDES("SEM CAULE POSSUI CAULOIDES");
	 
	private String tiposCaule;

	Caule(String tiposCaule) {
		this.tiposCaule = tiposCaule;
	}
	public String getCaule() {
		return this.tiposCaule;
	}

}
