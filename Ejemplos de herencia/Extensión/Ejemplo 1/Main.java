public class Main {

    public static void main(String[] args) {
        SillonReclinable sillonReclinable = new SillonReclinable("Cuero", 100, 4);
        sillonReclinable.describir();
        sillonReclinable.sentarse();
        sillonReclinable.reclinar();
        sillonReclinable.describir();
        sillonReclinable.incorporarse();
        sillonReclinable.describir();
    }
}