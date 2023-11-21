/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areacirculo;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class AreaCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = 3.1416 * Math.pow(radio, 2);
        System.out.println("El área es: " + area);

        scanner.close();
    }

}
