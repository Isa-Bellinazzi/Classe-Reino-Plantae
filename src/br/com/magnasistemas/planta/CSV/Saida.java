package br.com.magnasistemas.planta.CSV;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.magnasistemas.planta.DadosFilos.DadoA;
import br.com.magnasistemas.planta.DadosFilos.DadoB;
import br.com.magnasistemas.planta.DadosFilos.DadoG;
import br.com.magnasistemas.planta.DadosFilos.DadoP;

public class Saida {
	public void escreveArquivo(List<Object> angiospermas, List<Object> briofitas,
			List<Object> gimnospermas, List<Object> pteridofitas) {
		try (PrintWriter writer = new PrintWriter(new File("ListaDeRegistroPlantas.csv"))) {
			StringBuilder sb = new StringBuilder();
			sb.append("REGISTROS DE PLANTAS BASEADO NA SUA CONSULTA");
			sb.append('\n');
			sb.append('\n');
			if (angiospermas != null) {
				DadoA dadoA = new DadoA.DadoABuilder().build();
				sb.append("PLANTAS DO FILO ANGIOSPERMAS");
				sb.append(angiospermas);
				sb.append(dadoA);
				sb.append('\n');
			}
			if (briofitas != null) {
				DadoB dadoB = new DadoB.DadoBBuilder().build();
				sb.append("PLANTAS DO FILO BRIOFITAS");
				sb.append(briofitas);
				sb.append(dadoB);
				sb.append('\n');
			}
			if (gimnospermas != null) {
				DadoG dadoG = new DadoG.DadoGBuilder().build();
				sb.append("PLANTAS DO FILO GMINOSPERMAS");
				sb.append(gimnospermas);
				sb.append(dadoG);
				sb.append('\n');
			}
			if (pteridofitas != null) {
				DadoP dadoP = new DadoP.DadoPBuilder().build();
				sb.append("PLANTAS DO FILO PTERIDOFITAS");
				sb.append(pteridofitas);
				sb.append(dadoP);
				sb.append('\n');
			}
			writer.write(sb.toString());
			writer.close();
			System.out.println("Consulta realizada com sucesso!");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	public void readCSVFile() throws FileNotFoundException {
		List<List<String>> records = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("ListaDeRegistroPlantas.csv"));) {
			while (scanner.hasNextLine()) {
				records.add(getRecordFromLine(scanner.nextLine()));
			}
		}
		System.out.println(records.toString());
	}

	private List<String> getRecordFromLine(String line) {
		List<String> values = new ArrayList<String>();
		try (Scanner rowScanner = new Scanner(line)) {
			rowScanner.useDelimiter(" ");
			while (rowScanner.hasNext()) {
				values.add(rowScanner.next());
			}
		}
		return values;
	}



}
