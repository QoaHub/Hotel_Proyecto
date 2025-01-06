package Clases;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Login  extends Conexion{
    public static ResultSet Acceder (int t,String n,String p)  throws SQLException {
        s = sta(s);
        r = s.executeQuery("select count(*) from usuario WHERE tipo='"+t+"' AND (usuario='"+n+"' AND ("
                + "clave='"+p+"' AND estado='0'))");
        return r;
    }
}
