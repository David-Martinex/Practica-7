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
public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
    }
    /**
     * 
     * @param nombre Se menciona como debe ser llamado el objeto nombre
     * @param edad Se menciona como debe ser llamado el objeto edad
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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
     * @return Se regresa el valor de edad, al crear su get
     */
    public int getEdad() {
        return edad;
    }
    /**
     * 
     * @param edad Se esta creando el set de edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * 
     * @return Imprime la informacion contenida de la clase
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
}