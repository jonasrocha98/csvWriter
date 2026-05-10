package org.jonasrocha98;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String caminho = "data/input.csv";

        CsvData dados = CsvReader.ler(caminho);

        System.out.println("Cabeçalho: "+ Arrays.toString(dados.getCabecalho()));

        for (String[] l: dados.getLinhas()){
            for(String v: l) {
                System.out.print(v + " ");
            }
            System.out.println( );
        }

    }
}