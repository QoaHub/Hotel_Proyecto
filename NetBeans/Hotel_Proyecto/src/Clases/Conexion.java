package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Conexion {
    static Connection c = null;
    static Statement s= null;
    static ResultSet r = null;
    static String bd="hotel_v1";
    static String login="root";
    static String password="";
    static String url="jdbc:mysql://localhost:3306/"+bd;
    protected static Connection Enlace(Connection conn) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url,login,password);
        } catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"Clase no encontrada");
        }
        return conn;
    }
    protected static Statement sta (Statement st) throws SQLException {
        c = Enlace(c);
        st = c.createStatement();
        return st;
    }
    public static ResultSet Acceder (int t,String n,String p)  throws SQLException {
        s = sta(s);
        r = s.executeQuery("Select count(*) from usuario WHERE tipo='"+t+"' AND (usuario='"+n+"' AND ("
                + "clave='"+p+"' AND estado='0'))");
        return r;
    }
}
