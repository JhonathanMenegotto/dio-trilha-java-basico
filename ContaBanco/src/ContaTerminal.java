import java.util.Scanner;

public class ContaTerminal{

    public static void main(String[] args){

        //Declaração de variáveis
        int numero;
        String agencia, nomeCliente;
        double saldo;

        // Importar a classe Scanner;
        Scanner sc = new Scanner(System.in);

        // Obter os valores pela classe Scanner
        System.out.print("Por favor digite o nome do cliente: ");
        nomeCliente = sc.nextLine();
        System.out.print("Por favor digite o número da agência: ");
        agencia = sc.nextLine();
        System.out.print("Por favor digite o número da conta: ");
        numero = sc.nextInt();
        System.out.print("Por favor digite o valor de depósito: ");
        saldo = sc.nextDouble();

        // Apresentar na tela os valores obtidos e a conta criada.
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                           agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechar a classe Scanner;
        sc.close();

    }

}