package br.com.magnasistemas.planta.enumerators;

public enum Flores {
	SEM_FLORES("SEM FLORES"), 
	TRIMERAS("TRIMERAS"), 
	TETRAMERAS_TRIMERAS_PENTAMERAS("TETRAMERAS_TRIMERAS_PENTAMERAS"),
	VISTOSAS_E_ACTINOMORFICAS("VISTOSAS_E_ACTINOMORFICAS"),
	HELIOTROPISMO("HELIOTROPISMO"),
	AGERATO("AGERATO"),
	MASCULINAS_COM_PISTILO_MODIFICADO("MASCULINAS COM PISTILO MODIFICADO"),
	CONCAVO_OU_PLANO_CONVEXO("CONCAVO OU PLANO CONVEXO");
	 
	private String tiposFlores;

	Flores(String tiposFlores) {
		this.tiposFlores = tiposFlores;
	}
	public String getFlores() { 
		return this.tiposFlores;
	}

}

