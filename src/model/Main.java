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
public class Main {
    public static void main(String[] args) {
        Mujer mujer1= new Mujer("Juanita", "perez", 22);
        Hombre hombre1= new Hombre("Pepito", "sanchez", 21);
        hombre1.EstaCasado();
        hombre1.setCasadoCon(mujer1);
        hombre1.EstaCasado();
        mujer1.setCasadoCon(hombre1);
        mujer1.EstaCasado();
        
        
        
        
        
    }
}
