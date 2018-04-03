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
public class Mujer extends Persona{

    public Mujer(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }
    
    public int diferenciaEdad(Persona a ){
        int e=(this.edad - a.getEdad());
        if(e<0){
            e=e*-1;
        }
      return e;
    }
}
