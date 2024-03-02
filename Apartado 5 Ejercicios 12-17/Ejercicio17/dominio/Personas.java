package Ejercicio17.dominio;
import java.time.*;
import java.util.*;
import java.util.function.*;

public class Personas {
    private List<Persona> listaDePersonas;

    public Personas() {
        this.listaDePersonas = new ArrayList<>();
    }

    public void anadirPersona(Persona persona) {
        listaDePersonas.add(persona);
    }

    public List<Persona> filtrarPorEdad(int edadMinima, int edadMaxima) {
        Predicate<Persona> filtroEdad = persona -> persona.calcularEdad() >= edadMinima
                && persona.calcularEdad() <= edadMaxima;

        List<Persona> personasFiltradas = new ArrayList<>();
        for (Persona persona : listaDePersonas) {
            if (filtroEdad.test(persona)) {
                personasFiltradas.add(persona);
            }
        }
        return personasFiltradas;
    }

    public Persona elMasJoven() {
        return listaDePersonas.stream()
                .min(Comparator.comparing(Persona::getFechaDeNacimiento))
                .orElse(null);
    }

    public long calcularSumaEdades() {
        return listaDePersonas.stream()
                .mapToLong(Persona::calcularEdad)
                .sum();
    }

    public long calcularEdadMinima() {
        return listaDePersonas.stream()
                .mapToLong(Persona::calcularEdad)
                .min()
                .orElse(0);
    }

    public double calcularMediaDeEdad() {
        return listaDePersonas.stream()
                .mapToLong(Persona::calcularEdad)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        Personas personas = new Personas();

        Persona persona1 = new Persona("Ana", LocalDate.of(1985, 8, 20));
        Persona persona2 = new Persona("Carlos", LocalDate.of(1992, 3, 10));

        personas.anadirPersona(persona1);
        personas.anadirPersona(persona2);

        List<Persona> personasFiltradas = personas.filtrarPorEdad(25, 35);
        System.out.println("Personas entre 25 y 35 años:");
        for (Persona p : personasFiltradas) {
            System.out.println(p.getNombre() + " - " + p.calcularEdad() + " años");
        }

        Persona masJoven = personas.elMasJoven();
        if (masJoven != null) {
            System.out.println("La persona más joven es: " + masJoven.getNombre() +
                    ", con una edad de " + masJoven.calcularEdad() + " años.");
        } else {
            System.out.println("No hay personas en la lista.");
        }

        long sumaEdades = personas.calcularSumaEdades();
        System.out.println("La suma de las edades es: " + sumaEdades);

        long edadMinima = personas.calcularEdadMinima();
        System.out.println("La edad mínima es: " + edadMinima);

        double mediaEdad = personas.calcularMediaDeEdad();
        System.out.println("La media de edad es: " + mediaEdad);
    }
}
