package Clases;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Habitacion extends Conexion{
    public static ResultSet estado_habitaciones() throws SQLException{
        s = sta(s);
        r = s.executeQuery("SELECT estado FROM habitacion");
        return r;
    }
    public static Statement cambio_mantenimiento(int id, int e) throws SQLException {
        s = sta(s);
        s.executeUpdate("UPDATE habitacion SET estado="+e+" WHERE codhabitacion="+id);
        return s;
    }
}
