public class Mueble {
    protected String material;
    protected int altura;

    public Mueble(String material, int altura) {
        this.material = material;
        this.altura = altura;
    }

    public void describir() {
        System.out.println("Este mueble está hecho de " + material + " y tiene una altura de " + altura + " cm.");
    }
}