
package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alan Cisneros
 */
public class Consultas extends Conexion {
    
    public boolean autenticacion(String usuario, String contraseña){
         PreparedStatement pst = null;
         ResultSet rs = null;
         try{
              String consulta = "select * from usuarios where usuario = ? and pass = ?";
              pst = getConexion().prepareStatement(consulta);
              pst.setString(1, usuario);
              pst.setString(2, contraseña);
              rs = pst.executeQuery();
              if(rs.absolute(1)){
                  return true;
             }
            
          }catch(SQLException eu){
              System.err.println("Error" +eu);
          }finally{
              try{
               if(getConexion()!=null){ getConexion().close(); }
               if(pst!=null){ pst.close(); }
               if(rs!=null){ rs.close(); }
              }catch(SQLException ex){
                System.err.println("Error" +ex); 
              }
         }
          return false;  
   }
    
      public boolean registrar(String nombre,String apellido,String usuario, String contraseña ){
          PreparedStatement pst = null;
        try{
              String consulta = "insert into usuarios(nombre,apellido,usuario,pass) values(?,?,?,?)";
              pst = getConexion().prepareStatement(consulta);
             pst.setString(1,nombre);
              pst.setString(2,apellido);
              pst.setString(3,usuario);
              pst.setString(4,contraseña);
            
              if(pst.executeUpdate() == 1){
                  return true;
              }
          }catch(SQLException el){
              System.err.println("Error"+el);
          }finally{
              try{
              if(getConexion()!=null){ getConexion().close();}
              if(pst != null){ pst.close(); }
                 }catch(SQLException e){
                      System.err.println("Error"+e);
                  }
           }
          return false;
     }
    
      
    
}
