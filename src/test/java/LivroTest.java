import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class LivroTest {

    @Test
    void testaSeClasseLivroExiste() {
        try {
            Class.forName("caminho.para.a.classe.Livro");
        } catch (ClassNotFoundException e) {
            fail("A classe Livro não existe.");
        }
    }
}
