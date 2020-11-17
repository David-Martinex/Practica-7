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
public class Alumno extends Persona{
    private int semetre;
    private int numcuenta;

    public Alumno() {
    }
    /**
     * 
     * @param semetre Se menciona como debe ser llamado el objeto semestre
     * @param numcuenta Se menciona como debe ser llamado el objeto numcuenta
     * @param nombre Se menciona que objeto tomara de la clase "Persona"
     * @param edad  Se menciona que objeto tomara de la clase "Persona"
     */
    public Alumno(int semetre, int numcuenta, String nombre, int edad) {
        super(nombre, edad);
        this.semetre = semetre;
        this.numcuenta = numcuenta;
    }
    /**
     * 
     * @return Se regresa la informacion de semestre, al crear el get
     */
    public int getSemetre() {
        return semetre;
    }
    /**
     * 
     * @param semetre Se crea el set de semestre
     */
    public void setSemetre(int semetre) {
        this.semetre = semetre;
    }
    /**
     * 
     * @return Se regresa la informacion de numcuenta, al crear el get
     */
    public int getNumcuenta() {
        return numcuenta;
    }
    /**
     * 
     * @param numcuenta Se crea el set de numcuenta
     */
    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }
    /**
     * 
     * @return Regresa en forma de mensaje, toda la informacion que contiene la clase
     */
    @Override
    public String toString() {
        return super.toString()+"Alumno{" + "semetre=" + semetre + ", numcuenta=" + numcuenta + '}';
    }  
}