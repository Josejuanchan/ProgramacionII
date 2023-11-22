public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea() {
        area = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + area);
    }
}