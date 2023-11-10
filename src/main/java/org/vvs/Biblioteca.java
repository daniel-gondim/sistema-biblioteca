package org.vvs;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros;

    public Biblioteca(List<Livro> livros) {
        this.livros = new ArrayList<>();
    }

    public void adicionaLivros(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> buscaLivroPeloTitulo(String titulo) {
        List<Livro> livrosEncontrados = new ArrayList<>();

        for (Livro livro : livros) {
            if (livro.getTítulo().equalsIgnoreCase(titulo) && !livro.isEmprestado()){
                livrosEncontrados.add(livro);
            }
        }

        return livrosEncontrados;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public boolean emprestaLivro(Usuario usuario, Livro livro) {
        return true;
    }
}
