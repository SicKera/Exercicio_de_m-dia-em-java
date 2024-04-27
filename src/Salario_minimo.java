import java.util.Scanner;

public class Salario_minimo {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        float salario_minimo, salario_usuario, quant_sal;

        System.out.println("Qual o salário mínimo atual?");
        salario_minimo = input.nextFloat();

        System.out.println("Qual o salário do usuário?");
        salario_usuario = input.nextFloat();

        quant_sal = salario_usuario/salario_minimo;

        System.out.println("O usuário recebe " + quant_sal + " salários mínimos.");

    }
}
