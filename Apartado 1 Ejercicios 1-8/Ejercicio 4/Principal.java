
import java.util.*;

public class Principal {
    public static void main(String[] args) {

        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el limite Inferior:");

            double limInf = scanner.nextDouble();


            System.out.println("Ingrese el limite Superior:");

            double limSup = scanner.nextDouble();


            System.out.println("Ingrese la altura:");

            double h = scanner.nextDouble();
            double resultado = integralEXCuadrado(limInf, limSup, h);


            System.out.println("El resultado de la integral de e^x^2 en el intervalo [" + limInf + "," + limSup
                    + "] con h = " + h + " es: " + resultado);
        }
    }

    public static double integralEXCuadrado(double limInf, double limSup, double h) {
        if (limInf >= limSup) {
            return 0;


        } else {

            double x = limInf + h;
            return h * Math.exp(x * x) + integralEXCuadrado(x, limSup, h);
            
        }

    }

}