package org.jonasrocha98;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    public static List<String[]> ler(String caminhoDoArquivo){
        List<String[]> dados = new ArrayList<>();
        try {
            List<String> linhas = Files.readAllLines(Paths.get(caminhoDoArquivo));
            for (String l: linhas){
                String[] v = l.split(",");
                dados.add(v);
            }
        } catch (IOException e){
            System.out.println("Erro ao ler o arquivo " + e.getMessage());
        }
        return dados;
    }
}
