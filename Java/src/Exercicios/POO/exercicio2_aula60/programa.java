package Exercicios.POO.exercicio2_aula60;

import java.util.Locale;
import java.util.Scanner;
import Exercicios.POO.exercicio2_aula60.calculodesalario;


public class programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        calculodesalario calculodesalario = new calculodesalario();
        System.out.println("Nome do funcionario:");
        calculodesalario.nome = sc.nextLine();
        System.out.println("Quantidade de salario funcionario:");
        calculodesalario.salario_base = sc.nextDouble();
        System.out.println("Quantidade de taxa cobrada:");
        calculodesalario.taxa = sc.nextDouble();

        System.out.println("Data base:");
        System.out.println(" Funcionario: " + calculodesalario.nome + " Recebe: " + calculodesalario.salario_liquido());

        System.out.println("Deseja adicionar alguma porcentagem de almento? s/n");
        char p = sc.next().charAt(0);

        if (p == 's'){
            System.out.println("Quanto seria o almento:");
            double percentualAumento = sc.nextDouble();
            calculodesalario.aplicarAumento(percentualAumento);
        }else {
            System.out.println("Fim do programa");
        }

        System.out.println("Salario:" + calculodesalario.salario_liquido());









        sc.close();
    }
}
