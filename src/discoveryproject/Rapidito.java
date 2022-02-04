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
public class Rapidito extends Transporte
{
    private int numeroSillas;
    private ArrayList<Alumno> alumnos;
    //la cantidad de alumnos sera la cantidad de sillas;

    public Rapidito(int numeroSillas, ArrayList<Alumno> alumnos, String placa, String color, Transportista transportista, ArrayList<Estacion> estaciones) {
        super(placa, color, transportista, estaciones);
        this.numeroSillas = numeroSillas;
        this.alumnos = alumnos;
    }

    public int getNumeroSillas() {
        return numeroSillas;
    }

    public void setNumeroSillas(int numeroSillas) {
        this.numeroSillas = numeroSillas;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Rapidito{" + "numeroSillas=" + numeroSillas + ", alumnos=" + alumnos + '}';
    }
    
    
}
