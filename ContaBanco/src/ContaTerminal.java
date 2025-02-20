import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
            System.out.println("Por favor, digite o número da Conta !");
            int numeroConta = scanner.nextInt();
    
            System.out.println("Por favor, digite o número da Agência !");
            int numeroAgencia = scanner.nextInt();
    
            System.out.println("Por favor, digite seu nome !");
            String nome = scanner.next();
    
            System.out.println("Por favor, digite o seu sobrenome !");
            String sobrenome = scanner.next();
    
            System.out.println("Por favor, digite o seu saldo !");
            double saldo =  scanner.nextDouble();
    
            System.out.println("Ola, " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponivel para saque");
            
        
    }
    
}
