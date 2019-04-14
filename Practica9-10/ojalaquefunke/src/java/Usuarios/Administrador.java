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
public class Administrador extends Usuario {

    private int nempl;
    
    public Administrador() {
    }

    public Administrador(String usuario, String password, int id, String fn, String email) {
        super(usuario, password, id, fn, email);
        setRango("adm");
    }

    public int getNempl() {
        return nempl;
    }

    public void setNempl(int nempl) {
        this.nempl = nempl;
    }

  
    @Override
     public void setRango(String rango){
        this. rango = rango;
    }
    
}
