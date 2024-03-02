package Ejercicio14;
import java.util.*;
import java.util.stream.*;
public class Ejercicio14 {
    public static void main(String[] args) {
        // Apartado 1.
        IntStream apartado1 = IntStream.of(1, 2, 3, 4, 5);
        System.out.println("Apartado 1:");
        apartado1.forEach(System.out::println);

        // Apartado 2.
        IntStream apartado2 = IntStream.range(1, 6); 
        System.out.println("Apartado 2:");
        apartado2.forEach(System.out::println);

        // Apartado 3.
        IntStream apartado3 = IntStream.iterate(1, n -> n + 2).limit(5);
        System.out.println("Apartado 3:");
        apartado3.forEach(System.out::println);

        // Apartado 4.
        Random random = new Random();
        DoubleStream apartado4 = random.doubles(5); 
        System.out.println("Apartado 4:");
        apartado4.forEach(System.out::println);
    }
}
