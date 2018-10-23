/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formRest;

/**
 *
 * @author Duglas
 */
public class Professor {
    
    String id_profesor;
    String cui;
    String nombre;
    String apellido;
    String fechanac;
    
    public Professor(String id_profesor, String cui, String nombre, String apellido, String fechanac){
        this.id_profesor = id_profesor;
        this.cui = cui;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechanac = fechanac;
    }
    
}
