package Clases;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Cliente extends Conexion{
    static int nh = 0;

    public static int getNh() {
        return nh;
    }

    public static void setNh(int nh) {
        Cliente.nh = nh;
    }
    
    public static Statement getS() {
        return s;
    }
    public static Connection getC(){
        return c;
    }
    public static ResultSet Existe(String v, String i) throws SQLException {
        s = sta(s);
        r = s.executeQuery("SELECT * from cliente WHERE "+v+"='"+i+"'");
        return r;
    }
    public static ResultSet Nota() throws SQLException {
        s = sta(s);
        r = s.executeQuery("SELECT nota FROM notas ORDER by id DESC LIMIT 1");
        return r;
    }
    public static Statement Agrego(String[] datos) throws SQLException {
        s = sta(s);
        s.executeUpdate("INSERT INTO cliente(codtipocliente,ruc,razonsocial,dni,apellido,nombre,telefono,correo,fechreg,estado) VALUES('"+datos[7]+"','"+datos[0]+"','"+datos[1]+"',"
                + "'"+datos[2]+"','"+datos[3]+"','"+datos[4]+"','"+datos[5]+"','"+datos[6]+"',"
                + "NOW(),'0')");
        return s;
    }
}
