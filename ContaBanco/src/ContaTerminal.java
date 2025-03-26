import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR"));

        System.out.println("Insira o seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Insira o número da agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Insira o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Insira o saldo: ");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + "! Obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo R$ " + saldoConta + " já está disponível para saque.");

        scanner.close();

    }
}