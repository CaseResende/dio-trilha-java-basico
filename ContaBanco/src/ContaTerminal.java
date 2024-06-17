
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, bem vindo ao banco!");
        System.out.println("Vamos cadastrar sua conta?");

        System.out.println("Para começar, por favor, digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Agora precisamos da agência, por favor siga o seguinte padrão: xxx-x: ");
        String agencia = scanner.next();

        System.out.println("Por favor, informe o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Para finalizar, precisamos que nos informe o seu saldo: R$ ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
