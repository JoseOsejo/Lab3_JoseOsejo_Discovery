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
public class MotoTaxi extends Transporte 
{
    private ArrayList<Alumno>alumnos;

    public MotoTaxi(ArrayList<Alumno> alumnos, String placa, String color, Transportista transportista, ArrayList<Estacion> estaciones) {
        super(placa, color, transportista, estaciones);
        this.alumnos = new ArrayList(2);
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "MotoTaxi{" + "alumnos=" + alumnos + '}';
    }
    
    
    
    
}
