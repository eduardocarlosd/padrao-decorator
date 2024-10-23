import org.example.HamburguerPadrao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FazerHamburguerTest {

    @Test
    void deveRetornarHamburguerPadrao() {
        // Instanciação correta de HamburguerPadrao
        FazerHamburguer fazerhamburguer = new HamburguerPadrao(1000.0f);

        // Verifica se o preço retornado é igual ao valor esperado
        assertEquals(1000.0f, fazerhamburguer.getPreco(), 0.01);
    }

}
