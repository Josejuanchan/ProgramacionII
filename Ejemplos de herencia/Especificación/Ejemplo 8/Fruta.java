public class Fruta {
    protected String tipo;

    public Fruta(String tipo) {
        this.tipo = tipo;
    }

    public void comer() {
        System.out.println("Comiendo la fruta: " + tipo);
    }
}