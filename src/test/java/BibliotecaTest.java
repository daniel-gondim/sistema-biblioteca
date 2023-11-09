import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.vvs.Biblioteca;
import org.vvs.Livro;

import java.util.ArrayList;
import java.util.List;

class BibliotecaTest {
    @Test
    void testAdicionarLivro() {
        List<Livro> livros = new ArrayList<>();
        Biblioteca biblioteca = new Biblioteca(livros);
        Livro livro = new Livro("A revolução dos bichos", "George Orwell", 123456, false);
        biblioteca.adicionaLivros(livro);
        Assertions.assertTrue(biblioteca.getLivros().contains(livro));
    }

    @Test
    void testBuscaLivroPorTituloSeLivroNãoEstáEmprestado() {

        List<Livro> livros = new ArrayList<>();
        Biblioteca biblioteca = new Biblioteca(livros);

        // Cria livros com o mesmo título, mas um deles está emprestado
        Livro livro1 = new Livro("A Revolução dos Bichos", "George Orwell", 123456, false);
        Livro livro2 = new Livro("A Revolução dos Bichos", "George Orwell", 123456, true);
        Livro livro3 = new Livro("A Revolução dos Bichos", "George Orwell", 123456, false);
        biblioteca.adicionaLivros(livro1);
        biblioteca.adicionaLivros(livro2);
        biblioteca.adicionaLivros(livro3);

        List<Livro> livrosEncontrados = biblioteca.buscaLivroPeloTitulo("A Revolução dos Bichos");
        // garante que apenas os livros que não estão emprestados são retornados
        Assertions.assertEquals(2, livrosEncontrados.size());
        Assertions.assertTrue(livrosEncontrados.contains(livro1));
    }

    @Test
    void testEmprestimoDeLivroBemSucedido() {
        Usuario usuario = new Usuario("João");
        Livro livro = new Livro("A Revolução dos Bichos", "George Orwell", 123456, false);
        Biblioteca biblioteca = new Biblioteca(new ArrayList<>());

        boolean emprestimoRealizado = biblioteca.emprestaLivro(usuario, livro);

        Assertions.assertTrue(emprestimoRealizado);
        Assertions.assertTrue(livro.isEmprestado());
    }



}