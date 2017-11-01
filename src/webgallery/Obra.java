/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

/**
 *
 * @author ESTUDIANTE
 */
public class Obra {
protected String nombre;
protected String estilo;
protected String tecnica;

    public Obra(String nombre, String estilo, String tecnica, double valor) {
        this.nombre = nombre;
        this.estilo = estilo;
        this.tecnica = tecnica;
        this.valor = valor;
    }
protected double valor;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public double calcularValor(double valor){
    double valF= ((valor*0.02)+valor);
    return valF;
    }


}
