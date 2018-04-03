/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Estudiante
 */
public class Hombre extends Persona{
   
    public Hombre(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        
    }
    
    @Override
    public String getNombre(){
      return "Hombre " + super.getNombre();
        
    }
    
}
