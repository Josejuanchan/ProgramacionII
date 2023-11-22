public class Pronóstico {
    private Ciudad ciudad;
    private String fecha;
    private Condiciones condiciones;

    public Pronóstico(Ciudad ciudad, String fecha, double temperatura, double humedad, String estadoCielo) {
        this.ciudad = ciudad;
        this.fecha = fecha;
        this.condiciones = new Condiciones(temperatura, humedad, estadoCielo);
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public String getFecha() {
        return fecha;
    }

    public Condiciones getCondiciones() {
        return condiciones;
    }
}
