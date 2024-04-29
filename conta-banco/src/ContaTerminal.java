import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência: ");
        int agencia = scanner.nextInt();
        System.out.println("Por favor, digite o número da conta: ");
        String numero = scanner.next();
        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.next();
        System.out.println("Por favor, informe o saldo da conta: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo de  " + saldo + " já está disponível para saque.");
    }
}
