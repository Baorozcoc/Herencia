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
public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    //agregacion 
    private Persona casadoCon;
    
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Persona getCasadoCon() {
        return casadoCon;
    }

    public void setCasadoCon(Persona casadoCon) {
        this.casadoCon = casadoCon;
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    public static int diferenciaEdad(Persona a, Persona b){
        int c= (a.getEdad() - b.getEdad());
        if(c<0){
            c=c*-1;
        }
      return c;
    }
    
    
    public boolean EstaCasado(){
        if(casadoCon == null){
            System.out.println("no esta casad@");
            return false;
        }
        else{
            if(casadoCon instanceof Mujer){
                System.out.println("Esta casad@ con la mujer " + casadoCon.getNombre() + " " + casadoCon.getApellido());
            }
            else
                System.out.println("Esta casad@ con el hombre" + casadoCon.getNombre() + " " + casadoCon.getApellido());
            
            return true;
        }
    }
    
}
