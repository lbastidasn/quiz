/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

/**
 *
 * @author ESTUDIANTE
 */import java.util.ArrayList;


public class Coleccion extends Obra{
    private ArrayList <Obra> obras;
    private int numO ;

    public Coleccion(ArrayList<Obra> obras, int numO, String nombre, String estilo, String tecnica, double valor) {
        super(nombre, estilo, tecnica, valor);
        this.obras = obras;
        this.numO = numO;
    }
    
    public void añadir (Obra obra){
       this.obras.set(this.numO, obra);
        this.numO++;
        
    }
    public void consultarColeccion(){
        ArrayList<Obra> x=this.obras;
        for (int i = 0; i <300; i++) {
            System.out.println(obras);
            
        }
     
}
}
