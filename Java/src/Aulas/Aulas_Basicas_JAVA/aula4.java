package Aulas.Aulas_Basicas_JAVA;

import java.util.Locale;
import java.util.Scanner;

public class aula4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String x;   //Dependendo mude para string, int , double , float , char
        int y;      //Dependendo mude para string, int , double , float , char
        double z;   //Dependendo mude para string, int , double , float , char

        System.out.println("Digite um numero:");
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble(); // Lê um valor double do usuário/Dependendo mude para string, int , double , float , char

        System.out.println("Voce digitou:" + x);
        System.out.println("Voce digitou:" + y);
        System.out.println("Voce digitou:" + z);

        sc.close();
    }
}
