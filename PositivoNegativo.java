/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positivonegativo;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class PositivoNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("número: ");
        int numero = scanner.nextInt();

        
        if (numero > 0) {
            System.out.println(" positivo.");
        } else if (numero < 0) {
            System.out.println(" negativo.");
        } else {
            System.out.println(" es cero.");
        }

        scanner.close();
    }
    
}
