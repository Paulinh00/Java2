package Aulas.Aulas_Basicas_JAVA;

public class aula7 {
    public static void main(String[] args) {
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println("Desconto: " + desconto);
    }
}
