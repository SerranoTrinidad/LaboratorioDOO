/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

/**
 *
 * @author LSTI204_B1
 */
public class EmpleadoFactoryTest {
    
     public static void main(String[] args) {
         
     EmpleadoFactory empleadof = new EmpleadoFactory();

     Empleado empleado1 = empleadof.getEmpleado("EmpladoBase");
     empleado1.FormaPago();
     
     Empleado empleado2 = empleadof.getEmpleado("EmpladoDia");
     empleado2.FormaPago();
     
     Empleado empleado3 = empleadof.getEmpleado("EmpleadoHora");
     empleado3.FormaPago();
     


   }
}
    
