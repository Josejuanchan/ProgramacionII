public class Main
{
	public static void main(String[] args) {
	    
	    Car car1 = new Car("Ford Mustang", 2019, "blue");
	    Car car2 = new Car("Ford Mustang", 2019, "blue");
	    Car car3 = new Car("Toyota Camry", 2018, "red");
	    
	    System.out.println(car1.equals(car2));
	    System.out.println(car1.equals(car3));
	}
}
