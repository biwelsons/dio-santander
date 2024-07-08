import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e recebe os dados do usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine().trim(); // Utilizamos trim() para remover espaços desnecessários

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt(); // Leitura do número da conta

        // Limpar o buffer do Scanner após ler o número da conta
        scanner.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo da Conta:");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem final com os dados inseridos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o scanner
        scanner.close();
    }
}