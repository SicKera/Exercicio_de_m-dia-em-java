import java.util.Scanner;

public class Saldo {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double saldo;

        System.out.println("Informe o saldo:");
        saldo = input.nextFloat();

        double saldo_reajuste = saldo*0.01 + saldo;

        System.out.println("Seu saldo reajustado é de " + saldo_reajuste + " reais.");
    }
}
