public class Ordenador {
    private String marca;
    private Componente[] componentes;

    public Ordenador(String marca, String[] nombresComponentes) {
        this.marca = marca;
        this.componentes = new Componente[nombresComponentes.length];

        for (int i = 0; i < componentes.length; i++) {
            componentes[i] = new Componente(nombresComponentes[i]);
        }
    }

    public String getMarca() {
        return marca;
    }

    public Componente[] getComponentes() {
        return componentes;
    }
}