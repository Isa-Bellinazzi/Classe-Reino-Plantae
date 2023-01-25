package br.com.magnasistemas.planta.enumerators;

public enum Frutos {
	SEM_FRUTOS("SEM FRUTOS"),
	FORMATO_VAGEM_OU_FAVA("FORMATO VAGEM"),
	AGREGADOS("AGREGADOS"),
	PARTENOCARPICO("PARTENOCARPICO"),
	CEREAL("CEREAL"),
	HORTALICAS("HORTALIÇAS"),
	INDEISCENTES("INDEISCENTES"),
	GRAOS("GRAOS"),
	VAGENS("VAGENS"),
	DRUPAS("DRUPAS"),
	HERBACEA("HERBACEA"),
	SECA("SECA"),
	ALCALOIDES("ALCALOIDES"),
	SEM_FRUTOS_POSSUE_ESTROBILOS("SEM_FRUTOS_POSSUE_ESTROBILOS");

	private String tiposFrutos;

	Frutos(String tiposFrutos) {
		this.tiposFrutos = tiposFrutos;
	}

	public String getFrutos() {
		return this.tiposFrutos;
	}

}


