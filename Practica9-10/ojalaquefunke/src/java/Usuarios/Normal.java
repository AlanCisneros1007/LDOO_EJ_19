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
public class Normal extends Usuario{
     private String nombre;
    private String suscripcion;
    private String direccion;
    
    public Normal(){
        
    }
    
    public Normal(String usuario, String password, int id, String fn, String email, String nombre, String suscripcion, String direccion){
        setNombreusuario(usuario);
        setPass(password);
        setId(id);
        setFn(fn);
        setEmail(email);
        setNombre(nombre);
        setSuscripcion(suscripcion);
        setDireccion(direccion);
        setRango("Normal");
    }

    
    public String getNombre() {
        return nombre;
    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public String getSuscripcion() {
        return suscripcion;
    }

    
    public void setSuscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }

 
    public String getDireccion() {
        return direccion;
    }

    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    @Override
    public void setRango(String rango){
        this.rango = rango;
    }
}
