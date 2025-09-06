
    import java.util.Scanner;

    public class Atividade7 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite o primeiro número inteiro (a): ");
            int a = entrada.nextInt();

            System.out.print("Digite o segundo número inteiro (b): ");
            int b = entrada.nextInt();

            int soma = a + b;

            System.out.println("A soma de " + a + " + " + b + " é: " + soma);

        }
    }
}
