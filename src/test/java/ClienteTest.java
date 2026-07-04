import model.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClienteTest {
    Cliente cliente;
    Cliente cliente2;

    @BeforeEach
    void setUp (){
        cliente = new Cliente("Edinor", "85996356026");
        cliente2 = new Cliente("Edinor", "85996356026");
    }

    @Test
    void adicionarCliente() {
        String nome = cliente.getNome();
        assertEquals("Edinor", nome);
    }

    @Test
    void testarTelefone() {
        String telefone = cliente.getTelefone();
        assertEquals("85996356026", telefone);
    }

    @Test
    void igual(){

        assertTrue(cliente.equals(cliente2));
    }


}
