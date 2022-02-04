/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discoveryproject;

import java.util.Date;

/**
 *
 * @author jcoq2
 */
public class Persona 
{
    private String nombre;
    private int identidad;//unico
    private Date fechaNacimiento;

    

    public Persona(String nombre, int identidad, Date fechaNacimiento) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentidad() {
        return identidad;
    }

    public void setIdentidad(int identidad) {
        this.identidad = identidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "" + "nombre=" + nombre + ", identidad=" + identidad + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
}
