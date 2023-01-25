package br.com.magnasistemas.planta.CSV;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import br.com.magnasistemas.planta.Planta;
import br.com.magnasistemas.planta.enumerators.Classes;
import br.com.magnasistemas.planta.enumerators.Filo; 
import br.com.magnasistemas.planta.enumerators.Ordem;


public class Entrada {

	public static void main(String args[]) throws FileNotFoundException {
		List<Object> registros = new ArrayList<>();
		TratadorDeCSV angiospermasDados = new TratadorDeCSV(); 
		TratadorDeCSV BriofitasDados = new TratadorDeCSV();
		TratadorDeCSV gimnospermasDados = new TratadorDeCSV();
		TratadorDeCSV pteridofitasDados = new TratadorDeCSV();
		String path = "C:\\\\Users\\\\isabe_1cpxcuy\\\\IdeaProjects\\\\ReinoPlantae\\PlantasConsulta.csv";
		Filo tiposFilo; 
		Ordem tiposOrdem;
		Classes tiposClasses;
		try (BufferedReader br = new BufferedReader(new InputStreamReader( new FileInputStream(path), StandardCharsets.UTF_8))) {
			String linhas = br.readLine(); 
			while (br.ready() && linhas != null) {
				linhas = br.readLine();
				String[] campo = linhas.split(",");
				tiposFilo = Filo.valueOf(campo[0].toUpperCase().trim().replace(" ", "_"));
				tiposClasses = Classes.valueOf(campo[1].toUpperCase().trim().replace(" ", "_"));
				tiposOrdem = Ordem.valueOf(campo[2].toUpperCase().trim().replace(" ", "_"));
				registros.add(tiposFilo);
				registros.add(tiposClasses);
				registros.add(tiposOrdem);  
				angiospermasDados.trataCSVAngiospermas(registros, tiposFilo, tiposClasses, tiposOrdem);
				BriofitasDados.trataCSVBriofitas(registros, tiposFilo, tiposClasses, tiposOrdem);
				gimnospermasDados.trataCSVGimnospermas(registros, tiposFilo, tiposClasses, tiposOrdem);
				pteridofitasDados.trataCSVPteridofitas(registros, tiposFilo, tiposClasses, tiposOrdem);
			}
			br.readLine(); 
			
		} catch (IOException e) {
			System.out.println("SEGUINTE ERRO ENCONTRADO: " + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("ALGUM VALOR INSERIDO É INVÁLIDO: " + e.getMessage()+"\n");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ALGUM CAMPO NÃO FOI PREENCHIDO!" + e.getMessage());
		}
		if (registros.size() > 0) {
			Saida arquivosaindo = new Saida();
			arquivosaindo.escreveArquivo(angiospermasDados.pegaAngiospermas(null), BriofitasDados.pegaBriofitas(null), gimnospermasDados.pegaGimnospermas(null), pteridofitasDados.pegaPteridofitas(null));
			Saida testCSV = new Saida();
			testCSV.readCSVFile();
		} else  {
			System.out.println("===================================== ATENÇÃO ALGO DEU ERRADO !=========================================\n\n"
							+ "PARA REALIZAR SUA CONSULTA É NECESSÁRIO INSERIR DADOS VÁLIDOS, ELA NÃO PODE ESTAR VAZIA\n"
							+ "OU COM UM DADO QUE NÃO EXISTA NA CONSULTA!!! \n\n"
							+ "=============================== CONSULTE A TAXONOMIA DO REINO PLANTAE ==================================\n\n"
							+ "FILOS DISPONÍVEIS: ANGIOSPERNAS,BRIOFITAS,GIMNOSPERMAS, PTERIDOFITAS\n\n"
							+ "CLASSES PERTECENTES A ANGIOSPERMAS: LYCOPODIOPHYTA,MONILOPHYTA(SEM ORDEM)\n"
							+ "ORDEM EXISTENTES EM ANGIOSPERMAS: ROSACEAS,ASTERACEA,LEGUMINOSAS,SEM_ORDEM\n\n"
							+ "CLASSES PERTECENTES A BRIOFITA: MARCHANTIOPHYTA,BRYOPHYTA,ANTHOCEROPHYTA,LYCOPODIOPHYTA,MONILOPHYTA\n"
							+ "ORDEM EXISTENTES EM BRIOFITAS: HEPATICAS,MUSGOS,ANTOCEROS\n\n"
							+ "ORDEM EXISTENTES EM GIMNOSPERMAS: CYCADACEAE,ZAMAIACEAE,STANGERIACEAE,WELWITSCHIALES,EPHEDRALES,GNETALES\n"
							+ "CLASSES PERTECENTES A GIMNOSPERMAS: MONOCOTILEDONEAS,EUDICOTILEDONEAS\n\n"
							+ "CLASSES PERTECENTES A PTERIDOFITAS: CONIFERAS(SEM ORDEM),CICADOFITAS,GNETOPHYTA,GINKGOPHYTA(SEM ORDEM)\n"
							+ "ORDEM EXISTENTES EM PTERIDOFITAS: LICOPIDIOS,ISOETES,SELAGINELLAS,SEM_ORDEM\n\n"
							+ "========== CONSULTE DE ACORDO COM AS INFORMAÇÕES ACIMA E VEJA SE SUA COMBINAÇÃO É VALIDA !===============");
		}
	}

}
