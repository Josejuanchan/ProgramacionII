public class Main {

    public static void main(String[] args) {
        Ciudad ciudad = new Ciudad("Campeche", 30.0, 70.0, "Soleado");
        Pronóstico pronóstico = new Pronóstico(ciudad, "2023-11-22", 24.0, 75.0, "Parcialmente nublado");

        System.out.println("Pronóstico para " + pronóstico.getFecha() + " en " + pronóstico.getCiudad().getNombre() + ":");
        System.out.println("Condiciones actuales:");
        System.out.println("Temperatura: " + pronóstico.getCiudad().getCondicionesActuales().getTemperatura() + "°C");
        System.out.println("Humedad: " + pronóstico.getCiudad().getCondicionesActuales().getHumedad() + "%");
        System.out.println("Estado del cielo: " + pronóstico.getCiudad().getCondicionesActuales().getEstadoCielo());
        System.out.println("Pronóstico del día:");
        System.out.println("Temperatura: " + pronóstico.getCondiciones().getTemperatura() + "°C");
        System.out.println("Humedad: " + pronóstico.getCondiciones().getHumedad() + "%");
        System.out.println("Estado del cielo: " + pronóstico.getCondiciones().getEstadoCielo());
    }
}