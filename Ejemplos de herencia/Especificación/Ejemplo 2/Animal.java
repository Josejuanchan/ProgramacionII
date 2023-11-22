public class Animal {
    protected String especie;
    protected int edad;

    public Animal(String especie, int edad) {
        this.especie = especie;
        this.edad = edad;
    }

    public void comer() {
        System.out.println("El animal está comiendo...");
    }
}