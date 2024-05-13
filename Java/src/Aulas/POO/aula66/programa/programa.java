package Aulas.POO.aula66.programa;

import java.util.Locale;
import java.util.Scanner;
import Aulas.POO.aula66.Produtos.produtos;

public class programa {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        produtos produtos = new produtos();
        System.out.println("Entre produto:");
        System.out.print("Name: ");
        produtos.name = sc.nextLine();
        System.out.print("Preco: ");
        produtos.preco = sc.nextDouble();
        System.out.print("Qual a quantidade no stock: ");
        produtos.quantidade = sc.nextInt();

        System.out.println(produtos.name + "," + produtos.preco + "," + produtos.quantidade);



        sc.close();
    }
}
