
package Controlador;

import Usuarios.Factory;
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
            Factory factory = Factory.getFactory();
            
         try{
               String consulta = null;
               
             switch (factory.getUser(usuario).getRango()) {
                 case "Admin":
                     consulta = "select * from admin where user = ? and password = ?";
                     break;
                 case "Normal":
                     consulta = "select * from normal where user = ? and password = ?";
                     break;
                 case "Invitado":
                     consulta = "select * from invitado where user = ? and password = ?";
                     break;
                 default:
                     break;
             }
            
              
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
    
      public boolean registrar(String user, String password, String fn, String email, String rango, int id, int nempl, String name, String suscriptiontype, String address){
          PreparedStatement pst = null;
        try{
              switch (rango) {
                  case "Admin":
                      {
                          String consulta = "insert into admin (user, password, fn, email, rango, id, nempl) values(?,?,?,?,?,?,?)";
                          pst = getConexion().prepareStatement(consulta);
                          pst.setString(1, user);
                          pst.setString(2, password);
                          pst.setString(3, fn);
                          pst.setString(4, email);
                          pst.setString(5, rango);
                          pst.setInt(6, id);
                          pst.setInt(7, nempl);
                          break;
                      }
                  case "Normal":
                      {
                          String consulta = "insert into normal (user, password, fn, email, rango, id, name, suscripcion, direccion) values(?,?,?,?,?,?,?,?)";
                          pst = getConexion().prepareStatement(consulta);
                          pst.setString(1, user);
                          pst.setString(2, password);
                          pst.setString(3, fn);
                          pst.setString(4, email);
                          pst.setString(5, rango);
                          pst.setInt(6, id);
                          pst.setString(7, name);
                          pst.setString(7, suscriptiontype);
                          pst.setString(8, address);
                          break;
                      }
                  case "Invitado":
                      {
                          String consulta = "insert into invitado (user, password, fn, email, rango, id, name) values(?,?,?,?,?,?,?,?)";
                          pst = getConexion().prepareStatement(consulta);
                          pst.setString(1, user);
                          pst.setString(2, password);
                          pst.setString(3, fn);
                          pst.setString(4, email);
                          pst.setString(5, rango);
                          pst.setInt(6, id);
                          pst.setString(7, name);
                  
                          break;
                      }
                  default:
                      break;
              }

            
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
