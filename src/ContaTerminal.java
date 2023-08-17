import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int numero;
        String nome;
        String conta;
        double saldo;

        System.out.println("Por favor informa o numero da sua agência:");
        numero = entrada.nextInt();

        System.out.println("Por favor informe seu nome:");
        nome = entrada.next();

        System.out.println("Por favor informe sua conta:");
        conta = entrada.next();

        System.out.println("Por favor informe seu saldo:");
        saldo = entrada.nextDouble();

        System.out.println("Olá ".concat(nome) + ", obrigado por criar uma conta em nosso banco, sua agência "
        + numero + ", conta ".concat(conta) + " e seu saldo R$" + saldo + " está disponínvel para saque.");
    }
}
