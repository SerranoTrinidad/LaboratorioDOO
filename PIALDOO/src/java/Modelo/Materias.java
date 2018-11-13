/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Luis Serrano
 */
public final class Materias {
    private String idMateria;
    private String nombreMateria;
 
       public Materias(String idMateria, String nombreMateria){
        setIdMateria(idMateria);
        setNombreMateria(nombreMateria);
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
    public String getNombreMateria() {
        return nombreMateria;
    }
    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }
    public String getIdMateria() {
        return idMateria;
    }
    

}
   
