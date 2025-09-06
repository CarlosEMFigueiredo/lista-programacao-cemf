import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius (°C): ");
        double celsius = entrada.nextDouble();

        double fahrenheit = (9 * celsius) / 5 + 32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + "°F");

    }
}


