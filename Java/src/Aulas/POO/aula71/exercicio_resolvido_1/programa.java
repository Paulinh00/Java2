package Aulas.POO.aula71.exercicio_resolvido_1;

import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class programa {

    public static final double PI = 3.14159; //se eu quiser posso adicionar a palavra final para falar q o valor e constante e n vai mudar mais
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Entre com o raio:");
        double raio = sc.nextDouble();

        double c = circuferencia(raio);

        double v = volume(raio);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de Pi: %.2f%n", PI);

        sc.close();
    }
}
