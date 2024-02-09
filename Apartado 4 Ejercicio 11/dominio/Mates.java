package dominio;

import java.util.ArrayList;
import java.util.List;

public class Mates{

    public static int sumaNaturales(int n) {
        int suma = 0;
        for (int i = 0; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    public static int factorial(int n) {
        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    public static int sumaLista(List<Integer> numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public static double mediaLista(List<Integer> numeros) {
        int suma = sumaLista(numeros);
        return (double) suma / numeros.size();
    }

    public static double desviacionTipica(List<Integer> numeros) {
        double media = mediaLista(numeros);
        double sumaCuadrados = 0;
        for (int numero : numeros) {
            sumaCuadrados += Math.pow(numero - media, 2);
        }
        double varianza = sumaCuadrados / numeros.size();
        return Math.sqrt(varianza);
    }

    public static int sumaPares(int n) {
        int suma = 0;
        for (int i = 2; i <= n; i += 2) {
            suma += i;
        }
        return suma;
    }

    public static int sumaParesLista(List<Integer> numeros) {
        int suma = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                suma += numero;
            }
        }
        return suma;
    }

    public static List<Integer> obtenerListaPares(List<Integer> numeros) {
        List<Integer> listaPares = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                listaPares.add(numero);
            }
        }
        return listaPares;
    }

    public static List<Integer> listaPares(int n) {
        List<Integer> listaPares = new ArrayList<>();
        for (int i = n; i >= 2; i -= 2) {
            listaPares.add(i);
        }
        return listaPares;
    }

    public static int calcularProductoEscalar(List<Integer> lista1, List<Integer> lista2) {
        int productoEscalar = 0;
        for (int i = 0; i < lista1.size(); i++) {
            productoEscalar += lista1.get(i) * lista2.get(i);
        }
        return productoEscalar;
    }
}