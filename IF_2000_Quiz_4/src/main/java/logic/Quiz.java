/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.Scanner;

/**
 *
 * @author mayco
 */
public class Quiz {
    public Quiz() {
        
    }
    
    public void tablaMultiplicar (Scanner sc) {
      System.out.println("Ingrese el numero y te mostrare su tabla:");
      int num = sc.nextInt();
      int tabla = 0;
      for (int i =0; i < num; i++) {
          tabla = num * i;
          System.out.println("Numero" + num + "multiplicado por" + i + "es:" + tabla);
      }
      System.out.println(tabla);
    }
    
    
    
}
