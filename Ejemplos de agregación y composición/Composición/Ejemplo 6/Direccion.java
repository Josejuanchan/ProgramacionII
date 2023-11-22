public class Direccion{
    private String calle;
    private String ciudad;
    private String país;

    public Direccion(String calle, String ciudad, String país) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.país = país;
    }

    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPaís() {
        return país;
    }
}