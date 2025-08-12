import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        Random num = new Random();
        int tentativas = 7;
        boolean acerotu = false;
        int numeroSecreto = num.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tente advinhar o número entre 1 e 100. Você tem 7 tentativas");

        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ":");
            int numero = scanner.nextInt();

            if (numero == numeroSecreto) {
                System.out.println("Você acertou, Parabéns.");
                acerotu = true;
                break;
            }
            if (numero < numeroSecreto) {
                System.out.println("O número é maior, tente novamente");
            }
            if (numero > numeroSecreto) {
                System.out.println("O número é menor, tente novamente");
            }

        }
        if (!acerotu) {
            System.out.println("Você perdeu, o numero correto era: " + numeroSecreto);
        }
    }
}