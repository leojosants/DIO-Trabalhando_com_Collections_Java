package br.com.dio.collection.stream.exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExerciciosStremAPI {
    public static void main(String[] args) {

        List<String> numerosAleatorios = Arrays.asList("1", "8", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("\nImprima todos os elementos dessa lista de String");
        numerosAleatorios.forEach(System.out::println);

        System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set: ");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("\nTransforme esta lista de String em uma lista de números inteiros: ");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());


    }
}// Fim ExerciciosStremAPI