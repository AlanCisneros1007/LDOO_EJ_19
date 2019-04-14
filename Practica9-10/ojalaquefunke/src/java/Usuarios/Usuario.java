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
public abstract class Usuario {
 
    
    protected String nombreusuario;
    protected String pass;
    protected int id;
    protected String fn;
    protected String email;
    protected String rango;
    
    public Usuario(){
    }
    
    public Usuario(String usuario, String password, int id, String fn, String email){
       this.nombreusuario=usuario;
       this.pass=password;
       this.id=id;
       this.fn=fn;
       this.email=email;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRango() {
        return rango;
    }
    
    public abstract void setRango(String rango);
    

}
