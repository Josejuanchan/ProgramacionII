public class Edificio {
    protected String dirección;

    public Edificio(String dirección) {
        this.dirección = dirección;
    }

    public void mostrarDirección() {
        System.out.println("Dirección del edificio: " + dirección);
    }
}