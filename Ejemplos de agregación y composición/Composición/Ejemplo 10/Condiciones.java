public class Condiciones {
    private double temperatura;
    private double humedad;
    private String estadoCielo;

    public Condiciones(double temperatura, double humedad, String estadoCielo) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.estadoCielo = estadoCielo;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getHumedad() {
        return humedad;
    }

    public String getEstadoCielo() {
        return estadoCielo;
    }
}
