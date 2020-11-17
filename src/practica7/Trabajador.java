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
public class Trabajador extends Persona{
    private int matricula;
    private int sueldo;

    public Trabajador() {
    }
    /**
     * 
     * @param matricula Se menciona como debe ser llamado el objeto matricula
     * @param sueldo Se menciona como debe ser llamado el objeto sueldo
     * @param nombre Se menciona que objeto tomara de la clase "Persona"
     * @param edad Se menciona que objeto tomara de la clase "Persona"
     */
    public Trabajador(int matricula, int sueldo, String nombre, int edad) {
        super(nombre, edad);
        this.matricula = matricula;
        this.sueldo = sueldo;
    }
    /**
     * 
     * @return Se regreas el valor del objeto matricula, al crear su get
     */
    public int getMatricula() {
        return matricula;
    }
    /**
     * 
     * @param matricula Se esta creando el set de matricula
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    /**
     * 
     * @return Se regrea el valor del objeto sueldo, al crear su get
     */
    public int getSueldo() {
        return sueldo;
    }
    /**
     * 
     * @param sueldo Se este creando el set de sueldo
     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    /**
     * 
     * @return Regresa en forma de mensaje, la informacion de la clase
     */
    @Override
    public String toString() {
        return super.toString()+"Trabajador{" + "matricula=" + matricula + ", sueldo=" + sueldo + '}';
    }   
}