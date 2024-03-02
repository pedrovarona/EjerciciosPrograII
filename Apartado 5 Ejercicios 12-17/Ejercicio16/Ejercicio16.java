package Ejercicio16;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Ejercicio16 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Limite inferior:");
            double limInf = sc.nextDouble();

            System.out.println("Limite superior:");
            double limSup = sc.nextDouble();

            System.out.println("Paso:");
            double paso = sc.nextDouble();

            double integral = integral(limInf, limSup, paso, x -> Math.pow(Math.exp(x), 2));

            System.out.println("La integral de e^x^2 desde " + limInf + " hasta " + limSup +
                    " con un paso de " + paso + " es: " + integral);
        }
    }

    public static double integral(double a, double b, double h, Function<Double, Double> funcion) {
        DoubleUnaryOperator unaryOperator = x -> funcion.apply(x); 

        return DoubleStream.iterate(a, x -> x + h)
                .limit((long) ((b - a) / h))
                .map(unaryOperator)
                .sum() * h;
    }
}
