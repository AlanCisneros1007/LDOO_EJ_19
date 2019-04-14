/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

/**
 *
 * @author Alan Cisneros
 */
public class Invitado extends Usuario{
    private String nombre;
    private String freg;
    
    public Invitado(){
        
    }
    
    public Invitado(String usuario, String password, int id, String fn, String email, String nombre){
        setNombreusuario(usuario);
        setPass(password);
        setId(id);
        setFn(fn);
        setEmail(email);
        setNombre(nombre);
        setRango("inv");
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public String getFechaDeRegistro() {
        return freg;
    }

 
    public void setFreg(String freg) {
        this.freg = freg;
    }
    
    @Override
    public void setRango(String rango){
        this.rango = rango;
    }
}
