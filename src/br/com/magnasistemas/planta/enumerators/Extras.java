package br.com.magnasistemas.planta.enumerators;

public enum Extras {
	MEDICINAL("MEDICINAL"),
	RASTEIRA("RASTEIRA"),
	RASTEJANTES("RASTEJANTES"),
	TREPADEIRAS_E_LIANAS("TREPADEIRAS_E_lIANAS"),
	ERVAS("ERVAS"),
	CONES_E_PINHAS("CONES_E_PINHAS"),
	TRONCOS_E_CONES("TRONCOS_E_CONES"),
	CONES("CONES"),
	AQUATICAS("AQUATICAS"),
	TRONCOS("TRONCOS"),
	ESPINHOS("ESPINHOS"),
	DOICAS("DOICAS"),
	MAIS_DE_UMA_CAMADA_DE_CELULAS("MAIS_DE_UMA_CAMADA_DE_CELULAS"),
	UMA_CAMADA_DE_CELULAS("_UMA_CAMADA_DE_CELULAS"),
	CLAVARIA("CLAVARIA");

	private String tiposExtras;

	Extras(String tiposExtras) {
		this.tiposExtras= tiposExtras; 
	}

	public String getExtras() {
		return this.tiposExtras;
	}

}
