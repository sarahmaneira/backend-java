import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
          var scanner = new Scanner(System.in);
        System.out.println("Escolha um numero para saber a tabuada:");
        int tabuada = scanner.nextInt();

        for (var i=1; i<=10;i++) {
            var result = i * tabuada;
            System.out.println(i + "x"+tabuada + "=" + result);

        }

    }
}
