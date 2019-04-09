
package cadenajop;
import javax.swing.JOptionPane;

public class CadenasJOP {
    public static void main(String args[]){
        
        String palabra1, palabra2, palabra3;
        
        palabra1 = JOptionPane.showInputDialog("Ingrese la palabra1");
        palabra2 = JOptionPane.showInputDialog("Ingrese la palabra2");
        palabra3 = JOptionPane.showInputDialog("Ingrese la palabra3");
        String mensaje = palabra1 + " " + " " + palabra2 + " " + palabra3;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
