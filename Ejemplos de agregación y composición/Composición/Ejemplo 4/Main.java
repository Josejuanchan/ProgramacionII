public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("El principito", "Antoine", "Saint-Exupéry");

        System.out.println("Información del libro:");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre() + " " + libro.getAutor().getApellido());
    }
}