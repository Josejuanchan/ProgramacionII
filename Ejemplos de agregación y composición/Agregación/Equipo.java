public class Equipo {

    private String nombreDelEquipo;
    private Jugador[] integrantesDelEquipo; 

    public Equipo(String nombreDelEquipo) {
        this.nombreDelEquipo = nombreDelEquipo;
        this.integrantesDelEquipo = new Jugador[11];
    }

    public void contratarJugadores(String posicion, int edad, String nombre) {
        
        for (int i = 0; i < integrantesDelEquipo.length; i++){ 
        integrantesDelEquipo[i] = new Jugador(posicion, edad, nombre);
        
        }
    }

    public void mostrarEquipo() {
        System.out.println("Nombre del equipo: " + nombreDelEquipo);
        for (int i = 0; i < integrantesDelEquipo.length; i++) {
            System.out.println("Jugador " + (i + 1) + ": " + integrantesDelEquipo[i].imprimirDatosDelJugador());
        }
    }
}