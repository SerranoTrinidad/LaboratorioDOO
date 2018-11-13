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
public final class Aula {
    private String nombreAula;
    private String numAula;
 
       public Aula(String nomreAula, String numAula){
        setNombreAula(nombreAula);
        setNumAula(numAula);
    }

    public void setNombreAula(String nombreAula) {
        this.nombreAula = nombreAula;
    }
    public String getNombreAula() {
        return nombreAula;
    }
    
    public void setNumAula(String numAula) {
        this.numAula = numAula;
    }   
    
    public String getNumAula() {
        return numAula;
    }
}

    
