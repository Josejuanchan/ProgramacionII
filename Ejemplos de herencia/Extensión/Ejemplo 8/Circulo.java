class Circulo extends Figura {
    @Override
    void dibujar() {
        super.dibujar(); // Llama al método dibujar de la clase base
        System.out.println("Dibujando un círculo."); // Agrega funcionalidad específica
    }

    void calcularArea() {
        System.out.println("Calculando el área del círculo.");
    }
}
