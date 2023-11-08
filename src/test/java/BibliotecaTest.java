import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.vvs.Biblioteca;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

class BibliotecaTest {
    @Test
    void testAdicionarLivro() {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro = new Livro("A Revolução dos Bichos", "George Orwell");
        biblioteca.adicionarLivro(livro);
        //Assertions.assertTrue(biblioteca.contemLivro(livro));
    }

}