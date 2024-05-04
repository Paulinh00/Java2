package aulas.estrutura_de_repeticao;

import java.util.Scanner;

public class for_para {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i;
        int soma = 0;
        for (i=0; i<n; i++){ //i=i+i
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println(soma);

        sc.close();
    }
}