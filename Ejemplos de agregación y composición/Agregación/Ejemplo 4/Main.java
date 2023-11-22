public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("La guerra de los mundos", "H.G. Wells");
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");

        Biblioteca biblioteca = new Biblioteca("Mi Biblioteca", 5);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.mostrarLibros();
    }
}
