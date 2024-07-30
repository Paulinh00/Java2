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


        System.out.println();
        System.out.println("Produtos data: " + produtos);

        System.out.println();
        System.out.printf("Entre com o numero de produtos que quer adicionar ao estoque:");
        int quantidade = sc.nextInt();
        produtos.addProducts(quantidade);

        System.out.println();
        System.out.println("Produtos  data atualizados: " + produtos);

        System.out.println();
        System.out.printf("Entre com o numero de produtos que quer remover do estoque:");
        quantidade = sc.nextInt();
        produtos.removeProducts(quantidade);

        System.out.println();
        System.out.println("Produtos  data atualizados: " + produtos);


        sc.close();
    }
}
