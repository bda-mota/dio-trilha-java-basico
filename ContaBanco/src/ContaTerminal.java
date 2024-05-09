import java.util.Scanner;
public class ContaTerminal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o número da sua agência: ");
        String agencia = scanner.nextLine();
        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Agência: " + agencia);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Saldo: " + saldo);

        scanner.close();
    }

}
