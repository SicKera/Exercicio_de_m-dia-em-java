import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int num = 0;

        System.out.println("Insira um número: ");
        num = input.nextInt();

        int antecessor = num - 1;
        int sucessor = num + 1;


        System.out.println("Antecessor: " + antecessor + "\nSucessor: " + sucessor);


    }
}
