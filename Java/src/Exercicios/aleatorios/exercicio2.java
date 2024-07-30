package Exercicios.aleatorios;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio do circulo:");
        double A = sc.nextDouble();
        double pi = 3.14159;

        double area = pi * A * A;

        System.out.println("A area desse circulo seria:" + area);

        sc.close();
    }
}
