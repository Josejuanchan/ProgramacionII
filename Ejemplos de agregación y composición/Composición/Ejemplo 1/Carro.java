public class Carro{
    
    private String modelo;
    private String color;
    private int numeroDePuertas;
    
    public Carro(String modelo, String color, int numeroDePuertas){
        
        this.modelo = modelo;
        this.color = color;
        this.numeroDePuertas = numeroDePuertas;
        
        Motor motor1 = new Motor("Gasolina");
        
    }
    
    public void arrancar(){
        
        System.out.println("Arrancando vehiculo...");
        
    }
    
    public void detener(){
        
        System.out.println("Deteniendo vehiculo...");

    }
    
    public void setColor(String Color){
        
        this.color = color;
        
    }
    
    @Override
    
    public String toString(){
        
        return "Modelo: " + modelo + " Color: " +  color + " numeroDePuertas: " + numeroDePuertas;
        
    }
    
}