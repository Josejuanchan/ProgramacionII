import java.util.Scanner;
import java.io.*;

public class Controladora{
    
		public static void main(String[] args) {
            /* WebMaker generador = new WebMaker();
	   
            try{
            
            PrintWriter escritor = new PrintWriter("index.html");
			Scanner lector = new Scanner(new FileReader("form.txt"));
		
            escritor.println(generador.imprimirEncabezado());
		
            escritor.println(generador.imprimirTexto("Muy buenos días a todos."));
		
            while(lector.hasNext())	{
            escritor.println(lector.nextLine());
            }
                escritor.println(generador.imprimirCierre());
                lector.close();
                escritor.close(); 
				catch (FileNotFoundException e){
			}*/
				
				
			try{
			DataOutputStream escritor = new DataOutputStream (new FileOutputStream("hola.bin"));
			escritor.writeInt(33465);
			escritor.writeChar('a');
			escritor.writeChar('z');
			escritor.writeShort(10);
			escritor.close();
			DataInputStream	lector = new DataInputStream (new FileInputStream("hola.bin"));
			System.out.println(lector.readInt());
			System.out.println(lector.readChar());
			System.out.println(lector.readChar());
			System.out.println(lector.readShort());
			escritor.close();
			}catch (IOException e) {
			
			}
		} 	
	}
