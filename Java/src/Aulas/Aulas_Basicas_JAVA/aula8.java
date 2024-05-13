package Aulas.Aulas_Basicas_JAVA;
import java.util.Scanner;


public class aula8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price = sc.nextDouble();
        double desconto = 0;

        if (price < 200.00){
            desconto = price * 0.1;
        }
        else{
            desconto = 0;
        }

        System.out.println(desconto);

        sc.close();

    }
}