package Exercicios.aleatorios;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        double A = sc.nextDouble();
        System.out.println("Digite o segundo numero:");
        double B = sc.nextDouble();

        double soma = A + B;

        System.out.println("Soma = " + soma);

        sc.close();
    }
}
