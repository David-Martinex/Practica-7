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
public class Maestro extends Trabajador{
    private String turno;
    private int materias;

    public Maestro() {
    }
    /**
     * 
     * @param turno Se menciona como debe ser llamado el objeto turno
     * @param materias Se menciona como debe ser llamado el objeto materias
     * @param matricula Se menciona que objeto tomara de la clase "Trabajador"
     * @param sueldo Se menciona que objeto toamra de la clase "Trabajador"
     * @param nombre Se menciona que objeto toamra de la clase "Persona"
     * @param edad  Se mencina que objeto tomara de la clase "Persona"
     */
    public Maestro(String turno, int materias, int matricula, int sueldo, String nombre, int edad) {
        super(matricula, sueldo, nombre, edad);
        this.turno = turno;
        this.materias = materias;
    }
    /**
     * 
     * @return Se regresa el valor de turno, al crear su get
     */
    public String getTurno() {
        return turno;
    }
    /**
     * 
     * @param turno Se esta creando el set de turno
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }
    /**
     * 
     * @return Se regresa el valor de materias, al crear su get
     */
    public int getMaterias() {
        return materias;
    }
    /**
     * 
     * @param materias Se esta creando el set de materias
     */
    public void setMaterias(int materias) {
        this.materias = materias;
    }
    /**
     * 
     * @return Regresa en forma de mensaje, el contenido de la clase
     */
    @Override
    public String toString() {
        return super.toString()+"Maestro{" + "turno=" + turno + ", materias=" + materias + '}';
    }   
}