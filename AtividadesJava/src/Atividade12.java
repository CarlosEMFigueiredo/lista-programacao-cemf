import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor do dividendo (x): ");
        int x = entrada.nextInt();

        System.out.print("Digite o valor do divisor (y): ");
        int y = entrada.nextInt();

        int quociente = x / y; // Divisão inteira
        int resto = x % y;     // Módulo (resto da divisão)

        System.out.println("Quociente da divisão: " + quociente);
        System.out.println("Resto da divisão: " + resto);

    }
}
