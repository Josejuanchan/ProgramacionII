public class Main {
    public static void main(String[] args) {
        String[] nombresComponentes = {"CPU", "RAM", "Disco duro"};
        Ordenador ordenador = new Ordenador("HP", nombresComponentes);

        System.out.println("Información del ordenador:");
        System.out.println("Marca: " + ordenador.getMarca());
        System.out.println("Componente:");

        for (int i = 0; i < ordenador.getComponentes().length; i++) {
            System.out.println("Componente " + (i + 1) + ": " + ordenador.getComponentes()[i].getNombre());
        }
    }
}