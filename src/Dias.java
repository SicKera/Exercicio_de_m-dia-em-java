import java.util.Scanner;

public class Dias {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int anos, meses, dias;

        System.out.println("Anos:");
        anos = input.nextInt();

        System.out.println("Meses:");
        meses = input.nextInt();

        System.out.println("Dias:");
        dias = input.nextInt();

        int dias_vida = anos*365 + meses*30 + dias;

        System.out.println("Voce tem " + dias_vida + " dias de vida!!!" );

    }
}
