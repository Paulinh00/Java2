package Exercicios.POO.exercicio2_aula60;

public class calculodesalario {
    public String nome;
    public Double salario_base;
    public Double taxa;
    public Double aumento = 0.0;

    double salario_liquido() {
        return salario_base - (salario_base - taxa);
    }

    void aplicarAumento(double percentualAumento) {
        aumento = salario_base * percentualAumento;
    }
}
