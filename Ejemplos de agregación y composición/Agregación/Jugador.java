public class Jugador {

    private String posicion;
    private int edad;
    private String nombre;

    public Jugador(String posicion, int edad, String nombre) {
        this.posicion = posicion;
        this.edad = edad;
        this.nombre = nombre;
    }

    public String imprimirDatosDelJugador() {
        return "Nombre: " + nombre + " Posición: " + posicion + " Edad: " + edad;
    }
}