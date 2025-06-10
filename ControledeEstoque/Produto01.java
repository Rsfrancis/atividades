package ControledeEstoque;

public class Produto01 {
    private String nome;
    private int qtdEstoque;
    private double precoUnitario;
    private String categoria;
    private int qtdMinima;

    public Produto01(String nome, int qtdEstoque, double precoUnitario, String categoria, int qtdMinima) {
        this.nome = nome;
        this.qtdEstoque = qtdEstoque;
        this.precoUnitario = precoUnitario;
        this.categoria = categoria;
        this.qtdMinima = qtdMinima;
    }

    public String getNome() { return nome; }
    public int getQtdEstoque() { return qtdEstoque; }
    public double getPrecoUnitario() { return precoUnitario; }
    public String getCategoria() { return categoria; }
    public int getQtdMinima() { return qtdMinima; }

    public double getSubtotal() {
        return qtdEstoque * precoUnitario;
    }

    public String toString() {
        return nome + " - " + qtdEstoque + " - R$" + String.format("%.2f", precoUnitario);
    }
}
