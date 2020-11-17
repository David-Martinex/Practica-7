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
public class Gerente extends Empleado{
    private int presupuesto;

    public Gerente() {
    }
    /**
     * 
     * @param nombre Se menciona que objeto tomara de la clase "Empleado"
     * @param numEmpleado Se menciona que objeto tomara de la clase "Empleado"
     * @param sueldo Se menciona cque objeto tomara de la clase "Empleado"
     * @param presupuesto  Se menciona como debe ser llamado el objeto presupuesto
     */
    public Gerente(String nombre, int numEmpleado, int sueldo, int presupuesto) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto=presupuesto;
    }
    /**
     * 
     * @return Se regresa el valor de presupuesto, al crear su get
     */
    public int getPresupuesto() {
        return presupuesto;
    }
    /**
     * 
     * @param presupuesto Se esta creando el set de presupuesto
     */
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    /**
     * 
     * @param anio Se utiliza el valor que contiene el objeto anio
     * @param tasa Se utiliza el valor que contiene el objeto tasa
     */
    public void setPresupuesto(int anio,float tasa){
        this.presupuesto += (int)(presupuesto/tasa*anio);
    }
    /**
     * 
     * @return Regresa en forma de mensaje el contenido de la clase
     */
    @Override
    public String toString() {
        return super.toString()+"Gerente{" + "presupuesto=" + presupuesto + '}';
    }
    
}