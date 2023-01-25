package br.com.magnasistemas.planta.Testes;

import br.com.magnasistemas.planta.DadosFilos.DadoA;
import br.com.magnasistemas.planta.angiospermas.Monocotiledoneas;
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

public class Testando {
	public static void main(String[] args) {

		/*Bananeira bananeira = new Bananeira.BananeiraBuilder().build();
		Monocotiledoneas aveia = new Aveia.AveiaBuilder().build();
		Alface alface = new Alface.AlfaceBuilder().build();
		Girassol girassol = new Girassol.GirassolBuilder().build();
		Feijao feijao = new Feijao.FeijaoBuilder().build();
		Soja soja = new Soja.SojaBuilder().build();
		Ameixas ameixas = new Ameixas.AmeixasBuilder().build();
		Damasqueiro damasco = new Damasqueiro.DamasqueiroBuilder().build();
		Riccia riccia = new Riccia.RicciaBuilder().build();
		Marchantia marchantia = new Marchantia.MarchantiaBuilder().build();
		Agrestis agrestis = new Agrestis.AgrestisBuilder().build();
		Fusiformis fusiformis = new Fusiformis.FusiformisBuilder().build();
		Andreaeidae andreaeidae = new Andreaeidae.AndreaeidaeBuilder().build();
		Sphagnidae sphagnidae = new Sphagnidae.SphagnidaeBuilder().build();
		Clavatum clavatum = new Clavatum.ClavatumBuilder().build();
		Azorica azorica = new Azorica.AzoricaBuilder().build();
		Moellendorffii moellendorffii = new Moellendorffii.MoellendorffiiBuilder().build();
		Cavalinha cavalinha = new Cavalinha.CavalinhaBuilder().build();
		Samambaia samambaia = new Samambaia.SamambaiaBuilder().build();
		Araucarias araucarias = new Araucarias.AraucariasBuilder().build();
		Pinheiros pinheiros = new Pinheiros.PinheirosBuilder().build();
		Cicadaceas cicadaceas = new Cicadaceas.CicadaceasBuilder().build();
		Zamiaceaes zamiaceaes = new Zamiaceaes.ZamiaceaesBuilder().build();
		StangeriaEriopus eriopus = new StangeriaEriopus.StangeriaEriopusBuilder().build();
		MaHuang mahuang = new MaHuang.MaHuangBuilder().build();
		WelwitschiaMirabilis mirabilis = new WelwitschiaMirabilis.WelwitschiaMirabilisBuilder().build();
		Gnetum gnetum = new Gnetum.GnetumBuilder().build();
		GinkgoBiloba biloba = new GinkgoBiloba.GinkgoBilobaBuilder().build();
		DadoA teste = new DadoA.DadoABuilder().build();
		System.out.println("========MONOCOTILEDÔNEAS===========");
		System.out.println(bananeira);
		System.out.println();
		System.out.println(aveia);
		System.out.println();
		System.out.println("========ASTERACEAE===========");
		System.out.println(alface);
		System.out.println();
		System.out.println(girassol);
		System.out.println();
		System.out.println("========LEGUMINOSAS===========");
		System.out.println(feijao);
		System.out.println();
		System.out.println(soja);
		System.out.println();
		System.out.println("========ROSACEAS===========");
		System.out.println(ameixas);
		System.out.println();
		System.out.println(damasco);
		System.out.println();
		System.out.println("========HEPATICAS===========");
		System.out.println(riccia);
		System.out.println();
		System.out.println(marchantia);
		System.out.println();
		System.out.println("========ANTOCEROS===========");
		System.out.println(agrestis);
		System.out.println();
		System.out.println(fusiformis);
		System.out.println();
		System.out.println("========MUSGOS===========");
		System.out.println(andreaeidae);
		System.out.println();
		System.out.println(sphagnidae);
		System.out.println();
		System.out.println("========LICOPODIOS===========");
		System.out.println(clavatum);
		System.out.println();
		System.out.println("========ISOETES===========");
		System.out.println(azorica);
		System.out.println();
		System.out.println("========SELAGINELLAS===========");
		System.out.println(moellendorffii);
		System.out.println();
		System.out.println("========MONILOPHYTAS===========");
		System.out.println(cavalinha);
		System.out.println();
		System.out.println(samambaia);
		System.out.println();
		System.out.println("========CONÍFEROS===========");
		System.out.println(araucarias);
		System.out.println();
		System.out.println(pinheiros);
		System.out.println();
		System.out.println("========CICADÓFITAS===========");
		System.out.println(cicadaceas);
		System.out.println();
		System.out.println(zamiaceaes);
		System.out.println();
		System.out.println(eriopus);
		System.out.println();
		System.out.println("========EPHEDRALES===========");
		System.out.println(mahuang);
		System.out.println();
		System.out.println("========WELWISCHIALES===========");
		System.out.println(mirabilis);
		System.out.println();
		System.out.println("========GNETALES================");
		System.out.println(gnetum);
		System.out.println();
		System.out.println("========GINKGOPHYTA================");
		System.out.println(biloba);
		System.out.println();
		System.out.println(teste);
		System.out.println(teste.equals(biloba));*/

		Bananeira banana = new Bananeira.BananeiraBuilder().build();
		Riccia briofitas = new Riccia.RicciaBuilder().build();
		
		
		System.out.println(briofitas.nascendo());
		System.out.println(briofitas.crescimento());
		System.out.println(briofitas.fotossintese());
		System.out.println(briofitas.reproducao());
		System.out.println(briofitas.falecendo());

	}

	public void readCSVFile() {
		// TODO Auto-generated method stub
		
	}

}
