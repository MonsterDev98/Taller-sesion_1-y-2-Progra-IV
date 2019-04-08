
package palabrasBR;
import java.io.*;


public class PalabrasconBR {
    public static void main(String[] args){
               
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        String palabra1= "", palabra2 = "", palabra3 = "";
        
        System.out.print("Ingrese la palabra1 -> ");
        try {
            palabra1 = teclado.readLine();
            
        }catch( IOException e){
            System.out.println("Eror!");
        }
        System.out.print("Ingrese la palabra2 -> ");
        try {
            palabra2 = teclado.readLine();
        }catch( IOException l){
            System.out.println("Eror!");
            
        }
        System.out.print("Ingrese la palabra3 -> ");
        try {
            palabra3 = teclado.readLine();
        }catch( IOException t){
            System.out.println("Eror!");
        }
        System.out.println(palabra1 +  " " + palabra2 + " " + palabra3 );
    }   
    
}
