package aulas.estrutura_de_repeticao;

import java.util.Scanner;

public class while_enquanto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int soma = 0;
        while (x != 0){
            soma += x; //ou soma = soma + x;  (soma fica acumulando os valores)
            x = sc.nextInt();
        }

        System.out.println("A soma de tudo da:" + soma);

        sc.close();
    }
}
