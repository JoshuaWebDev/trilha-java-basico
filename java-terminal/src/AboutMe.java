import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String firstname = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String lastname = scanner.next();

        System.out.println("Digite sua idade: ");
        int age = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double height = scanner.nextDouble();

        System.out.println("My name is " + firstname + " " + lastname + ".");
        System.out.println("I have " + age + " years old.");
        System.out.println("My height is " + height + " cm.");
    }
}
