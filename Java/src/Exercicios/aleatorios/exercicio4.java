package Exercicios.aleatorios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numerofuncionario, horastrabalhadas, valorporhora;

        System.out.println("Digite o numero do funcionario:");
        numerofuncionario = sc.nextInt();
        System.out.println("Digite quantidade de horas trabalhadas:");
        horastrabalhadas = sc.nextInt();
        System.out.println("Digite o valor por hora trabalhada:");
        valorporhora = sc.nextInt();

        double salario = valorporhora * horastrabalhadas;

        System.out.println("Funcionario numero:" + numerofuncionario);
        System.out.printf("Devera receber de salario: %.2f%n" + salario);

        sc.close();
    }
}
