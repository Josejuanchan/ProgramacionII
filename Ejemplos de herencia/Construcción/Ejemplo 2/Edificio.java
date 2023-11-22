public class Edificio {
    protected String dirección;

    public Edificio(String dirección) {
        this.dirección = dirección;
    }

    public void mostrarInformación() {
        System.out.println("Este es un edificio ubicado en: " + dirección);
    }
}