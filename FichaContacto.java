/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fichacontacto;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class FichaContacto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("edad");
        String edad = scanner.nextLine();
        
        System.out.println("nombre");
        String nombre = scanner.nextLine();
        
        System.out.println("telefono celular");
        String telefonocelular = scanner.nextLine();
        
        System.out.println("correo electronico");
        String correoelec = scanner.nextLine();
        
        
        System.out.println("****************************");
        System.out.println("Ficha de Contacto");
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefonocelular);
        System.out.println("Correo: " + correoelec);
        System.out.println("Edad: " + edad);
    }
    
}
