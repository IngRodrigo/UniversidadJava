package Datos;

import domain.Persona;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rodrigo-DevCode
 */
public class PersonaDAO {

    private static final String SQL_SELECT = "Select id_persona, nombre, apellido, email, telefono from persona";
    private static final String SQL_INSERT = "insert into persona (nombre, apellido, email, telefono) values (?,?,?,?)";
    private static final String SQL_UPDATE = "update Persona set nombre=?, apellido=?, email=? , telefono=? where id_persona=?";
    private static final String SQL_DELETE = "DELETE from persona where id_persona=?";

    public static List<Persona> seleccionar() {
        Persona persona = null;
        List<Persona> lista = new ArrayList<>();
        ResultSet rs = null;
        PreparedStatement ps = null;
        Connection con = null;
        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");

                persona = new Persona(nombre, apellido, email, telefono, id);
                lista.add(persona);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(ps);
                Conexion.close(con);
            } catch (SQLException ex) {
                Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    public static int insertar(Persona persona) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int registros = 0;
        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(SQL_INSERT);
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getApellido());
            ps.setString(3, persona.getEmail());
            ps.setString(4, persona.getTelefono());

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

    public static int actualizar(Persona persona) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int registros = 0;
        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(SQL_UPDATE);
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getApellido());
            ps.setString(3, persona.getEmail());
            ps.setString(4, persona.getTelefono());
            ps.setInt(5, persona.getIdPersona());

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

    public static int eliminar(Persona persona) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        int registros = 0;
        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(SQL_DELETE);
            ps.setInt(1, persona.getIdPersona());

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
