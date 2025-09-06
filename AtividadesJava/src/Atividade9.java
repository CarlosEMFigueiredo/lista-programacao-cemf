
    import java.util.Scanner;

    public class Atividade9 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite o valor da base do retângulo: ");
            double base = entrada.nextDouble();

            System.out.print("Digite o valor da altura do retângulo: ");
            double altura = entrada.nextDouble();

            double perimetro = 2 * (base + altura);

            System.out.println("O perímetro do retângulo é: " + perimetro);


        }
    }
}
