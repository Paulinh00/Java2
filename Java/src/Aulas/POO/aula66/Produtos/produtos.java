package Aulas.POO.aula66.Produtos;

public class produtos {
    public String name;
    public double preco;
    public int quantidade;

    public double totalValueInStock() {
        return preco + quantidade;
    }

    public void addProducts(int quantidade){
        this.quantidade += quantidade;
    }

    public void removeProducts(int quantidade){
        this.quantidade -= quantidade;
    }


}