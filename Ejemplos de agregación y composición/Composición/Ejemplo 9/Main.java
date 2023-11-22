public class Main {

    public static void main(String[] args) {
        Música música = new Música();

        System.out.println("Notas de la música:");
        for (Nota nota : música.getNotas()) {
            System.out.println("Nombre: " + nota.getNombre());
            System.out.println("Duración: " + nota.getDuracion());
            System.out.println("------------------------");
        }
    }
}