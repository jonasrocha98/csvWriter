package org.jonasrocha98;

import java.util.List;

public class CsvData {
    public String[] cabecalho;
    public List<String[]> linhas;

    public CsvData(String[] cabecalho, List<String[]> linhas) {
        this.cabecalho = cabecalho;
        this.linhas = linhas;
    }

    public String[] getCabecalho(){
        return cabecalho;
    }

    public List<String[]> getLinhas(){
        return linhas;
    }
}
