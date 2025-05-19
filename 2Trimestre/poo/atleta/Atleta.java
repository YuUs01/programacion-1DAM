package poo.atleta;

public class Atleta implements Comparable<Atleta> {
    private String nombre;
    private double tiempo;

    // Constructor
    public Atleta(String nombre, double tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public int compareTo(Atleta otroAtleta) {
        // Aquí puedes completar el método compareTo de acuerdo a tu lógica
        return 0; // Placeholder para que puedas implementarlo
    }

    @Override
    public String toString() {
        return "Atleta [Nombre=" + nombre + ", Tiempo=" + tiempo + "]";
    }
}
