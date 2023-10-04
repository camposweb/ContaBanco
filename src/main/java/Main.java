import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        ContaTerminal cliente = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da Agência: ");
        cliente.setAgencia(scanner.next());
        System.out.println("Digite o número da Conta: ");
        cliente.setConta(scanner.nextInt());
        System.out.println("Digite o nome do cliente: ");
        cliente.setNomeCliente(scanner.next());
        System.out.println("Digite o saldo: ");
        cliente.setSaldo(scanner.nextDouble());
        System.out.println("Olá " + cliente.getNomeCliente() + " obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + cliente.getAgencia() + " conta " + cliente.getConta() + " e seu saldo "
                + cliente.getSaldo() + " já está disponível para saque" );
    }
}
