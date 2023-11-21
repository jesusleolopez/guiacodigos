/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taqueria;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Taqueria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar menú
            System.out.println("MENU");
            
            System.out.println("1.-  CAMPECHANO");
            System.out.println("2.- POLLO");
            System.out.println("3.- TRIPAS");
            System.out.println("4.- SALIR");

            System.out.println("*********************************************");
            System.out.print("Ingrese el numero de taco");
            opcion = scanner.nextInt();

            
            switch (opcion) {
                case 1:
                    System.out.println("elegiste el taco campechano !provecho!");
                    break;
                case 2:
                    System.out.println("elegiste el taco de pollo !provecho!");
                    break;
                case 3:
                    System.out.println("elegiste el taco de tripas !provecho!");
                    break;
                case 4:
                    System.out.println("Saliendo, Provecho");
                    break;
                default:
                    System.out.println("Opción no válida. ");
            }

        } while (opcion != 4);

        scanner.close();
    }
    
}
