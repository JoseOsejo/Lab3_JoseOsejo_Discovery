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
public class Taxi extends Transporte 
{
    private int numeroTaxi;
    private ArrayList<Alumno>alumnos;

    public Taxi(int numeroTaxi, ArrayList<Alumno> alumnos, String placa, String color, Transportista transportista, ArrayList<Estacion> estaciones) {
        super(placa, color, transportista, estaciones);
        this.numeroTaxi = numeroTaxi;
        this.alumnos = new ArrayList(4);
    }

    public int getNumeroTaxi() {
        return numeroTaxi;
    }

    public void setNumeroTaxi(int numeroTaxi) {
        this.numeroTaxi = numeroTaxi;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Taxi{" + "numeroTaxi=" + numeroTaxi + ", alumnos=" + alumnos + '}';
    }
    
    
    
   
}
