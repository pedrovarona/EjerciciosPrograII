package Ejercicio17.dominio;
import java.time.*;

public class Persona {
    private String nombre;
    private LocalDate fechaDeNacimiento;

    public Persona(String nombre, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public long calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaDeNacimiento, fechaActual).getYears();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Juan", LocalDate.of(1990, 5, 15));
        long edad = persona.calcularEdad();
        System.out.println(persona.getNombre() + " tiene " + edad + " años.");
    }
}
