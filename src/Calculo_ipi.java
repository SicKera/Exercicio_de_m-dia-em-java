import java.util.Scanner;

public class Calculo_ipi {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double ipi, valor1, valor2, valor_total;
        int cod1, cod2, quant1, quant2;

        // Informações da Peça 1

        System.out.println("Insira o código da peça 1:");
        cod1 = input.nextInt();

        System.out.println("Insira o valor unitário da peça 1:");
        valor1 = input.nextDouble();

        System.out.println("Insira a quantidade da peça 1:");
        quant1 = input.nextInt();


        // Informações da Peça 2

        System.out.println("Insira o código da peça 2:");
        cod2 = input.nextInt();

        System.out.println("Insira o valor unitário da peça 2:");
        valor2 = input.nextDouble();

        System.out.println("Insira a quantidade da peça 2:");
        quant2 = input.nextInt();

        // Entrada do valor do IPI

        System.out.println("Insira o valor do IPI: ");
        ipi = input.nextDouble();

        valor_total = (valor1*quant1 + valor2*quant2)*(ipi/100 + 1);

        System.out.println("O valor total ficou em " + valor_total + " reais.");




    }
}
