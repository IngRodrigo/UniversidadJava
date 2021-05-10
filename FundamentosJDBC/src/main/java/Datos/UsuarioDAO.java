package Datos;

import domain.Usuario;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Rodrigo-DevCode
 */
public class UsuarioDAO {
  private static final String SQL_SELECT="select id_usuario, nombre, usuarios.password from usuarios";
  private static final String SQL_INSERT="insert into usuarios (nombre, password) values (?,?)";
  private static final String SQL_UPDATE="update usuarios set nombre=?, password=? where id_usuario=?";
  private static final String SQL_DELETE="delete from usuarios where id_usuario=?";
  
  public static List<Usuario>seleccionar(){
      Connection con=null;
      PreparedStatement ps=null;
      ResultSet rs=null;
      Usuario usuario=null;
      List<Usuario>lista=new ArrayList<>();
      
      try {
          con=Conexion.getConexion();
          ps=con.prepareStatement(SQL_SELECT);
          rs=ps.executeQuery();
          while (rs.next()) {              
              int id=rs.getInt("id_usuario");
              String nombre=rs.getString("nombre");
              String password=rs.getString("password");
              
              usuario=new Usuario(id, nombre, password);
              
              lista.add(usuario);
          }
      } catch (SQLException ex) {
          ex.printStackTrace(System.out);
      }
      return lista;
  }
  

    public static int insertar(Usuario usuario) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int registros = 0;
        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(SQL_INSERT);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getPassword());

            registros = ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(ps);
                Conexion.close(con);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }
        return registros;
    }

    public static int actualizar(Usuario usuario) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int registros = 0;
        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(SQL_UPDATE);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getPassword());
            ps.setInt(3, usuario.getIdUsuario());

            registros = ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {

            try {
                Conexion.close(ps);
                Conexion.close(con);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public static int eliminar(Usuario usuario) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int registros = 0;
        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(SQL_DELETE);
            ps.setInt(1, usuario.getIdUsuario());

            registros = ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {

            try {
                Conexion.close(ps);
                Conexion.close(con);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

  
}
