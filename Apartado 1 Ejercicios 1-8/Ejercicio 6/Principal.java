import java.util.*;


public class Principal {

    public static int sumaCodigos(String str) {
        if (str.length() == 0) {

            return 0;

        } else {


            int codigo = str.charAt(0);
            return codigo + sumaCodigos(str.substring(1));
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {


            System.out.println("Ingrese su String:");
            String cadena = scanner.nextLine();

            int suma = sumaCodigos(cadena);

            System.out.println("La suma de los códigos de la cadena '" + cadena + "' es: " + suma);
        }

    }
}