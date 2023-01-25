package br.com.magnasistemas.planta.enumerators;

public enum Vasos {
	AVASCULAR("AVASCULAR"), VASCULAR("VASCULAR");

	private String tiposVasos;

	Vasos(String tiposVasos) {
		this.tiposVasos = tiposVasos;
	}

	public String getVasos() {
		return this.tiposVasos;
	}

}
