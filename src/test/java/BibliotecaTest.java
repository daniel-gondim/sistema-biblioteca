import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.vvs.Biblioteca;
import org.vvs.Livro;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

class BibliotecaTest {
    @Test
    void testAdicionarLivro() {
        List<Livro> livros = null;
        Biblioteca biblioteca = new Biblioteca(null);
        Livro livro = new Livro("A revolução dos bichos", "George Orwell", 123456);
        biblioteca.adicionarLivro(livro);
        //Assertions.assertTrue(biblioteca.contemLivro(livro));
    }

}