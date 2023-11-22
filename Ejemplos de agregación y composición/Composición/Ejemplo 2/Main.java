public class Main {
    public static void main(String[] args) {
        TarjetaCredito tarjeta = new TarjetaCredito("123456789", "12/25", "Juan Chan");

        System.out.println("Información de la tarjeta de crédito:");
        System.out.println("Número de tarjeta: " + tarjeta.getNumero());
        System.out.println("Fecha de vencimiento: " + tarjeta.getFechaVencimiento());
        System.out.println("Propietario: " + tarjeta.getPropietario().getNombre());
    }
}