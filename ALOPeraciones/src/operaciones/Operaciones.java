package operaciones;

public class Operaciones {

    private int num1, num2, suma, resta, multi, divi;

    public Operaciones(int num_1, int num_2) {
        this.num1 = num_1;
        this.num2 = num_2;

    }

    public void Resultados() {

        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        divi = num1 / num2;
    }

    public void mostrar(){
        Resultados();
        System.out.println("Suma = "+ suma +"\nResta = " + resta +"\nMultiplicación = " + multi + "\nDivisión = " + divi);
    }
    
}
