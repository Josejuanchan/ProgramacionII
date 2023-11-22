public class TarjetaCredito {
    private String numero;
    private String fechaVencimiento;
    private Propietario propietario;

    public TarjetaCredito(String numero, String fechaVencimiento, String nombrePropietario) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.propietario = new Propietario(nombrePropietario);
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Propietario getPropietario() {
        return propietario;
    }
}