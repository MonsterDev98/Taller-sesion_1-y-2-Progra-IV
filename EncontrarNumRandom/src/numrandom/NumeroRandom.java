package numrandom;
import java.util.Scanner;

public class NumeroRandom {
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        int nummax = 100;
        int num_aleatorio = new java.util.Random().nextInt(nummax);
        int i;
        System.out.print("Ingrese un número -> ");
        int numingresado = teclado.nextInt();
        
        for(i = 1; numingresado != num_aleatorio; i++){
            if(numingresado != num_aleatorio){
                
                if(numingresado < num_aleatorio){
                    System.out.println("el número es mayor al ingresado");
                    
                }else
                    System.out.println("el número es menor al ingresado");
                
            }
                
            System.out.print("Ingrese de nuevo el numero -> ");
            numingresado = teclado.nextInt();
            
        }
        System.out.println("bien, has encontrado el intento N° " + i + " El aleatorio es ="+ num_aleatorio);
    }
}
