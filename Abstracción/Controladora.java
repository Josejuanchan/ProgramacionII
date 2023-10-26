/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controladora;

import java.util.Scanner;

/**
 *
 * @author José
 */
public class Controladora {

    public static void main(String[] args){
        Ejecutor e = new Ejecutor("calc",1);
	Scanner	leer = new Scanner(System.in);
	System.out.println("Escribe un commando para ejecutar");
	e.comando = leer.next();
        if (e.necesitaEjecucion()){
            e.ejecutarTarea();
        }
}
}
