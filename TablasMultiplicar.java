/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablasmultiplicar;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class TablasMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número a multiplicar ");
        int numero = scanner.nextInt();

        mostrarTablaMultiplicar(numero);

        scanner.close();
    }

    public static void mostrarTablaMultiplicar(int numero) {
        System.out.println("Tabla del " + numero);

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

    }
}