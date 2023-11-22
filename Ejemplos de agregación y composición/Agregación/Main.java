import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	
	Scanner kb = new Scanner(System.in);
	
	Equipo equipo1 = new Equipo("Chivas");
    
    
    for (int i=0;i<11 ;i++ ){
        System.out.print("Posicion del jugador: ");
        String posicion = kb.nextLine();
        System.out.print("Edad del jugador: ");
        int edad = kb.nextInt();
        kb.nextLine();
        System.out.print("Noombre del jugador:  ");
        String nombre = kb.nextLine(); 
        
        equipo1.contratarJugadores(posicion, edad, nombre);
        
    } 
    
      equipo1.mostrarEquipo();
     
    }
}