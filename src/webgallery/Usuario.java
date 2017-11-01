/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class Usuario {

    protected String nombre;
    protected String contraseña;
    protected ArrayList<Usuario> usuarios;

    public Usuario(String nombre, String contraseña, ArrayList<Usuario> usuarios) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.usuarios = usuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean registrar(Usuario usuarios) {
        return this.usuarios.add(usuarios);

    }

    public void ingresar(String nombre, String contraseña) {
        ArrayList<Usuario> y = this.usuarios;
     if (nombre.equals(nombre)||(contraseña.equals(contraseña))){
         System.out.println("Bienvenido"+nombre);
     
     }else{{
         
         System.out.println("No se encuentra registrado");
     }}

    }

}

