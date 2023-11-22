public class Música {
    private Nota[] notas;

    public Música() {
        notas = new Nota[4];
        notas[0] = new Nota("Do", 1);
        notas[1] = new Nota("Re", 2);
        notas[2] = new Nota("Mi", 1);
        notas[3] = new Nota("Fa", 3);
    }

    public Nota[] getNotas() {
        return notas;
    }
}