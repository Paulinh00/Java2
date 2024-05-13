package Aulas.Aulas_Basicas_JAVA;

import java.util.Locale;

public class aula2 {
    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "Mesa de Trabalho";

        int age = 30;
        int code = 5290;
        char gender = 'f';

        double prince1 = 2100.0;
        double prince2 = 650.50;
        double measure = 53.234567;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("produto:");
        System.out.printf("%s, tem o seu valor em R$ %.2f reais\n", produto1, prince1);
        System.out.printf("%s, tem o seu valor em R$ %.2f reais\n", produto2, prince2);

        System.out.printf("Recorde: %s anos atras, codigo: %d e genero: %s\n", age, code, gender);

        System.out.printf("Medida com 8 casas decimais: %.8f\n", measure);
        System.out.printf("Rouded (3 casas decimais): %.3f Pontos\n", measure);
        System.out.printf("Rouded (3 casas decimais): %.3f Pontos\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("Decimal dos Estados Unidos: %.5f Pontos\n", measure);




    }
}
