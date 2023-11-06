public class Car2{
    private String make; // modelo del automóvil
    private int year; // año de lista del automóvil
    private String color; // color del automóvil
 
    public Car2(String make, int year, String color){
        this.make = make;
        this.year = year;
        this.color = color;
 
 } // end Car2 constructor
 
    public String toString(){
     
    return "make = " + make + ", year = " + year + ", color = " + color;
    } // end toString
    

    public static void main(String[] args){
        Car2 car = new Car2("Honda", 1998, "silver");
        System.out.println(car);

 } // end main

} // end class Car2