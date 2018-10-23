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
public class WebCourse {
    
    public String id_curso;
    public String nombre;
    public String creditos;
    
    public WebCourse(String id_curso,String nombre,String creditos){
        this.id_curso=id_curso;
        this.nombre=nombre;
        this.creditos=creditos;
    }
    
}
