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
public class Practica7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Se realiza la primera actividad donde se utiliza la clase "Empleado"
         */
        System.out.println("1******************************************");
        Empleado empleado=new Empleado();
        empleado.setNombre("Angel");
        empleado.setNumEmpleado(123);
        empleado.setSueldo(16000);
        System.out.println(empleado);
        
        empleado.aumentarSueldo(10);
        System.out.println(empleado);
        System.out.println("2******************************************");
        /**
         * Se realiza la segunda actividad donde se utiliza la clase de "Gerente"
         */
        Gerente gerente1=new Gerente();
        gerente1.setNombre("Cesar");
        gerente1.setNumEmpleado(12);
        gerente1.setSueldo(25000);
        gerente1.setPresupuesto(100000);
        System.out.println("Nombre: "+gerente1.getNombre());
        System.out.println("Numero de Empleado: "+gerente1.getNumEmpleado());
        System.out.println("Sueldo: "+gerente1.getSueldo());
        System.out.println("Presupuesto: "+gerente1.getPresupuesto());
        
        gerente1.setPresupuesto(500000);
        System.out.println("Presupuesto: "+gerente1.getPresupuesto());
        System.out.println("3******************************************");
        /**
         * Se realiza una sobre carga en la clase "Gerente", en la actividad 3
         */
        Gerente gerente2=new Gerente("Julio",88,200000,500000);
        System.out.println("Nombre: "+gerente2.getNombre());
        System.out.println("Numero de Empleado: "+gerente2.getNumEmpleado());
        System.out.println("Sueldo: "+gerente2.getSueldo());
        System.out.println("Presupuesto: "+gerente2.getPresupuesto());
        System.out.println("4******************************************");
        /**
         * Se imprime la informacion de gerente2, en la actividad 4
         */
        //Sobre escritura
        System.out.println(gerente2);
        System.out.println("5******************************************");
        /**
         * Se realiza una sobre escritura en gerente2, para la actividad 5
         */
        //Sobre escritura
        System.out.println("Presupuesto: "+gerente2.getPresupuesto());
        gerente2.setPresupuesto(100000);
        System.out.println("Presupuesto: "+gerente2.getPresupuesto());
        gerente2.setPresupuesto(5, 5.5f);
        System.out.println("Presupuesto: "+gerente2.getPresupuesto());
        System.out.println("Trabajo******************************************Trabajo");
        /**
         * Actividad de reporte: Se desea imprimir la informacion que se dara
         * a la clase "Alumno"
         */
        System.out.println("Alumno******************************************Alumno");
        Alumno alu1=new Alumno();
        alu1.setEdad(19);
        alu1.setNombre("Bruno");
        alu1.setNumcuenta(317180125);
        alu1.setSemetre(3);
        System.out.println(alu1);
        /**
         * Actividad de reporte: Se desea imprimir la informacion que se dara
         * a la clase "Maestro"
         */
        System.out.println("Maestroo******************************************Maestro");
        Maestro ma1=new Maestro();
        ma1.setNombre("Marco Antonio");
        ma1.setEdad(34);
        ma1.setMatricula(356);
        ma1.setMaterias(5);
        ma1.setSueldo(16000);
        ma1.setTurno("Mixto");
        System.out.println(ma1);
        /**
         * Actividad de reporte: Se desea imprimir la informacion que se dara 
         * a la clase "Director"
         */
        System.out.println("Director******************************************Director");
        Director dir1=new Director();
        dir1.setEdad(48);
        dir1.setNombre("Jose Antonio");
        dir1.setMatricula(56);
        dir1.setSueldo(42000);
        dir1.setNumfacultades(8);
        System.out.println(dir1);
    }   
}