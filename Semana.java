/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Semana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7: ");

        int numeroDia = scanner.nextInt();

        switch (numeroDia) {
            case 1:
                System.out.println("Hola soy el día lunes.");
                break;

            case 2:
                System.out.println("Hola soy el día martes.");
                break;

            case 3:
                System.out.println("Hola soy el día miércoles.");
                break;

            case 4:
                System.out.println("Hola soy el día jueves.");
                break;

            case 5:
                System.out.println("Hola soy el día viernes.");
                break;

            case 6:
                System.out.println("Hola soy el día sábado.");
                break;

            case 7:
                System.out.println("Hola soy el día domingo.");
                break;

            
        }
    }    
}
