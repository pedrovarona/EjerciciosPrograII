package Ejercicio15.src.dominio;

import java.util.*;
import java.util.stream.*;

public class Matematicas {


    public static int sumahasta(int n) {
        return IntStream.rangeClosed(0, n).sum();
    }

    public static int factorial(int n) {
        return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
    }

    public static double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    public static int sumaLista(List<Integer> numeros) {
        return numeros.stream().mapToInt(Integer::intValue).sum();
    }

    public static double media(List<Integer> numeros) {
        return numeros.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public static double desviacionTipica(List<Integer> numeros) {
        double media = media(numeros);
        double sumaCuadrados = numeros.stream().mapToDouble(x -> Math.pow(x - media, 2)).sum();
        return Math.sqrt(sumaCuadrados / numeros.size());
    }

    public static int sumaPares(int n) {
        return IntStream.rangeClosed(2, n).filter(x -> x % 2 == 0).sum();
    }

    public static int sumaParesLista(List<Integer> numeros) {
        return numeros.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();
    }

    public static List<Integer> obtenerListaPares(List<Integer> numeros) {
        return numeros.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    }

    public static List<Integer> listaPares(int n) {
        return IntStream.rangeClosed(2, n).filter(x -> x % 2 == 0).boxed().collect(Collectors.toList());
    }

    public static int calcularProductoEscalar(List<Integer> lista1, List<Integer> lista2) {
        return IntStream.range(0, lista1.size()).map(i -> lista1.get(i) * lista2.get(i)).sum();
    }
    
}
