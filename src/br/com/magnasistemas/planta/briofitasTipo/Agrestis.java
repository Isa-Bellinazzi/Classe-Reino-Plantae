package br.com.magnasistemas.planta.briofitasTipo;

import br.com.magnasistemas.planta.briofitas.Antoceros;
import br.com.magnasistemas.planta.briofitasTipo.Riccia.RicciaBuilder;
import br.com.magnasistemas.planta.enumerators.Extras;
import br.com.magnasistemas.planta.enumerators.Frutos;
import br.com.magnasistemas.planta.enumerators.Sementes;

public class Agrestis extends Antoceros {
	protected final Extras tiposExtras = Extras.AQUATICAS;

	String nome = "AGRESTIS";

	public Agrestis(AgrestisBuilder builder) {

	}

	public static class AgrestisBuilder {


		public Agrestis build() {
			return new Agrestis(this);
		}

	}

	@Override
	public String toString() {
		return "\n"+"\n" +"PLANTA:   " + this.nome + "\n" + "TIPO:     " + this.tiposFrutos + "\n" + "FILO:     " + this.tiposFilo + "\n"
				+ "VASOS:    " + tiposVasos + "\n" + "CLASSE:   " + this.tiposClasses + "\n" + "ORDEM:    " + this.tiposOrdem + "\n" + "RAIZ:     "
				+ this.tiposRaiz + "\n" + "FOLHAS:   " + this.tiposFolhagem + "\n" + "CAULE:    " + this.tiposCaule + "\n" + "SEMENTES: " + this.tiposSementes
				+ "\n" + "TALOS:    " + this.tiposTalos;
	}
}
