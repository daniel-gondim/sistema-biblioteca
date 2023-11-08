package org.vvs;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros;

    public Biblioteca(List<Livro> livros) {
        this.livros = livros;
    }

    public void adicionaLivros(Livro livro) {
        livros.add(livro);
    }
}
