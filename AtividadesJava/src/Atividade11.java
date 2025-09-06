import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua idade em anos: ");
        int idadeAnos = entrada.nextInt();

        int idadeMeses = idadeAnos * 12;

        System.out.println("Sua idade em meses é: " + idadeMeses);


    }
}
