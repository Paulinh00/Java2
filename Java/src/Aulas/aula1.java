package Aulas;

import java.util.Locale;
public class aula1 {
    public static void main(String[] args) {
        int y = 32;
        double x = 10.35784;
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Bom dia");
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x );
        System.out.printf("%.4f%n", x );
        Locale.setDefault(Locale.US); //Mudar a linguagem para ao inves de virgular ser usado ponto
        System.out.printf("%.4f%n", x );
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f METROS\n", x);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        String nome = "Maria";
        int idade = 31;
        double renda = 4000;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
    }
}