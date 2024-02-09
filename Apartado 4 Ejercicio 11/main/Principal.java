package main;

import java.util.Arrays;
import java.util.List;

import dominio.Mates;

public class Principal {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("La suma de los primeros " + n + " numeros naturales es: " + Mates.sumaNaturales(n));

        int m = 4;
        System.out.println("El factorial de " + m + " es: " + Mates.factorial(m));

        int base = 2;
        int exponente = 3;
        System.out.println(base + " elevado a la " + exponente + " es: " + Mates.potencia(base, exponente));

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("La suma de los numeros " + numeros + " es: " + Mates.sumaLista(numeros));
        System.out.println("La media de los numeros " + numeros + " es: " + Mates.mediaLista(numeros));
        System.out.println(
                "La desviacion tipica de los numeros " + numeros + " es: " + Mates.desviacionTipica(numeros));

        int p = 9;
        System.out.println("La suma de los primeros numeros pares hasta " + p + " es: " + Mates.sumaPares(p));

        List<Integer> numerosPares = Arrays.asList(1, 2, 3, 4);
        System.out.println(
                "La suma de los numeros pares de " + numerosPares + " es: " + Mates.sumaParesLista(numerosPares));
        System.out.println("La lista de numeros pares hasta " + p + " es: " + Mates.listaPares(p));

        List<Integer> listaNumeros = Arrays.asList(1, 2, 6, 11);
        System.out.println(
                "La lista de numeros pares de " + listaNumeros + " es: " + Mates.obtenerListaPares(listaNumeros));

        List<Integer> lista1 = Arrays.asList(1, 2, 3);
        List<Integer> lista2 = Arrays.asList(2, 4, 6);
        System.out.println("El producto escalar de " + lista1 + " y " + lista2 + " es: "
                + Mates.calcularProductoEscalar(lista1, lista2));
    }
}