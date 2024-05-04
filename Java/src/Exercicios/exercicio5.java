import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, qte1, qte2;
        double preco1, preco2, total;

        System.out.println("Digite o codigo da peca:");
        cod1 = sc.nextInt();
        System.out.println("Digite a quantidade:");
        qte1 = sc.nextInt();
        System.out.println("Digite o valor da peca:");
        preco1 = sc.nextDouble();

        System.out.println("Digite o codigo da 2*peca:");
        cod2 = sc.nextInt();
        System.out.println("Digite a quantidade:");
        qte2 = sc.nextInt();
        System.out.println("Digite o valor da 2*peca:");
        preco2 = sc.nextDouble();

        total = preco1 * qte1 + preco2 * qte2;

        System.out.printf("VALOR A PAGAR DAS DUAS PECAS: R$ %.2f%n", total);

        sc.close();
    }
}