public class Zapatos extends Calzado {
    protected String estilo;

    public Zapatos(String marca, String estilo) {
        super(marca);
        this.estilo = estilo;
    }

    public void mostrarEstilo() {
        System.out.println("Estilo de zapatos: " + estilo);
    }
}