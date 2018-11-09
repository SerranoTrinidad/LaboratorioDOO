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
public class EmpleadoFactory {
    
    public Empleado getEmpleado (String tipoEmpleado){
       
        if (tipoEmpleado == null){
            return null;
        }
        
        if (tipoEmpleado.equalsIgnoreCase("EmpleadoBase")){
            return (Empleado) new EmpleadoBase();
            
        } else if(!tipoEmpleado.equalsIgnoreCase("EmpleadoHora")){
            if(tipoEmpleado.equalsIgnoreCase("EmpleadoDia")){
                return (Empleado) new EmpleadoDia();
            }
        } else {
            return (Empleado) new EmpleadoHora();
        }
        
        return null;
       
        
    }
    
}
