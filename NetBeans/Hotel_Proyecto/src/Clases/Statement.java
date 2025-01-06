package Clases;
import static Clases.Conexion.s;
public class Statement extends Conexion{
    public static java.sql.Statement getS() {
        return s;
    }
}
