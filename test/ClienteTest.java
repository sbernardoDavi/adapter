import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void deveRetornarProdutoCliente(){
        Cliente cliente = new Cliente();
        cliente.setVenda("Acessório");

        assertEquals("Acessório", cliente.getVenda());
    }

    @Test
    public void deveRetornarValorCliente(){
        Cliente cliente = new Cliente();
        cliente.setVenda("Acessório");

        assertEquals(1.99f, cliente.getValor());
    }

}