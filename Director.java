/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

/**
 *
 * @author User
 */
public class Director extends Trabajador{
    private int numfacultades;

    public Director() {
    }
    /**
     * 
     * @param numfacultades Se menciona como debe ser llamado el objeto numfacultades
     * @param matricula Se menciona el objeto que tomara de la clase "Trabajador"
     * @param sueldo Se menciona el objeto que tomara de la clase "Trabajador"
     * @param nombre Se menciona el objeto que tomara de la clase "Persona"
     * @param edad  Se menciona el objeto que tomara de la clase "Persona"
     */
    public Director(int numfacultades, int matricula, int sueldo, String nombre, int edad) {
        super(matricula, sueldo, nombre, edad);
        this.numfacultades = numfacultades;
    }
    /**
     * 
     * @return regresa el valor asignado a numfacultades, en get
     */
    public int getNumfacultades() {
        return numfacultades;
    }
    /**
     * 
     * @param numfacultades  se crea el set de numfacultades
     */
    public void setNumfacultades(int numfacultades) {
        this.numfacultades = numfacultades;
    }
    /**
     * 
     * @return Regresa de forma en mensaje la informacion dada, el numfacultades
     */
    @Override
    public String toString() {
        return super.toString()+"Director{" + "numfacultades=" + numfacultades + '}';
    }
}