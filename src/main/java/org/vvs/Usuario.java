package org.vvs;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private static int contadorId = 0;
    private int id;
    private String nome;
    private List<Livro> livrosEmprestados;

    public Usuario(String nome) {
        this.id = ++contadorId;
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

}


