package Exercicios.POO.exercicio1_aula60;

public class Retangulo {
    // Atributos
    private double width;
    private double height;

    // Construtor
    public Retangulo(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Métodos
    public double area() {
        return width * height;
    }

    public double perimetro() {
        return 2 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }

    @Override
    public String toString() {
        return String.format("AREA = %.2f\nPERIMETRO = %.2f\nDIAGONAL = %.2f",
                area(), perimetro(), diagonal());
    }
}
