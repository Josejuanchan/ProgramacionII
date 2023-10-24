public class Tablet extends DispositivoMovil {
    
    private String almacenamiento; 
    
    public Tablet(String almacenamiento){
        super(0);
        this.almacenamiento = almacenamiento; 
        }
    
    public String verAlmacenamiento(){
        
            System.out.println("El almacenamiento de este dispostivo es de: " + almacenamiento);
            return almacenamiento;
    }
    
    public void tomarFoto(){
        System.out.println("Foto tomada");
    }
}
