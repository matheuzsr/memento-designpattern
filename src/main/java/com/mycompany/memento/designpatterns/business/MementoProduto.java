package com.mycompany.memento.designpatterns.business;

/**
 *
 * @author clayton
 */
public class MementoProduto {

    private String nome;
    private double custo;
    private double preco;

    MementoProduto(String nome, double custo, double preco) {
        this.nome = nome;
        this.custo = custo;
        this.preco = preco;
    }

    MementoProduto() {
    }

    double getCusto() {
        return custo;
    }

    String getNome() {
        return nome;
    }

    double getPreco() {
        return preco;
    }
}
