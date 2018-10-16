/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formSoap;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class messagesError {
    public boolean MessageError(String error, String operation){
        switch(error){
            case "RepeatValue":
                JOptionPane.showMessageDialog(null, "El valor es repetido", operation, JOptionPane.ERROR_MESSAGE);
                break;
            case "LoadError":
                JOptionPane.showMessageDialog(null, "No tiene permisos o error al cargar el servicio", operation, JOptionPane.ERROR_MESSAGE);
                break;
            case "ConnectError":
                JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion con la DB", operation, JOptionPane.ERROR_MESSAGE);
                break;
            case "Accepted":
                JOptionPane.showMessageDialog(null, "Se guardo el el valor", operation, JOptionPane.INFORMATION_MESSAGE);
                return true;
            case "Deleted":
                JOptionPane.showMessageDialog(null, "Se elimino correctamente", operation, JOptionPane.INFORMATION_MESSAGE);
                return true;
            default:
                JOptionPane.showMessageDialog(null, "No se identifico el error", operation, JOptionPane.ERROR_MESSAGE);
                break;
        }
        return false;
    }
    
    public boolean MessageError(int error, String operation){
        switch(error){
            case -1:
                JOptionPane.showMessageDialog(null, "Error de Conexino con la Db", operation, JOptionPane.ERROR_MESSAGE);
                break;
            case -2:
                JOptionPane.showMessageDialog(null, "Se encontro un error en la busqueda", operation, JOptionPane.ERROR_MESSAGE);
                break;
            default:
                //JOptionPane.showMessageDialog(null, "Busqueda Terminada", operation, JOptionPane.INFORMATION_MESSAGE);
                return true;
        }
        return false;
    }
}
