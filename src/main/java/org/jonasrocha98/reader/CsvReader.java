package org.jonasrocha98.reader;

import org.jonasrocha98.CsvData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    public static CsvData ler(String caminhoDoArquivo){
        List<String[]> dados = new ArrayList<>();
        String[] cabecalho = null;
        try {
            List<String> linhas = Files.readAllLines(Paths.get(caminhoDoArquivo));
            cabecalho = linhas.get(0).split(","); //guarda o cabeçalho
            for (int i = 1; i< linhas.size(); i++){ //começa no indice 1
                String[] v = linhas.get(i).split(",");
                dados.add(v);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo " + e.getMessage());
        }
        return new CsvData(cabecalho, dados);
    }
}
