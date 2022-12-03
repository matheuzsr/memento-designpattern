package com.mycompany.memento.designpatterns;

import com.mycompany.memento.designpatterns.business.MementoProduto;
import java.util.ArrayList;

public class Zelador {

    private static Zelador instance;
    private final int QTD_DESFAZER = 5;

    protected static ArrayList<MementoProduto> estados = new ArrayList<>();
    private int idUltimoPossivelDesfazer = 0;
    private int currentMemento = 0;

    private Zelador() {
    }

    public static Zelador getInstance() {
        if (instance == null) {
            instance = new Zelador();
        }

        return instance;
    }

    public void adicionarMemento(MementoProduto memento) {
        estados.add(memento);

        idUltimoPossivelDesfazer = estados.size() - QTD_DESFAZER;
        currentMemento = estados.size() - 1;
    }

    public MementoProduto desfazer() {
        this.emptyStatesValidade();
        this.validateHandler(currentMemento < idUltimoPossivelDesfazer, "Você só pode desfazer " + QTD_DESFAZER + " vezes");

        MementoProduto estadoSalvo = estados.get(currentMemento - 1);
        currentMemento--;

        return estadoSalvo;
    }

    public MementoProduto refazer() {
        this.emptyStatesValidade();
        this.validateHandler(currentMemento >= estados.size(), "Não há mais itens para serem refeitos");

        MementoProduto estadoSalvo = estados.get(currentMemento + 1);
        currentMemento++;

        return estadoSalvo;
    }

    private void emptyStatesValidade() {
        this.validateHandler(estados.size() <= 0, "Não há estados salvos");
    }

    private void validateHandler(boolean condition, String message) {
        if (condition) {
            throw new RuntimeException(message);
        }
    }

}
