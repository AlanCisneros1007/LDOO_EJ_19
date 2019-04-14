/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import java.util.HashMap;

/**
 *
 * @author Alan Cisneros
 */
public class Factory {
     private static Factory factory;
    private HashMap<String, Usuario> usuarios = new HashMap();
    
    public Factory(){        
    }
    
    public static Factory getFactory(){
        if (factory == null){
            factory = new Factory();
        }
        return factory;
    }
    
    public void addUser(String user, String password, String fn,String email, String rango, int id, int nempl, String nombre, String suscripcion, String direccion){
        usuarios.put(user, crearUsuario(user, password, fn, email, rango, id, nempl, nombre, suscripcion, direccion));
    }
    
    public Usuario getUser(String user){
        return  usuarios.get(user);
    }
    
    public static Usuario crearUsuario(String user, String password, String fn,String email, String rango, int id, int nempl, String name, String suscripcion, String direccion){
         switch (rango) {
             case "Normal":
                 return new Normal(user, password, id, fn, email, name, suscripcion, direccion);
             case "Admin":
                 return new Administrador(user, password, id, fn, email);
             case "Invitado":
                 return new Invitado(user, password, id, fn, email, name);
             default:
                 break;
         }
        
        return new Normal("admin", "admin", 0, "0", "admin", "admin", "free", "null");
    }
}
