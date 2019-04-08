package pares;

public class Pares {

    public static void main(String args[]) {

        int inicio = 1539;
        int final_ = 2505;

        for (int i = inicio; i <= final_; i++) {

            if (i % 2 == 0) {
                System.out.print(i + ", ");

            } else {
                System.out.print("");
            }
        }
    }
}
