// Clase Matematicas
package Ejercicio9.src.dominio;

import java.util.*;

public class Matematicas {

    public static int sumaNumeros(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo");
        }
        if (n == 0) {
            return 0;
        }
        return n + sumaNumeros(n - 1);
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo");
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int potencia(int base, int exponente) {
        if (exponente < 0) {
            throw new IllegalArgumentException("El exponente debe ser no negativo");
        }
        if (exponente == 0) {
            return 1;
        }
        return base * potencia(base, exponente - 1);
    }

    public static int sumaLista(List<Integer> lista, int index) {
        if (index < 0 || index >= lista.size()) {
            throw new IllegalArgumentException("El índice debe estar dentro de los límites de la lista");
        }

        // Verificar si el índice alcanzó el final de la lista
        if (index == lista.size() - 1) {
            return lista.get(index);
        }

        return lista.get(index) + sumaLista(lista, index + 1);
    }

    public static double mediaAritmetica(List<Integer> lista, int index) {
        if (index < 0 || index >= lista.size()) {
            throw new IllegalArgumentException("El índice debe estar dentro de los límites de la lista");
        }

        // Verificar si el índice alcanzó el final de la lista
        if (index == lista.size() - 1) {
            return lista.get(index);
        }

        return (lista.get(index) + index * mediaAritmetica(lista, index + 1)) / (index + 1);
    }

    public static double desviacionTipica(List<Integer> lista, int indice, double media, double sumaDesviaciones) {
        if (indice == lista.size() - 1) {
            return Math.sqrt((sumaDesviaciones + Math.pow(lista.get(indice) - media, 2)) / (lista.size() - 1));
        }
        return desviacionTipica(lista, indice + 1, media, sumaDesviaciones + Math.pow(lista.get(indice) - media, 2));
    }

    public static int sumaPares(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo");
        }
        return sumaParesRecursivo(n);
    }

    private static int sumaParesRecursivo(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return n + sumaParesRecursivo(n - 2);
        } else {
            return sumaParesRecursivo(n - 1);
        }
    }

    public static int sumaParesLista(List<Integer> lista) {
        int sum = 0;
        for (int num : lista) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static List<Integer> obtenerListaPar(List<Integer> lista) {
        List<Integer> resultado = new ArrayList<>();
        for (int num : lista) {
            if (num % 2 == 0) {
                resultado.add(num);
            }
        }
        return resultado;
    }

    public static List<Integer> listaPar(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo");
        }
        List<Integer> resultado = new ArrayList<>();
        for (int i = 2; i <= n; i += 2) {
            resultado.add(i);
        }
        return resultado;
    }

    public static int calcularProductoEscalar(List<Integer> lista1, List<Integer> lista2) {
        if (lista1.size() != lista2.size()) {
            throw new IllegalArgumentException("Las listas deben tener la misma longitud");
        }
        int resultado = 0;
        for (int i = 0; i < lista1.size(); i++) {
            resultado += lista1.get(i) * lista2.get(i);
        }
        return resultado;
    }

    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El índice debe ser no negativo");
        }
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
