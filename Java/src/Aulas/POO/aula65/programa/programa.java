package Aulas.POO.aula65.programa;

import java.util.Locale;
import java.util.Scanner;
import Aulas.POO.aula65.entidades.triangulo;


public class programa {
        public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            triangulo x, y;
            x = new triangulo();
            y = new triangulo();


            System.out.println("Entre com o x:");
            x.a = sc.nextDouble();
            x.b = sc.nextDouble();
            x.c = sc.nextDouble();
            System.out.println("Entre com o Y:");
            y.a = sc.nextDouble();
            y.b = sc.nextDouble();
            y.c = sc.nextDouble();

            double areaX = x.area();
            double areaY = y.area();

            System.out.printf("Tringulo X area %.4f%n", areaX);
            System.out.printf("Tringulo Y area %.4f%n", areaY);


            if (areaX > areaY) {
                System.out.println("Maior area: X ");
            } else {
                System.out.println("Maior area: Y");
            }
            sc.close();
        }
}