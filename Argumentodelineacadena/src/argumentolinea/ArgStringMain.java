
package argumentolinea;
import java.util.Scanner;

public class ArgStringMain {
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una oración -> ");
        String oracion = teclado.nextLine();
        
        int tamañocad = oracion.length();
      
        ArgString oraciones = new ArgString(oracion, tamañocad);
        
        oraciones.mostrar();
        
    }
}
