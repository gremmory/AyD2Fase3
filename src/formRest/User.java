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
public class User {
    
    String id_usuario="";
    String correo="";
    String contraseña="";
    String rol="";
    
    public User(String id_usuario,String correo,String contraseña,String rol){
       this.id_usuario=id_usuario;
       this.correo=correo;
       this.contraseña=contraseña;
       this.rol=rol;
        
    }
    
}
