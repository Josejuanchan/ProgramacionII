public class Main
{
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[20];
        animals[0] = new Dog();
        animals[1] = new Cat();	
        Dog lassie = (Dog) animals[0];
        Cat fluffy = (Cat) animals[1];

	}
}
