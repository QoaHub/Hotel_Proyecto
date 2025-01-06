package Formularios;
public class Hotel_Proyecto_1 {
    static Panel_Principal l = new Panel_Principal();
    public Panel_Principal getL() {
        return l;
    }
    public static void main(String[] args) throws InterruptedException {
        Inicio i = new Inicio();
        i.setVisible(true);
        i.setLocationRelativeTo(null);
        Thread.sleep(3000);
        i.dispose();
        l.setVisible(true);
    }
    
}
