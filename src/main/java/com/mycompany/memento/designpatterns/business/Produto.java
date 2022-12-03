package com.mycompany.memento.designpatterns.business;

/**
 *
 * @author clayton
 */
public class Produto {

    private String nome;
    private double custo;
    private double preco;

    public Produto(String nome, double custo, double preco) {
        this.nome = nome;
        this.custo = custo;
        this.preco = preco;
    }

    public Produto() {
    }

    public MementoProduto getMemento() {
        return new MementoProduto(nome, custo, preco);
    }

    public void restaurar(MementoProduto memento) {
        this.nome = memento.getNome();
        this.custo = memento.getCusto();
        this.preco = memento.getPreco();
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Produto{" + "nome=" + nome + ", custo=" + custo + ", preco=" + preco + '}';
    }
}
