public class Biblioteca {
    private String nombre;
    private Libro[] libros;
    private int cantidadLibros = 0;

    public Biblioteca(String nombre, int capacidad) {
        this.nombre = nombre;
        libros = new Libro[capacidad];
    }

    public void agregarLibro(Libro libro) {
        if (cantidadLibros < libros.length) {
            libros[cantidadLibros] = libro;
            cantidadLibros++;
        } else {
            System.out.println("La biblioteca está llena, no se puede agregar más libros.");
        }
    }
    public void mostrarLibros() {
        System.out.println("Libros en " + nombre + ":");
        for (int i = 0; i < cantidadLibros; i++) {
            Libro libro = libros[i];
            System.out.println("- " + libro.getTitulo() + " por " + libro.getAutor());
        }
    }
}
