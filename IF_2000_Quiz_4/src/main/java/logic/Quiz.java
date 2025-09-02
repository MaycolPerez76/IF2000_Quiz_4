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
    
 

    public void contarVocales(Scanner sc) {
        System.out.println("Ingrese una palabra y contaré cuántas vocales tiene:");
        String palabra = sc.nextLine().toLowerCase();
        int contador = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++; 
            }
        }

        System.out.println("La palabra \"" + palabra + "\" tiene " + contador + " vocal(es).");
    }
}

    
