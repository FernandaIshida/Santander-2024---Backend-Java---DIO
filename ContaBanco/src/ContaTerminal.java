import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner reading = new Scanner(System.in);
        int conta;
        String agencia;
        String nome;
        Double saldo;

        System.out.println("Insira o número de sua conta: ");
        conta = reading.nextInt();
        reading.nextLine();
        System.out.println("Insira o número de sua agência: ");
        agencia = reading.nextLine();
       
        System.out.println("Insira o seu nome: ");
        nome = reading.nextLine();
        
        System.out.println("Insira o saldo: ");
        saldo = reading.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", o número de sua conta é " + conta + " e seu saldo "+ saldo + " já está disponível para saque");
    }
}
