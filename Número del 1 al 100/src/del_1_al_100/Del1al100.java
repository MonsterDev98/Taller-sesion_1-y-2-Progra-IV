/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package del_1_al_100;

/**
 *
 * @author ASUS
 */
public class Del1al100 {

    public static void main(String args[]) {

        int inicio = 1;
        int final_ = 100;
        int cinco = 5;
        int dos = 2;

        for (inicio = 1; inicio <= final_; inicio++) {
            if (inicio != cinco && inicio != dos) {
                System.out.print(inicio + ", ");

            } else if (inicio == dos) {
                System.out.print("");
                dos += 10;

            } else if (inicio == cinco) {
                System.out.print("");
                cinco += 10;
            }
        }

    }

}
