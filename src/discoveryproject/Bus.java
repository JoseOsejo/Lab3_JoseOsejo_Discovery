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
public class Bus extends Transporte {

    private ArrayList<Alumno> alumnos;
    private int numeroSillas;
    private int capacidadPersonasPie;
    //el numero de sillas + numeroCapacidadPersonasPie = cantidad de Alumnos

    public Bus(ArrayList<Alumno> alumnos, int numeroSillas, int capacidadPersonasPie, String placa, String color, Transportista transportista, ArrayList<Estacion> estaciones) {
        super(placa, color, transportista, estaciones);
        this.alumnos = alumnos;
        this.numeroSillas = numeroSillas;
        this.capacidadPersonasPie = capacidadPersonasPie;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public int getNumeroSillas() {
        return numeroSillas;
    }

    public void setNumeroSillas(int numeroSillas) {
        this.numeroSillas = numeroSillas;
    }

    public int getCapacidadPersonasPie() {
        return capacidadPersonasPie;
    }

    public void setCapacidadPersonasPie(int capacidadPersonasPie) {
        this.capacidadPersonasPie = capacidadPersonasPie;
    }

    @Override
    public String toString() {
        return "Buses{" + "alumnos=" + alumnos + ", numeroSillas=" + numeroSillas + ", capacidadPersonasPie=" + capacidadPersonasPie + '}';
    }

}
