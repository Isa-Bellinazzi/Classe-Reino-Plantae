package br.com.magnasistemas.planta.enumerators;

public enum Classes {
	MARCHANTIOPHYTA("MARCHANTIOPHYTA"),
	BRYOPHYTA("BRYOPHYTA"),
	ANTHOCEROPHYTA("ANTHOCEROPHYTA"),
	LYCOPODIOPHYTA("LYCOPODIOPHYTA"),
	MONILOPHYTA("MONILOPHYTA"),
	MONOCOTILEDONEAS("MONOCOTILEDONEAS"),
	EUDICOTILEDONEAS("EUDICOTILEDONEAS"),
	CONIFERAS("CONIFERAS"),
	CICADOFITAS("CICADOFITAS"),
	GNETOPHYTA("GNETOPHYTA"),
	GINKGOPHYTA("GINKGOPHYTA");
	
	private String tiposClasse;

	Classes(String tiposClasse) {
		this.tiposClasse = tiposClasse;
	}
	public String getClasses() {
		return this.tiposClasse;
	}

}
