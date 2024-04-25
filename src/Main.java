import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int[] lista1 = {8, 9, 7};
        int[] lista2 = {4, 5, 6};

        int soma_lista1 = Arrays.stream(lista1).sum();
        int soma_lista2 = Arrays.stream(lista2).sum();
        int media1 = (soma_lista1 / lista1.length);
        int media2 = (soma_lista2 / lista2.length);
        float media_geral = (media1 + media2);


        // Média da lista1
        System.out.println(media1);
        // Média da lista2
        System.out.println(media2);
        // soma das duas médias
        System.out.println(media1 + media2);
        // média das médias
        System.out.println(media_geral /2);

    }
}