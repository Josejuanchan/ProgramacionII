public class Main {
        public static void main(String[] args) {
        Comida comida1 = new Comida("Manzanas");
        Comida comida2 = new Comida("Pollo");
        Refresco refresco1 = new Refresco("Coca-Cola");
        Refresco refresco2 = new Refresco("Pepsi");

        Comida[] comidas = {comida1, comida2};
        Refresco[] refrescos = {refresco1, refresco2};

        Refrigerador refrigerador = new Refrigerador(comidas, refrescos);

        System.out.println("Contenido del refrigerador:");
        System.out.println("Comidas:");
        for (Comida comida : refrigerador.getComidas()) {
            System.out.println(comida.getNombre());
        }
        System.out.println("Refrescos:");
        for (Refresco refresco : refrigerador.getRefrescos()) {
            System.out.println(refresco.getMarca());
        }
    }
}