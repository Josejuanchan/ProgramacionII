public class Libro {
    private String titulo;
    private Autor autor;

    public Libro(String titulo, String nombreAutor, String apellidoAutor) {
        this.titulo = titulo;
        this.autor = new Autor(nombreAutor, apellidoAutor);
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }
}