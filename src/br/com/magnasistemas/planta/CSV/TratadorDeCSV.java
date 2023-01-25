package br.com.magnasistemas.planta.CSV;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.magnasistemas.planta.angiospermasTipo.Alface;
import br.com.magnasistemas.planta.angiospermasTipo.Ameixas;
import br.com.magnasistemas.planta.angiospermasTipo.Aveia;
import br.com.magnasistemas.planta.angiospermasTipo.Bananeira;
import br.com.magnasistemas.planta.angiospermasTipo.Damasqueiro;
import br.com.magnasistemas.planta.angiospermasTipo.Feijao;
import br.com.magnasistemas.planta.angiospermasTipo.Girassol;
import br.com.magnasistemas.planta.angiospermasTipo.Soja;
import br.com.magnasistemas.planta.briofitasTipo.Agrestis;
import br.com.magnasistemas.planta.briofitasTipo.Andreaeidae;
import br.com.magnasistemas.planta.briofitasTipo.Fusiformis;
import br.com.magnasistemas.planta.briofitasTipo.Marchantia;
import br.com.magnasistemas.planta.briofitasTipo.Riccia;
import br.com.magnasistemas.planta.briofitasTipo.Sphagnidae;
import br.com.magnasistemas.planta.enumerators.Classes;
import br.com.magnasistemas.planta.enumerators.Filo;
import br.com.magnasistemas.planta.enumerators.Ordem;
import br.com.magnasistemas.planta.gimnospermasTipo.Araucarias;
import br.com.magnasistemas.planta.gimnospermasTipo.Cicadaceas;
import br.com.magnasistemas.planta.gimnospermasTipo.GinkgoBiloba;
import br.com.magnasistemas.planta.gimnospermasTipo.Gnetum;
import br.com.magnasistemas.planta.gimnospermasTipo.MaHuang;
import br.com.magnasistemas.planta.gimnospermasTipo.Pinheiros;
import br.com.magnasistemas.planta.gimnospermasTipo.StangeriaEriopus;
import br.com.magnasistemas.planta.gimnospermasTipo.WelwitschiaMirabilis;
import br.com.magnasistemas.planta.gimnospermasTipo.Zamiaceaes;
import br.com.magnasistemas.planta.pteridofitasTipo.Azorica;
import br.com.magnasistemas.planta.pteridofitasTipo.Cavalinha;
import br.com.magnasistemas.planta.pteridofitasTipo.Clavatum;
import br.com.magnasistemas.planta.pteridofitasTipo.Moellendorffii;
import br.com.magnasistemas.planta.pteridofitasTipo.Samambaia;

public class TratadorDeCSV {
	protected List<Object> angiospermas; 
	protected List<Object> briofitas;
	protected List<Object> gimnospermas;
	protected List<Object> pteridofitas;
	public void trataCSVAngiospermas(List<Object> registros, Filo tiposFilo, Classes tiposClasses, Ordem tiposOrdem)
			throws FileNotFoundException {
		List<Object> angiospermas = new ArrayList<>();
		if (tiposFilo == Filo.ANGIOSPERMAS && tiposClasses == Classes.EUDICOTILEDONEAS
				&& tiposOrdem == Ordem.ASTERACEAE) {
			Alface alface = new Alface.AlfaceBuilder().build();
			Girassol girassol = new Girassol.GirassolBuilder().build();
			angiospermas.add(alface);
			angiospermas.add(girassol);
		} else if (tiposFilo == Filo.ANGIOSPERMAS && tiposClasses == Classes.EUDICOTILEDONEAS
				&& tiposOrdem == Ordem.ROSACEAS) {
			Ameixas ameixas = new Ameixas.AmeixasBuilder().build();
			Damasqueiro damasco = new Damasqueiro.DamasqueiroBuilder().build();
			angiospermas.add(ameixas);
			angiospermas.add(damasco);
		} else if (tiposFilo == Filo.ANGIOSPERMAS && tiposClasses == Classes.EUDICOTILEDONEAS
				&& tiposOrdem == Ordem.LEGUMINOSAS) {
			Feijao feijao = new Feijao.FeijaoBuilder().build();
			Soja soja = new Soja.SojaBuilder().build();
			angiospermas.add(feijao);
			angiospermas.add(soja);
		} else if (tiposFilo == Filo.ANGIOSPERMAS && tiposClasses == Classes.MONOCOTILEDONEAS
				&& tiposOrdem == Ordem.SEM_ORDEM) {
			Bananeira bananeira = new Bananeira.BananeiraBuilder().build();
			Aveia aveia = new Aveia.AveiaBuilder().build();
			angiospermas.add(bananeira);
			angiospermas.add(aveia);
		}
		return;
	}

	public void trataCSVBriofitas(List<Object> registros, Filo tiposFilo, Classes tiposClasses, Ordem tiposOrdem)
			throws FileNotFoundException {
		List<Object> briofitas = new ArrayList<>();
		if (tiposFilo == Filo.BRIOFITAS && tiposClasses == Classes.MARCHANTIOPHYTA && tiposOrdem == Ordem.HEPATICAS) {
			Riccia riccia = new Riccia.RicciaBuilder().build();
			Marchantia marchantia = new Marchantia.MarchantiaBuilder().build();
			briofitas.add(riccia);
			briofitas.add(marchantia);
		} else if (tiposFilo == Filo.BRIOFITAS && tiposClasses == Classes.BRYOPHYTA && tiposOrdem == Ordem.MUSGOS) {
			Sphagnidae sphagnidae = new Sphagnidae.SphagnidaeBuilder().build();
			Andreaeidae andreaeidae = new Andreaeidae.AndreaeidaeBuilder().build();
			briofitas.add(sphagnidae);
			briofitas.add(andreaeidae);
		} else if (tiposFilo == Filo.BRIOFITAS && tiposClasses == Classes.ANTHOCEROPHYTA
				&& tiposOrdem == Ordem.ANTOCEROS) {
			Agrestis agrestis = new Agrestis.AgrestisBuilder().build();
			Fusiformis fusiformis = new Fusiformis.FusiformisBuilder().build();
			briofitas.add(agrestis);
			briofitas.add(fusiformis);
		}
		return;
	}

	public void trataCSVGimnospermas(List<Object> registros, Filo tiposFilo, Classes tiposClasses, Ordem tiposOrdem)
			throws FileNotFoundException {
		List<Object> gimnospermas = new ArrayList<>();
		if (tiposFilo == Filo.GIMNOSPERMAS && tiposClasses == Classes.CONIFERAS && tiposOrdem == Ordem.SEM_ORDEM) {
			Araucarias araucarias = new Araucarias.AraucariasBuilder().build();
			Pinheiros pinheiros = new Pinheiros.PinheirosBuilder().build();
			gimnospermas.add(araucarias);
			gimnospermas.add(pinheiros);
		} else if (tiposFilo == Filo.GIMNOSPERMAS && tiposClasses == Classes.CICADOFITAS
				&& tiposOrdem == Ordem.CYCADACEAE) {
			Cicadaceas cicadaceas = new Cicadaceas.CicadaceasBuilder().build();
			gimnospermas.add(cicadaceas);
		} else if (tiposFilo == Filo.GIMNOSPERMAS && tiposClasses == Classes.CICADOFITAS
				&& tiposOrdem == Ordem.ZAMIACEAE) {
			Zamiaceaes zamiaceae = new Zamiaceaes.ZamiaceaesBuilder().build();
			gimnospermas.add(zamiaceae);
		} else if (tiposFilo == Filo.GIMNOSPERMAS && tiposClasses == Classes.CICADOFITAS
				&& tiposOrdem == Ordem.STANGERIACEAE) {
			StangeriaEriopus eriopus = new StangeriaEriopus.StangeriaEriopusBuilder().build();
			gimnospermas.add(eriopus);
		} else if (tiposFilo == Filo.GIMNOSPERMAS && tiposClasses == Classes.GNETOPHYTA
				&& tiposOrdem == Ordem.WELWITSCHIALES) {
			WelwitschiaMirabilis mirabilis = new WelwitschiaMirabilis.WelwitschiaMirabilisBuilder().build();
			gimnospermas.add(mirabilis);
		} else if (tiposFilo == Filo.GIMNOSPERMAS && tiposClasses == Classes.GNETOPHYTA
				&& tiposOrdem == Ordem.GNETALES) {
			Gnetum gnetum = new Gnetum.GnetumBuilder().build();
			gimnospermas.add(gnetum);
		} else if (tiposFilo == Filo.GIMNOSPERMAS && tiposClasses == Classes.GNETOPHYTA
				&& tiposOrdem == Ordem.EPHEDRALES) {
			MaHuang mahuang = new MaHuang.MaHuangBuilder().build();
			gimnospermas.add(mahuang);
		} else if (tiposFilo == Filo.GIMNOSPERMAS && tiposClasses == Classes.GINKGOPHYTA
				&& tiposOrdem == Ordem.SEM_ORDEM) {
			GinkgoBiloba biloba = new GinkgoBiloba.GinkgoBilobaBuilder().build();
			gimnospermas.add(biloba);
		}
	}

	public void trataCSVPteridofitas(List<Object> registros, Filo tiposFilo, Classes tiposClasses, Ordem tiposOrdem)
			throws FileNotFoundException {
		List<Object> pteridofitas = new ArrayList<>();
		if (tiposFilo == Filo.PTERIDOFITAS && tiposClasses == Classes.MONILOPHYTA && tiposOrdem == Ordem.SEM_ORDEM) {
			Cavalinha cavalinha = new Cavalinha.CavalinhaBuilder().build();
			Samambaia samambaia = new Samambaia.SamambaiaBuilder().build();
			pteridofitas.add(cavalinha);
			pteridofitas.add(samambaia);
		} else if (tiposFilo == Filo.PTERIDOFITAS && tiposClasses == Classes.LYCOPODIOPHYTA
				&& tiposOrdem == Ordem.LICOPODIOS) {
			Clavatum clavatum = new Clavatum.ClavatumBuilder().build();
			pteridofitas.add(clavatum);
		} else if (tiposFilo == Filo.PTERIDOFITAS && tiposClasses == Classes.LYCOPODIOPHYTA
				&& tiposOrdem == Ordem.ISOETES) {
			Azorica azorica = new Azorica.AzoricaBuilder().build();
			pteridofitas.add(azorica);
		} else if (tiposFilo == Filo.PTERIDOFITAS && tiposClasses == Classes.LYCOPODIOPHYTA
				&& tiposOrdem == Ordem.SELAGINELLAS) {
			Moellendorffii moellendorffii = new Moellendorffii.MoellendorffiiBuilder().build();
			pteridofitas.add(moellendorffii);
		}
		return;
	}


	public List<Object> pegaAngiospermas(List<Object> angiospermas){
		return  this.angiospermas = angiospermas; 
	}
	public List<Object> pegaBriofitas(List<Object> briofitas){
		return  this.briofitas = briofitas; 
	}
	public List<Object> pegaGimnospermas(List<Object> gimnospermas){
		return  this.gimnospermas = gimnospermas; 
	}	
	public List<Object> pegaPteridofitas(List<Object> pteridofitas){
		return  this.pteridofitas = pteridofitas; 
	}
	
}
