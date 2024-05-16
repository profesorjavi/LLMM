/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.senia.json_java;
import java.io.IOException;

/**
 *
 * @author lliurex
 */
public class Java {


    
    public static void clearScreen() {
        try {
            // Ejecuta el comando clear en la terminal
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        
        clearScreen();

        //System.out.println("ej1 -------------------------------------");
        //ej_1.ej_1.main();

        ej_2.ej_2.main();
        System.out.println("--- -------------------------------------");

        ej_4.ej_4.main();
       // System.out.println("--- -------------------------------------");

    }
}
