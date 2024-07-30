package Exercicios.aleatorios;

import java.util.Locale;
import java.util.Scanner;
public class exercicio0 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Largura e o Comprimento nesta ordem");
        System.out.println("Largura:");
        double largura = sc.nextDouble();
        System.out.println("Comprimento:");
        double comprimento = sc.nextDouble();
        System.out.println("Agora digite o valor do metro quadrado:");
        double valormetro = sc.nextDouble();


        double area = largura * comprimento;
        double preco = area * valormetro;



        System.out.printf("Area do terreno = %.2f%n", area);
        System.out.printf("Valor do terreno = %.2f%n", preco);

        sc.close();




    }
}

