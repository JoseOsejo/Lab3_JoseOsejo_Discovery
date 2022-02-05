/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discoveryproject;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jcoq2
 */
public class Alumno extends Persona
{
//van de gratis   
    private int idEstudiante;//unico
    private ArrayList<Clase>clases;

    public Alumno(int idEstudiante, ArrayList<Clase> clases, String nombre, int identidad, Date fechaNacimiento) {
        super(nombre, identidad, fechaNacimiento);
        this.idEstudiante = idEstudiante;
        this.clases = clases;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public ArrayList<Clase> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clase> clases) {
        this.clases = clases;
    }
    
    

    @Override
    public String toString() {
        return "Alumnos{" + "idEstudiante=" + idEstudiante + ", clases=" + clases + super.toString();
    }
    
    
    
}
