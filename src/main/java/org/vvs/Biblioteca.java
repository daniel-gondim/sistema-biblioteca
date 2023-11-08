package org.vvs;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros;

    public Biblioteca(ArrayList<Livro> livros) {
        this.livros = new ArrayList<>(livros);
    }
}
