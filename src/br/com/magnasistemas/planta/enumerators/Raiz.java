package br.com.magnasistemas.planta.enumerators;

public enum Raiz {
	SEM_RAIZ_POSSUE_RIZOIDES("SEM RAIZ POSSUE RIZOIDES"), 
	ADVENTICIAS_E_ENDOGENAS("ADVENTICIAS E ENDOGENAS"), 
	FASCICULADA_OU_CABELEIRA("FASCICULADA OU CABELEIRA"),
	PIVOTANTE_OU_AXIAL_PRINCIPAL("PIVOTANTE OU AXIAL PRINCIPAL"),
	PIVOTANTE("PIVOTANTE"),
	APRUMADA("APRUMADA"),
	AXIAL("AXIAL"),
	PRINCIPAL("PRINCIPAL"),
	HETEROMORFICA("HETEROMORFICA"),
	RADICULAR("RADICULAR"),
	SUPERFICIAIS("SUPERFICIAIS"),
	RAMIFICADA("RAMIFICADA"),
	PROTOXILEMA("PROTOXILEMA"),
	PROFUNDA("PROFUNDA"),
	CONTRATEIS("CONTRATEIS");


	private String tiposRaiz;

	Raiz(String tiposRaiz) {
		this.tiposRaiz = tiposRaiz;
	}
	public String getRaiz() {
		return this.tiposRaiz;
	}
} 

