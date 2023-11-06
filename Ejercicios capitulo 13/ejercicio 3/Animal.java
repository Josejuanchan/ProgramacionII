public class Animal{
 
    public static void main(String[] args){
 
 Animal sparky = new Dog();
 Animal lassie = new Animal();
 
 System.out.println("sparky = " + sparky + "\tlassie = " + lassie);
    } // end main

} // end Animal

class Dog extends Animal{
    
    public String toString(){
        
    return "bark, bark";
    }

} // end class Dog 