package Ejercicio17.principal;

import java.time.*;
import java.util.*;

import Ejercicio17.dominio.Persona;
import Ejercicio17.dominio.Personas;

public class Principal {
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
