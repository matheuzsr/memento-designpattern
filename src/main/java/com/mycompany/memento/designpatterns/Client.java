package com.mycompany.memento.designpatterns;

import com.mycompany.memento.designpatterns.business.Produto;

public class Client {

    public static void main(String[] args) {
        Zelador zelador = Zelador.getInstance();

        Produto p1 = new Produto("Coca Cola", 10.0, 4.60);

        //Do!
        System.out.println("\nFazendo...");
        p1.setCusto(20.0);
        zelador.adicionarMemento(p1.getMemento());

        p1.setCusto(21.0);
        zelador.adicionarMemento(p1.getMemento());
        p1.setCusto(22.0);
        zelador.adicionarMemento(p1.getMemento());
        p1.setCusto(23.0);
        zelador.adicionarMemento(p1.getMemento());
        p1.setCusto(24.0);
        zelador.adicionarMemento(p1.getMemento());
        p1.setCusto(25.0);
        zelador.adicionarMemento(p1.getMemento());
        System.out.println(p1);

        //Undo!
        System.out.println("\nDesfazendo...");
        p1.restaurar(zelador.desfazer());
        p1.restaurar(zelador.desfazer());
        p1.restaurar(zelador.desfazer());
        p1.restaurar(zelador.desfazer());
        p1.restaurar(zelador.desfazer());
        System.out.println(p1);

        //Redo!
        System.out.println("\nRefazendo...");
        p1.restaurar(zelador.refazer());
        p1.restaurar(zelador.refazer());
        p1.restaurar(zelador.refazer());
        p1.restaurar(zelador.refazer());
        p1.restaurar(zelador.refazer());
        System.out.println(p1);
    }
}
