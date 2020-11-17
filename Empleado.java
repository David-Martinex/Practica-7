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
public class Empleado {
    private String nombre;
    private int numEmpleado;
    private int sueldo;

    public Empleado() {
    }
    /**
     * 
     * @param nombre  Se menciona como debe ser llamado el objeto nombre
     * @param numEmpleado Se menciona como debe ser llamado el objeto numEmpleado
     * @param sueldo  Se menciona como debe ser llamado el objeto sueldo
     */
    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
    /**
     * 
     * @return Se regresa el valor de nombre, al crear su get
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre Se esta creando el set de nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * 
     * @return Se regresa el valor de numEmpleado, al crear su get
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }
    /**
     * 
     * @param numEmpleado Se esta creando el set de numEmpleado
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    /**
     * 
     * @return Se regresa el valor de sueldo, al crear su get
     */
    public int getSueldo() {
        return sueldo;
    }
    /**
     * 
     * @param sueldo Se meniona que si sueldo es mayor a 0, puede ejecutar su contenido
     */
    public void setSueldo(int sueldo) {
        if (sueldo>=0){
        this.sueldo = sueldo;
    }}
    /**
     * 
     * @return Regresa en forma de mensaje, la informacion de la clase
     */
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    /**
     * 
     * @param porcentaje Se crea el objeto porcentaje
     * @return  Se regresa el valor de porcentaje junto con sueldo
     */
    public int aumentarSueldo(int porcentaje){
        sueldo +=(int)(sueldo*porcentaje/100);
        return sueldo;
    }
}