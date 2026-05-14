package org.jonasrocha98.processor;

import org.jonasrocha98.CsvData;

import java.util.ArrayList;
import java.util.List;

public class DataProcessor {

    //filtrar linhas onde o valor de uma coluna contém um texto
    public static List<String[]> filtrarPorTexto(CsvData dados, int coluna, String valor) {
        List<String[]> resultado = new ArrayList<>();

        for (String[] linha : dados.getLinhas()) {
            if (linha[coluna].toLowerCase().contains(valor.toLowerCase())){
                resultado.add(linha);
            }
        }
        return resultado;
    }

    // ordenar linhas pelo valor de uma coluna
    public static List<String[]> ordenarPorColuna(CsvData dados, int coluna){
        List<String[]> resultado = new ArrayList<>(dados.getLinhas());

        resultado.sort((linhaA, linhaB) -> {
            try {
                double numA = Double.parseDouble(linhaA[coluna]);
                double numB = Double.parseDouble(linhaB[coluna]);
                return Double.compare(numA, numB);
            } catch (NumberFormatException e) {
                return linhaA[coluna].compareTo(linhaB[coluna]);
            }
        });
        return resultado;
    }



}