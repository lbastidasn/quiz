/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class WebGallery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //  Coleccion coleccion = new Coleccion();
        Scanner In= new Scanner (System.in);
           
        int a = 0;
                
         
        while (a!=7){
            System.out.println( "presione 1 para ingresar o 2 para registrarse" );
            int f = In.nextInt();
            switch (f){
                case 1:
 System.out.println("Ingrese su nombre de usuario");
          Scanner nombre;
          Scanner contraseña;
          Usuario usuario = new Usuario (nombre,contraseña);
          usuario.ingresar();
            }

        }
        
    }
    
}
