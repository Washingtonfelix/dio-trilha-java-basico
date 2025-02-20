import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        try{

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digtie seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();


        System.out.println("Olá, meu nome é " + nome +" "+ sobrenome );
        System.out.println("tenho " + idade + " " + "anos");
        System.out.println("e " + altura + " " +"de altura");

        }
        catch(InputMismatchException e ){
            System.out.println("Os campos idade e altura precisam ser númericos");
        }

    }
}
