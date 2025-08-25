//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*public class Main {
    public static void main(String[] args) {
        // Para testar, inicialize args manualmente:
        args = new String[2];
        args[0] = "17"; // exemplo de versão da JDK
        args[1] = "Java"; // exemplo de linguagem

        System.out.println("hello word.");
        System.out.println("configurando a Jdk na versão " + args[0]);
        System.out.println("Programando em " + args[1]);
    }
}
    */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        System.out.printf("Olá %s!\nVocê tem %d anos e mede %.2f metros.\n", nome, idade, altura);

        scanner.close();
    }
}
