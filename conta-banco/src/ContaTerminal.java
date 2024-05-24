import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        String agenciaCliente = scanner.next();

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = scanner.nextDouble();
        //Obter pela scanner os valores digitados no terminal
        

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaCliente + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
