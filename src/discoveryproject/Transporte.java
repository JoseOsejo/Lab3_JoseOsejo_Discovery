/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discoveryproject;

import java.util.ArrayList;

/**
 *
 * @author jcoq2
 */
public class Transporte {

    private String placa;//unica
    private String color;
    private Transportista transportista;
    private ArrayList<Estacion> estaciones;

    public Transporte(String placa, String color, Transportista transportista, ArrayList<Estacion> estaciones) {
        this.placa = placa;
        this.color = color;
        this.transportista = transportista;
        this.estaciones = estaciones;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Transportista getTransportista() {
        return transportista;
    }

    public void setTransportista(Transportista transportista) {
        this.transportista = transportista;
    }

    public ArrayList<Estacion> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(ArrayList<Estacion> estaciones) {
        this.estaciones = estaciones;
    }

    @Override
    public String toString() {
        return "Transporte{" + "placa=" + placa + ", color=" + color + ", transportista=" + transportista + ", estaciones=" + estaciones + '}';
    }
    
    
}
