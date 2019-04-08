
package cadenas;
import java.util.Scanner;

public class CadenasScanner {
    public static void main(String args[]){
       
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la palabra1 -> ");
        String palabra1 = teclado.nextLine();
        
        System.out.print("Ingrese la palabra2 -> ");
        String palabra2 = teclado.nextLine();
        
        System.out.print("Ingrese la palabra3 -> ");
        String palabra3 = teclado.nextLine();
        
        System.out.println(palabra1 + " " + palabra2 + " " + palabra3);
    }
    
}
