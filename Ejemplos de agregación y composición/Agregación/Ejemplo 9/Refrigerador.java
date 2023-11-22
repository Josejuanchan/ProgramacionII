public class Refrigerador {
    private Comida[] comidas;
    private Refresco[] refrescos;

    public Refrigerador(Comida[] comidas, Refresco[] refrescos) {
        this.comidas = comidas;
        this.refrescos = refrescos;
    }

    public Comida[] getComidas() {
        return comidas;
    }

    public Refresco[] getRefrescos() {
        return refrescos;
    }
}
