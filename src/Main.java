import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String name = scanner.next();
        System.out.println("Digite sua idade:");
        int age = scanner.nextInt();
        System.out.printf("Olá %s sua idade é %s", name, age);
    }
}
