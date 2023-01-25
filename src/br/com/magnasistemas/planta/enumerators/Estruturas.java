package br.com.magnasistemas.planta.enumerators;

public enum Estruturas {
	ARBUSTOS("ARBUSTOS"),
	ARVORES_CADUCIFOLIA("ARVORES CADUCIFOLIA"),
	ARVORES("ARVORES"),
	ARVORES_ARBUSTOS("ARVORES_ARBUSTOS"),
	ARVORES_E_ARBUSTO_EQUATORIAIS("ARVORES E ARBUSTO EQUATORIAIS"),
	ARVORES_E_ARBUSTO_SUBARBUSTOS("ARVORES E ARBUSTO SUBARBUSTOS"),
	SUBBOSQUES_COM_ESPINHOS("SUBBOSQUES COM ESPINHOS"),
	CAVIDADES_INTERNAS("CAVIDADES_INTERNAS");

	private String tiposEstruturas;

	Estruturas(String tiposEstruturas) {
		this.tiposEstruturas= tiposEstruturas;
	}

	public String getEstruturas() {
		return this.tiposEstruturas;
	}

}
