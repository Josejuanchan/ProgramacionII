public class Main {
    public static void main(String[] args) {
        Ropa prenda1 = new Ropa("Camisa");
        Ropa prenda2 = new Ropa("Pantalón");
        Ropa prenda3 = new Ropa("Short");

        Ropa[] prendas = {prenda1, prenda2, prenda3};

        Armario armario = new Armario(prendas);

        System.out.println("Contenido del armario:");
        for (Ropa prenda : armario.getPrendas()) {
            System.out.println(prenda.getTipo());
        }
    }
}