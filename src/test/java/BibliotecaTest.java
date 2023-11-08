import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.vvs.Biblioteca;
import org.vvs.Livro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

class BibliotecaTest {
    @Test
    void testAdicionarLivro() {
        List<Livro> livros = new ArrayList<>();
        Biblioteca biblioteca = new Biblioteca(livros);
        Livro livro = new Livro("A revolução dos bichos", "George Orwell", 123456);
        biblioteca.adicionaLivros(livro);
        Assertions.assertTrue(biblioteca.getLivros().contains(livro));
    }

}