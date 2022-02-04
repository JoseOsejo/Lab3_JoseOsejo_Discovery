/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discoveryproject;

/**
 *
 * @author jcoq2
 */
public class Clase {

    private String nombre;
    private int codigoClase;//unico

    public Clase(String nombre, int codigoClase) {
        this.nombre = nombre;
        this.codigoClase = codigoClase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoClase() {
        return codigoClase;
    }

    public void setCodigoClase(int codigoClase) {
        this.codigoClase = codigoClase;
    }

    @Override
    public String toString() {
        return "Clase{" + "nombre=" + nombre + ", codigoClase=" + codigoClase + '}';
    }
    
    
    

    
}
