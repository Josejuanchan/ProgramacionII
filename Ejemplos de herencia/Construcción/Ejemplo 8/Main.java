public class Main
{
    public static void main(String[] args) {
        Mesa mesa = new Mesa("Madera", 75, 120, true);
        mesa.trabajar();
        mesa.almacenar();
        mesa.utilizar();
    }

}