package Ejercicio15.src.principal;

import java.util.*;

import Ejercicio15.src.dominio.Matematicas;

public class Principal {
    public static void main(String[] args) {

        System.out.println("1. Suma hasta 8: " + Matematicas.sumahasta(8));
        System.out.println("2. Factorial de 4: " + Matematicas.factorial(4));
        System.out.println("3. Potencia de 5^3: " + Matematicas.potencia(5, 3));

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("4. Suma de la lista: " + Matematicas.sumaLista(numeros));
        System.out.println("5. Media de la lista: " + Matematicas.media(numeros));
        System.out.println("6. Desviación típica de la lista: " + Matematicas.desviacionTipica(numeros));
        System.out.println("7. Suma de los primeros pares hasta 9: " + Matematicas.sumaPares(9));

        List<Integer> numerosPares = Arrays.asList(1, 2, 3, 4);
        System.out.println("8. Suma de los pares en la lista: " + Matematicas.sumaParesLista(numerosPares));

        List<Integer> listaInicial = Arrays.asList(1, 2, 6, 11);
        System.out.println("9. Lista de pares de la lista inicial: " + Matematicas.obtenerListaPares(listaInicial));
        System.out.println("10. Lista de pares hasta 9: " + Matematicas.listaPares(9));

        List<Integer> lista1 = Arrays.asList(1, 2, 3);
        List<Integer> lista2 = Arrays.asList(2, 4, 6);
        System.out
                .println("11. Producto escalar de las listas: " + Matematicas.calcularProductoEscalar(lista1, lista2));

        
    }
}
