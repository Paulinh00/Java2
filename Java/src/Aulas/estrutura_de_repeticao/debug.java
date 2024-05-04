package aulas.estrutura_de_repeticao;

import java.util.Locale;
import java.util.Scanner;
//rode o codigo com debug q ele vai rodar de pouco em pouco depois da marcacao vermelha ele vai mostrar passo a passo oq acontece no programa
public class debug {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);

        sc.close();
    }
}
