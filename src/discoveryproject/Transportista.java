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
public class Transportista extends Persona {
//les pagan 

    private int aniosExperiencia;
    private String apodoBarrio;

    public Transportista(int aniosExperiencia, String apodoBarrio, String nombre, int identidad, Date fechaNacimiento) {
        super(nombre, identidad, fechaNacimiento);
        this.aniosExperiencia = aniosExperiencia;
        this.apodoBarrio = apodoBarrio;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getApodoBarrio() {
        return apodoBarrio;
    }

    public void setApodoBarrio(String apodoBarrio) {
        this.apodoBarrio = apodoBarrio;
    }

    @Override
    public String toString() {
        return "Transportistas{" + "aniosExperiencia=" + aniosExperiencia + ", apodoBarrio=" + apodoBarrio + super.toString();
    }

}
