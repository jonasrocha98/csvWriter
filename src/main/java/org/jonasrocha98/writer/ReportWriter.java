package org.jonasrocha98.writer;

import java.util.List;

public class ReportWriter {

    // Exibe valor filtrado po coluna da lista.
    public static void exibir (List<String[]> linhas){
        for (String[] linha: linhas){
            for(String v: linha){
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

}
