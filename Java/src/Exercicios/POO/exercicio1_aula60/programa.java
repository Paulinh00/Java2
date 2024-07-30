package Exercicios.POO.exercicio1_aula60;

import java.util.Locale;
import java.util.Scanner;

public class programa {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Leitura dos valores de largura e altura
        System.out.print("Entre com largura:\n");
        double width = sc.nextDouble();
        System.out.print("Entre com altura:\n");
        double height = sc.nextDouble();

        // Criando o objeto
        Retangulo retangulo = new Retangulo(width, height);

        System.out.println(retangulo);

        sc.close();
    }
}
