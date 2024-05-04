package exercicios;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D;

        System.out.println("Digite os numeros que vc quer calcular a diferença:");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        int diferenca = A * B - C * D;

        System.out.println("Valor da diferença:" + diferenca);

        sc.close();

    }
}
