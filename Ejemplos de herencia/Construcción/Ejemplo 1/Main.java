public class Main {

    public static void main(String[] args) {
        Celular celular = new Celular("Samsung", "Galaxy S21", 8, "123456789");
        celular.encender();
        celular.hacerLlamada("987654321");
        celular.apagar();
    }
}