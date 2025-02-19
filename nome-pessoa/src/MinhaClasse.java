import java.util.Scanner;
import java.util.Locale;

public class MinhaClasse {
    
    public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
      System.out.println("Digite sue nome : ");
      String nome = scanner.next();

      System.out.println("Digite seu sobrenome :");
      String sobrenome = scanner.next();

      System.out.println("Digite sua altura: ");
      double altura = scanner.nextDouble();

      System.out.println("Digite sua idade: ");
      int idade = scanner.nextInt();

      System.out.println("Ola, me chamo " + nome + " " + sobrenome );
      System.out.println("Tenho " + idade + " " + "anos ");
      System.out.println("Minha altura é " + altura + "cm");

    }
    
}
