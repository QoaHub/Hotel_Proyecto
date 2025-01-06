package Clases;
import static Clases.Conexion.s;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Administracion extends Conexion{
    public static Statement getS() {
        return s;
    }
}
