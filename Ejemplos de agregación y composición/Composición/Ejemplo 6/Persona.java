public class Persona {
    private String nombre;
    private Direccion direccion;

    public Persona(String nombre, String calle, String ciudad, String país) {
        this.nombre = nombre;
        this.direccion = new Direccion(calle, ciudad, país);
    }

    public String getNombre() {
        return nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}