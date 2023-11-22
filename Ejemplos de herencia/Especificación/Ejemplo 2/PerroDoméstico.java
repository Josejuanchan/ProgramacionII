public class PerroDoméstico extends Animal {
    private String nombre;

    public PerroDoméstico(String especie, int edad, String nombre) {
        super(especie, edad);
        this.nombre = nombre;
    }

    public void ladrar() {
        System.out.println("El perro está ladrando...");
    }
}