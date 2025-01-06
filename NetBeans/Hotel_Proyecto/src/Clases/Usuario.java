package Clases;
public class Usuario {
    static int id = 0;
    static int ti = 0;
    static String nombre = null;
    public static int getTi() {
        return ti;
    }
    public static void setTi(int ti) {
        Usuario.ti = ti;
    }
    public static int getId() {
        return id;
    }
    public static void setId(int id) {
        Usuario.id = id;
    }
    public static String getNombre() {
        return nombre;
    }
    public static void setNombre(String nombre) {
        Usuario.nombre = nombre;
    }
}
