/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author José
 */
public class Circulo extends FiguraGrafica{

    private int x;
    private int y;
    private int radio;
    
    public Circulo(int x, int y, int radio){
        
        this.x=x;
        this.y=y;
        this.radio=radio;
        
    }
    
    @Override
    public void dibujar(Graphics g) {
        g.drawOval(x - radio, y - radio, 2 * radio, 2 * radio);
    }

    @Override
    public void encojer(Graphics g) {
        radio-= 5;  
        this.dibujar(g);
    }

    @Override
    public void agrandar(Graphics g) {
        radio +=5; 
        this.dibujar(g);
    }

    @Override
    public void cambiarColor(Graphics g, Color c) {
       g.setColor(c);
       this.dibujar(g);
    }

    @Override
    public void mover(Graphics g, String direccion) {
        switch(direccion){
            case "arriba": y-=5; break;
            case "abajo": y+=5;  break;
            case "izquierda" : x-=5;  break;
            case "derecha" : x+=5; break;
	}
        this.dibujar(g);
    }
    
}
