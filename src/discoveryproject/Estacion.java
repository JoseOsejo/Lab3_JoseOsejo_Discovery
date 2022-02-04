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
public class Estacion 
{
    private String nombre;
    private int coordX;
    private int coordY;

    public Estacion(String nombre, int coordX, int coordY) {
        this.nombre = nombre;
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    @Override
    public String toString() {
        return "Estacion{" + "nombre=" + nombre + ", coordX=" + coordX + ", coordY=" + coordY + '}';
    }
    
    
}
