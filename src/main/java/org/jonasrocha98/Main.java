package org.jonasrocha98;

import org.jonasrocha98.reader.CsvReader;

import java.util.Arrays;

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