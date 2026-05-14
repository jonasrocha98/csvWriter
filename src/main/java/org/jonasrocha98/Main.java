package org.jonasrocha98;

import org.jonasrocha98.processor.DataProcessor;
import org.jonasrocha98.reader.CsvReader;
import org.jonasrocha98.writer.ReportWriter;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String caminho = "data" + File.separator + "input.csv";

        CsvData dados = CsvReader.ler(caminho);

        //Exemplos
        List<String[]> ordenar = DataProcessor.ordenarPorColuna(dados, 3);
        ReportWriter.exibir(ordenar);


        /*
        List<String[]> filtrar = DataProcessor.filtrarPorTexto(dados, 0, "Maria");
        ReportWriter.exibir(filtrar);
        */


    }
}