public class Ciudad {
    private String nombre;
    private Condiciones condicionesActuales;

    public Ciudad(String nombre, double temperatura, double humedad, String estadoCielo) {
        this.nombre = nombre;
        this.condicionesActuales = new Condiciones(temperatura, humedad, estadoCielo);
    }

    public String getNombre() {
        return nombre;
    }

    public Condiciones getCondicionesActuales() {
        return condicionesActuales;
    }
}