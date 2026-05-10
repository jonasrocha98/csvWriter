package org.jonasrocha98;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String caminho = "data/input.csv";

        List<String[]> dados = CsvReader.ler(caminho);

        for (String[] l: dados){
            for(String v: l) {
                System.out.print(v + " ");
            }
            System.out.println( );
        }
    }
}