package operaciones;

import java.util.Scanner;

public class OperacionesMain {
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un número -> ");
        int num_1 = teclado.nextInt();
        
        System.out.print("ingrese otro número -> ");
        int num_2 = teclado.nextInt();
        
        Operaciones valores = new Operaciones(num_1, num_2);
        valores.mostrar();
        
    }
}
